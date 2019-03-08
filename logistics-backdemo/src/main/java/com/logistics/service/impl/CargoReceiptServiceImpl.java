package com.logistics.service.impl;

import com.logistics.dao.mapper.*;
import com.logistics.pojo.*;
import com.logistics.service.CargoReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service(value = "cargoReceiptService")
@Transactional(propagation = Propagation.REQUIRED)
public class CargoReceiptServiceImpl implements CargoReceiptService {

    @Autowired
    private CargoreceiptdetailMapper cargoreceiptdetailMapper;

    @Autowired
    private CargoreceiptMapper cargoreceiptMapper;

    @Autowired
    private GoodsbillMapper goodsbillMapper;

    @Autowired
    private RouteinfoMapper routeinfoMapper;

    @Autowired
    private BillinfoMapper billinfoMapper;

    /**
     * 查询未被安排的货运单的编号，也就是没有在货运单详细表中的货运单号
     * @return
     */
    @Override
    public List<?> selectLeftCodes() {

        CargoreceiptExample cargoreceiptExample = new CargoreceiptExample();
        List<Cargoreceipt> cargoreceipts = cargoreceiptMapper.selectByExample(cargoreceiptExample);

        CargoreceiptdetailExample cargoreceiptdetailExample = new CargoreceiptdetailExample();
        List<Cargoreceiptdetail> cargoreceiptdetails = cargoreceiptdetailMapper.selectByExample(cargoreceiptdetailExample);

        List<String> billId = new ArrayList<>();
        for(Cargoreceipt car : cargoreceipts){
            billId.add(car.getGoodsRevertBillCode());
        }

        List<String> result = new ArrayList<>();
        for(Cargoreceiptdetail c : cargoreceiptdetails){
            if(result.contains(c.getGoodsRevertBillId())){
                continue;
            }
            result.add(c.getGoodsRevertBillId());
        }
        return result;
    }

    /**
     * 根据上面的那个方法选择之后回得到一个HZ编号，根据这个编号查找对应的货运单
     * @param receiptCode 用户选择的HZ编号
     * @return
     */
    @Override
    public Goodsbill findGoodsBill(String receiptCode) {
        Cargoreceiptdetail cargoreceiptdetail = cargoreceiptdetailMapper.selectByPrimaryKey(receiptCode);
        String goodsBillCode = cargoreceiptdetail.getGoodsBillDetailId();
        Goodsbill goodsbill = goodsbillMapper.selectByPrimaryKey(goodsBillCode);
        return goodsbill;
    }

    /**
     * 保存货运单主表
     * 更新货运单中的中转地和中转费用
     * @param cargoreceipt 货运单信息
     * @return
     */
    @Override
    public String add(int routeInfoId,Cargoreceipt cargoreceipt) {

        try {
            //1，保存货运回执单cargoreceipt
            cargoreceiptMapper.insert(cargoreceipt);
            //2，更新货运单中的中转费用和中转地goodsbill
            Routeinfo routeinfo = routeinfoMapper.selectByPrimaryKey(routeInfoId);

            Cargoreceiptdetail cargoreceiptdetail = cargoreceiptdetailMapper.selectByPrimaryKey(cargoreceipt.getGoodsRevertBillCode());

            Goodsbill goodsbill = goodsbillMapper.selectByPrimaryKey(cargoreceiptdetail.getGoodsBillDetailId());
            double transfer_fee = routeinfo.getFetchTime()*1.34;
            goodsbill.setTransferFee(transfer_fee);
            goodsbill.setTransferStation(routeinfo.getPassStation());
            goodsbillMapper.updateByPrimaryKey(goodsbill);

            //3，保存一份单据明细表，这里叫“货运回执表”
            Billinfo billinfo = new Billinfo();
            billinfo.setBillType("货运回执表");
            billinfo.setAcceptStation(cargoreceipt.getAcceptStation());
            billinfo.setBillCode(cargoreceipt.getGoodsRevertBillCode());
            billinfo.setBillState("已填");
            billinfo.setWriteDate(new Date());
            System.out.println(billinfo.toString());
            billinfoMapper.insert(billinfo);
            return "SUCCESS";
        }catch (Exception e){
            e.printStackTrace();
            return "ERROR";
        }
    }
}
