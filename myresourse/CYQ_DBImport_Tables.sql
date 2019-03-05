CREATE TABLE [billinfo] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [accept_station] varchar(50) NULL,
    [bill_code] varchar(50) NULL,
    [bill_state] varchar(50) NULL,
    [bill_type] varchar(50) NULL,
    [write_date] datetime NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'billinfo';

CREATE TABLE [billrelease] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [accept_station] varchar(50) NULL,
    [bill_code] varchar(50) NULL,
    [bill_type] varchar(50) NULL,
    [receive_bill_person] varchar(50) NULL,
    [receive_bill_time] datetime NULL,
    [release_person] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'billrelease';

CREATE TABLE [callbackinfo] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [bill_id] varchar(50) NULL,
    [bill_type] varchar(50) NULL,
    [content] varchar(255) NULL,
    [dial_no] varchar(50) NULL,
    [finally_dial_time] datetime NULL,
    [goods_bill_id] varchar(50) NULL,
    [locked] bit NOT NULL,
    [success] bit NOT NULL,
    [type] varchar(50) NULL,
    [write_time] datetime NULL,
    [writer] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'callbackinfo';

CREATE TABLE [carcost] 
(
    [driver_code] varchar(50) NOT NULL,
    [add_carriage_total] Real NOT NULL,
    [allow_carry_weight] Real NULL,
    [back_bill_code] varchar(255) NULL,
    [balance_time] datetime NULL,
    [car_no] varchar(50) NULL,
    [car_type] varchar(50) NULL,
    [car_width] varchar(255) NULL,
    [carry_fee_total] Real NOT NULL,
    [deal_goods_station] varchar(50) NULL,
    [fact_carriage_total] Real NOT NULL,
    [goods_height] varchar(50) NULL,
    [load_station] varchar(50) NULL,
    PRIMARY KEY ([driver_code]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'carcost';

CREATE TABLE [cargoerror] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [customer] varchar(50) NULL,
    [goods_bill_code] varchar(50) NULL,
    [goods_name] varchar(50) NULL,
    [goods_revert_bill_code] varchar(50) NULL,
    [goods_value] Real NULL,
    [mistake_type] varchar(50) NULL,
    [piece_amount] int NULL,
    [size] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'cargoerror';

CREATE TABLE [cargoreceipt] 
(
    [goods_revert_bill_code] varchar(50) NOT NULL,
    [accept_station] varchar(50) NULL,
    [all_carriage] Real NOT NULL,
    [arrive_time] datetime NULL,
    [back_bill_state] varchar(50) NULL,
    [carriage_banlance_mode] varchar(50) NULL,
    [carriage_mode] varchar(50) NULL,
    [carry_goods_bill_deposit] Real NOT NULL,
    [carry_goods_insurance] Real NOT NULL,
    [deal_goods_station] varchar(50) NULL,
    [dispatch_service_fee] Real NOT NULL,
    [driver_id] varchar(50) NULL,
    [if_balance] varchar(50) NULL,
    [insurance] Real NOT NULL,
    [linkman_phone] varchar(50) NULL,
    [load_station] varchar(50) NULL,
    [receive_goods_detail_addr] varchar(50) NULL,
    [receive_goods_linkman] varchar(50) NULL,
    [remark] varchar(50) NULL,
    [sign_time] datetime NULL,
    [start_advance] Real NOT NULL,
    [start_carry_time] datetime NULL,
    PRIMARY KEY ([goods_revert_bill_code]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'cargoreceipt';

CREATE TABLE [cargoreceiptdetail] 
(
    [goods_revert_bill_id] varchar(50) NOT NULL,
    [goods_bill_detail_id] varchar(255) NULL,
    [goods_value] Real NOT NULL,
    [piece_amount] int NOT NULL,
    [price_mode] varchar(50) NOT NULL,
    [price_standard] varchar(50) NOT NULL,
    [volume] Real NOT NULL,
    [weight] Real NOT NULL,
    PRIMARY KEY ([goods_revert_bill_id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'cargoreceiptdetail';

CREATE TABLE [cityexpand] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [city_id] int NOT NULL,
    [range_city] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'cityexpand';

CREATE TABLE [compensationinfo] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [amends] Real NOT NULL,
    [amends_time] datetime NULL,
    [bad_destroy_goods] Real NOT NULL,
    [customer] varchar(50) NULL,
    [receive_station_id] int NOT NULL,
    [receive_station_name] varchar(50) NULL,
    [remark] varchar(255) NULL,
    [write_date] datetime NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'compensationinfo';

CREATE TABLE [complaintinfo] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [appeal_content] varchar(50) NULL,
    [appeal_date] varchar(50) NULL,
    [call_back_date] varchar(50) NULL,
    [customer] varchar(50) NULL,
    [deal_date] varchar(50) NULL,
    [deal_person] varchar(50) NULL,
    [deal_result] varchar(50) NULL,
    [goods_bill_code] varchar(50) NULL,
    [if_callback] bit NULL,
    [if_handle] bit NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'complaintinfo';

CREATE TABLE [contactsservice] 
(
    [send_goods_customer] varchar(50) NOT NULL,
    [balance] Real NOT NULL,
    [bill_money] Real NOT NULL,
    [carriage] Real NOT NULL,
    [goods_bill_code] varchar(50) NULL,
    [insurance] Real NOT NULL,
    [money_receivable] Real NOT NULL,
    [receive_goods_addr] varchar(50) NULL,
    [received_money] Real NOT NULL,
    [send_goods_addr] varchar(50) NULL,
    [send_goods_date] datetime NULL,
    PRIMARY KEY ([send_goods_customer]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'contactsservice';

CREATE TABLE [customeramount] 
(
    [send_goods_customer] varchar(50) NOT NULL,
    [carriage_total] Real NOT NULL,
    [insurance_total] Real NOT NULL,
    [piece_amount_total] int NOT NULL,
    PRIMARY KEY ([send_goods_customer]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'customeramount';

CREATE TABLE [customerbillclear] 
(
    [goods_bill_code] varchar(50) NOT NULL,
    [customer_code] varchar(255) NULL,
    [balance] Real NULL,
    [balance_time] datetime NULL,
    [balance_type] varchar(50) NULL,
    [bill_money] Real NULL,
    [carriage_reduce_fund] Real NULL,
    [carry_goods_fee] Real NULL,
    [insurance] Real NULL,
    [money_receivable] Real NULL,
    [pay_kickback] Real NULL,
    [prepay_money] Real NULL,
    [received_money] Real NULL,
    PRIMARY KEY ([goods_bill_code]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'customerbillclear';

CREATE TABLE [customerinfo] 
(
    [customer_code] varchar(50) NOT NULL,
    [address] varchar(50) NULL,
    [customer] varchar(50) NULL,
    [customer_type] varchar(50) NULL,
    [email] varchar(50) NULL,
    [enterprise_property] varchar(50) NULL,
    [enterprise_size] varchar(50) NULL,
    [fax] varchar(50) NULL,
    [linkman] varchar(50) NULL,
    [linkman_mobile] varchar(50) NULL,
    [phone] varchar(50) NULL,
    [post_code] varchar(50) NULL,
    PRIMARY KEY ([customer_code]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'customerinfo';

CREATE TABLE [customerreceiptinfo] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [carry_bill_event_id] int NOT NULL,
    [check_goods_record] varchar(50) NULL,
    [customer] varchar(50) NULL,
    [goods_bill_code] varchar(50) NULL,
    [receive_goods_date] datetime NULL,
    [receive_goods_person] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'customerreceiptinfo';

CREATE TABLE [driveramount] 
(
    [driver_code] varchar(50) NOT NULL,
    [add_carriage_total] Real NOT NULL,
    [carry_fee_total] Real NOT NULL,
    [total] Real NOT NULL,
    PRIMARY KEY ([driver_code]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'driveramount';

CREATE TABLE [driverclear] 
(
    [back_bill_code] varchar(50) NOT NULL,
    [add_carriage] Real NULL,
    [balance] Real NULL,
    [balance_time] datetime NULL,
    [balance_type] varchar(50) NULL,
    [bind_insurance] Real NULL,
    [carry_fee] Real NULL,
    [dispatch_service_fee] Real NULL,
    [driver_code] varchar(50) NULL,
    [insurance] Real NULL,
    [need_payment] Real NULL,
    [payed_money] Real NULL,
    [prepay_money] Real NULL,
    PRIMARY KEY ([back_bill_code]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'driverclear';

CREATE TABLE [driverinfo] 
(
    [id] varchar(50) NOT NULL,
    [address] varchar(50) NULL,
    [allow_carry_volume] Real NULL,
    [allow_carry_weight] Real NULL,
    [birthday] datetime NULL,
    [biz_licence] varchar(50) NULL,
    [car_dept] varchar(50) NULL,
    [car_dept_tel] varchar(50) NULL,
    [car_frame_no] varchar(50) NULL,
    [car_length] varchar(50) NULL,
    [car_no] varchar(50) NULL,
    [car_type] varchar(50) NULL,
    [car_width] varchar(50) NULL,
    [company_car] bit NOT NULL,
    [drive_licence] varchar(50) NULL,
    [driver_name] varchar(50) NULL,
    [engine_no] varchar(50) NULL,
    [gender] varchar(50) NULL,
    [goods_height] varchar(50) NULL,
    [id_card] varchar(50) NULL,
    [insurance_card] varchar(50) NULL,
    [phone] varchar(50) NULL,
    [remark] varchar(50) NULL,
    [run_licence] varchar(50) NULL,
    [state] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'driverinfo';

CREATE TABLE [employee] 
(
    [employee_code] varchar(50) NOT NULL,
    [birthday] datetime NULL,
    [department] varchar(50) NULL,
    [employee_name] varchar(50) NULL,
    [gender] varchar(50) NULL,
    [position] varchar(50) NULL,
    PRIMARY KEY ([employee_code]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'employee';

CREATE TABLE [employeeuser] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [employee_id] int NOT NULL,
    [user_id] int NOT NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'employeeuser';

CREATE TABLE [employeewage] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [allowance] Real NOT NULL,
    [basic_wage] Real NOT NULL,
    [date] datetime NULL,
    [employee] varchar(50) NULL,
    [employee_code] varchar(50) NOT NULL,
    [station_wage] Real NOT NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'employeewage';

CREATE TABLE [extraclear] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [balance_date] datetime NULL,
    [balance_money] Real NULL,
    [balance_type] varchar(50) NULL,
    [remark] varchar(50) NULL,
    [subject_name] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'extraclear';

CREATE TABLE [extraincome] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [income_month] varchar(255) NULL,
    [money] Real NOT NULL,
    [name] varchar(50) NULL,
    [write_date] datetime NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'extraincome';

CREATE TABLE [financefee] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [fee] Real NOT NULL,
    [payout_month] varchar(255) NULL,
    [write_date] datetime NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'financefee';

CREATE TABLE [function_] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [page_function] varchar(50) NULL,
    [page_name] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'function_';

CREATE TABLE [functionwithgroup] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [function_id] int NOT NULL,
    [group_id] int NOT NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'functionwithgroup';

CREATE TABLE [goodsbill] 
(
    [goods_bill_code] varchar(50) NOT NULL,
    [accept_procedure_rate] varchar(50) NULL,
    [accept_station] varchar(100) NULL,
    [carriage] Real NULL,
    [carry_goods_fee] Real NULL,
    [employee_code] varchar(50) NULL,
    [fact_deal_date] datetime NULL,
    [fetch_goods_mode] varchar(50) NULL,
    [help_accept_payment] Real NULL,
    [if_audit] bit NULL,
    [if_settle_accounts] bit NULL,
    [insurance] Real NULL,
    [money_of_change_pay] Real NULL,
    [pay_kickback] Real NULL,
    [pay_mode] varchar(50) NULL,
    [predelivery_date] datetime NULL,
    [receive_goods_addr] varchar(50) NULL,
    [receive_goods_customer] varchar(50) NULL,
    [receive_goods_customer_addr] varchar(50) NULL,
    [receive_goods_customer_code] varchar(50) NULL,
    [receive_goods_customer_tel] varchar(50) NULL,
    [reduce_fund] Real NULL,
    [remark] varchar(50) NULL,
    [send_goods_addr] varchar(50) NULL,
    [send_goods_customer] varchar(50) NULL,
    [send_goods_customer_addr] varchar(50) NULL,
    [send_goods_customer_no] varchar(50) NULL,
    [send_goods_customer_tel] varchar(50) NULL,
    [send_goods_date] datetime NULL,
    [transfer_fee] Real NULL,
    [transfer_station] varchar(50) NULL,
    [validity] bit NULL,
    [write_bill_person] varchar(50) NULL,
    [write_date] datetime NULL,
    PRIMARY KEY ([goods_bill_code]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'goodsbill';

CREATE TABLE [goodsbillevent] 
(
    [goods_bill_id] varchar(50) NOT NULL,
    [event_name] varchar(50) NOT NULL,
    [occur_time] datetime NULL,
    [remark] varchar(50) NOT NULL,
    PRIMARY KEY ([goods_bill_id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'goodsbillevent';

CREATE TABLE [goodsreceiptinfo] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [check_goods_record] varchar(50) NULL,
    [driver_name] varchar(50) NULL,
    [goods_revert_code] varchar(50) NULL,
    [rceive_goods_date] datetime NULL,
    [receive_goods_person] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'goodsreceiptinfo';

CREATE TABLE [incomemonthlytemp] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [biz_fee] Real NOT NULL,
    [biz_income] Real NOT NULL,
    [car_carriage] Real NOT NULL,
    [carriage_money] Real NOT NULL,
    [convey_wage] Real NOT NULL,
    [finance_fee] Real NOT NULL,
    [house_rent] Real NOT NULL,
    [income] Real NOT NULL,
    [insurance_money] Real NOT NULL,
    [manage_fee] Real NOT NULL,
    [month] varchar(255) NULL,
    [office_fee] Real NOT NULL,
    [other] Real NOT NULL,
    [payout] Real NOT NULL,
    [phone_fee] Real NOT NULL,
    [profit] Real NOT NULL,
    [unbiz_income] Real NOT NULL,
    [wage] Real NOT NULL,
    [water_elec_fee] Real NOT NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'incomemonthlytemp';

CREATE TABLE [lineoverall] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [all_carriage_total] Real NOT NULL,
    [deal_goods_station] varchar(50) NULL,
    [insurance_total] Real NOT NULL,
    [load_station] varchar(50) NULL,
    [times] int NOT NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'lineoverall';

CREATE TABLE [managefee] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [house_rent] Real NOT NULL,
    [office_fee] Real NOT NULL,
    [other_payout] Real NOT NULL,
    [payout_month] varchar(255) NULL,
    [phone_fee] Real NOT NULL,
    [water_elec_fee] Real NOT NULL,
    [write_date] datetime NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'managefee';

CREATE TABLE [proxyfeeclear] 
(
    [goods_bill_code] varchar(50) NOT NULL,
    [account_receivable] Real NULL,
    [balance_date] datetime NULL,
    [commision_rate] float NULL,
    [commision_receivable] Real NULL,
    [customer_code] varchar(50) NULL,
    [fact_receive_fund] Real NULL,
    [goods_pay_change] Real NULL,
    [received_commision] Real NULL,
    PRIMARY KEY ([goods_bill_code]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'proxyfeeclear';

CREATE TABLE [region] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [city] varchar(50) NOT NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'region';

CREATE TABLE [routeinfo] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [distance] Real NOT NULL,
    [end_station] int NULL,
    [fetch_time] Real NOT NULL,
    [pass_station] varchar(100) NULL,
    [start_station] int NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'routeinfo';

CREATE TABLE [sentlist] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [back_cost] Real NOT NULL,
    [car_card_no] varchar(50) NULL,
    [cash_pay] Real NOT NULL,
    [driver_name] varchar(50) NULL,
    [goods_code] varchar(50) NULL,
    [goods_name] varchar(50) NULL,
    [goods_revert_bill_code] varchar(50) NULL,
    [help_accept_fund] varchar(50) NULL,
    [mobile] varchar(50) NULL,
    [pickup_pay] Real NOT NULL,
    [piece_amount] int NOT NULL,
    [remark] varchar(50) NULL,
    [send_goods_customer] varchar(50) NULL,
    [send_goods_customer_tel] varchar(50) NULL,
    [transfer_destination] varchar(50) NULL,
    [user_id] int NOT NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'sentlist';

CREATE TABLE [transfercominfo] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [city] varchar(50) NULL,
    [company_name] varchar(50) NULL,
    [detail_address] varchar(200) NULL,
    [link_phone] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'transfercominfo';

CREATE TABLE [transferinfo] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [after_transfer_bill] varchar(50) NULL,
    [check_time] datetime NULL,
    [description] varchar(50) NULL,
    [goods_bill_code] varchar(50) NULL,
    [transfer_addr] varchar(50) NULL,
    [transfer_check] varchar(50) NULL,
    [transfer_company] varchar(50) NULL,
    [transfer_fee] Real NULL,
    [transfer_station] varchar(50) NULL,
    [transfer_station_tel] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'transferinfo';

CREATE TABLE [user] 
(
    [login_id] varchar(50) NOT NULL,
    [if_online] bit Default 0 NULL,
    [password] varchar(50) NULL,
    PRIMARY KEY ([login_id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'user';

CREATE TABLE [usergroup] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [description] varchar(50) NULL,
    [group_name] varchar(50) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'usergroup';

CREATE TABLE [userwithgroup] 
(
    [id] int IDENTITY(1,1) NOT NULL,
    [group_id] int NOT NULL,
    [user_id] varchar(255) NULL,
    PRIMARY KEY ([id]) 
)

exec sp_addextendedproperty N'MS_Description', N'', N'user', N'dbo', N'table', N'userwithgroup';

