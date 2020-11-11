package com.my.package3;

public class Demo159NewPhone extends Demo159Phone {
    @Override
    public void show() {
        //父类方法拿过来重复利用
        super.show();
        //自己子类添加更多内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
