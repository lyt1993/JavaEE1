package com.yaotai.pattern.Builder2;

public class Main2 {
    public static void main(String[]args){
        //创建构建器对象
        InsuranceContract.ConcreteBuilder builder =
                new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
        //设置需要的数据，然后构建保险合同对象
        InsuranceContract contract = builder.setPersonName("小明").setOtherData("test").build();
        //操作保险合同对象的方法
        contract.someOperation();

        //创建构建器对象
        InsuranceContract.ConcreteBuilder builder1 =
                new InsuranceContract.ConcreteBuilder("9528", 456L, 123L);
        //设置需要的数据，然后构建保险合同对象
        InsuranceContract contract1 = builder1.setPersonName("小明1").setOtherData("test1").build();
        //操作保险合同对象的方法
        contract1.someOperation();
    }
}
