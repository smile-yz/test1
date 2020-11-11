package com.my.package8;

public class Demo339Cook2 {
    public static void main(String[] args) {
        //调用invokeCook方法，参数式Demo339Cook接口，传递接口的匿名内部类对象
        invokeCook(new Demo339Cook() {
            @Override
            public void makeFood() {
                System.out.println("普通方法吃饭了");
            }
        });
        //使用Lambda方法
        invokeCook(() -> {
            System.out.println("Lambda吃饭了");
        });
        //简化Lambda
        invokeCook(() ->
            System.out.println("Lambda简化版")
        );

    }
    //定义一个方法继承Cook接口，方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Demo339Cook cook) {
        cook.makeFood();
    }
}
