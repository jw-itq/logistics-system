package com.logistics.demo;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PinyinTest {

    /**
     * 本来是用于插入数据库里面拼音的测试，然后变成了我现在从数据库里面导出为json数据的测试类了
     * @throws IOException
     */
    @Test
    public void Test() throws IOException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {

            File file =new File("/home/IDEA/logistics-system/logistics-backdemo/src/test/java/com/logistics/demo/test.js");
            FileOutputStream fos = null;
            if(!file.exists()){ file.createNewFile();//如果文件不存在，就创建该文件
                fos = new FileOutputStream(file);//首次写入获取
            }else{ //如果文件已存在，那么就在文件末尾追加写入
                fos = new FileOutputStream(file,true);//这里构造方法多了一个参数true,表示在文件末尾追加写入
            }
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/logistics?characterEncoding=utf8&useSSL=false","root","123456");
            String sql = "select * from area where level!=4 and pinyin!=\"\" group by pinyin";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            List<RegionTest> result = new ArrayList<>();
            RegionTest region = new RegionTest();
            List<Map<String,String>> appendlist = new ArrayList<>();
            String flag = "A";

            while (resultSet.next()){

                //添加热门城市
                if(resultSet.getString("pinyin").substring(0,1).equals(flag)){
                    region.setName(resultSet.getString("pinyin").substring(0,1));
                    Map<String,String> map = new HashMap<>();
                    map.put("id",resultSet.getString("id"));
                    map.put("cityname",resultSet.getString("area_name"));
                    appendlist.add(map);
                }else{
                    flag = resultSet.getString("pinyin").substring(0,1);
                    region.setCitys(appendlist);
                    result.add(region);
                    region = new RegionTest();
                    appendlist = new ArrayList<>();

                    region.setName(resultSet.getString("pinyin").substring(0,1));
                    Map<String,String> map = new HashMap<>();
                    map.put("id",resultSet.getString("id"));
                    map.put("cityname",resultSet.getString("area_name"));
                    appendlist.add(map);
                }

            }

            //把最后一组Z给复制进来
            region.setCitys(appendlist);
            result.add(region);


            String json = JSON.toJSONString(result);
            out.write(json);
            out.close();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }




       /* File file =new File("/home/IDEA/logistics-system/logistics-backdemo/src/test/java/com/logistics/demo/test.js");
        Writer out =new FileWriter(file);

        List<RegionTest> result = new ArrayList<>();

        RegionTest regionTest = new RegionTest();
        regionTest.setName("A");
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("id","1");
        map.put("cityname","北京");

        Map<String,String> map1 = new HashMap<>();
        map1.put("id","2");
        map1.put("cityname","天井");

        list.add(map);
        list.add(map1);
        regionTest.setCity(list);

        result.add(regionTest);

        RegionTest regionTest1 = new RegionTest();
        regionTest1.setName("A");
        List<Map<String,String>> list1 = new ArrayList<>();
        Map<String,String> map12 = new HashMap<>();
        map12.put("id","1");
        map12.put("cityname","北京");

        Map<String,String> map11 = new HashMap<>();
        map11.put("id","2");
        map11.put("cityname","天井");

        list1.add(map12);
        list1.add(map11);
        regionTest1.setCity(list1);

        result.add(regionTest1);

        String json = JSON.toJSONString(result);
        String data="888";
        out.write(json);
        out.close();*/

    }
}
