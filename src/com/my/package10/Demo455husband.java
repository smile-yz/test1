package com.my.package10;
/*
通过this引用本类的成员方法
 */
public class Demo455husband {
    //定义一个买房子的方法
    public void buyHouse() {
        System.out.println("北京二环房子");
    }
    //定义结婚方法,参数传递Demo455Richable接口
    public void marry(Demo455Richable r) {
        r.buy();
    }
    //高兴的方法
    public void soHappy() {
       //调用结婚的方法，方法的参数是Demo455Richable函数式接口，可以传递Lambda表达式
        marry(() -> {
            //使用this.成员方法，调用本类买房子的方法
            this.buyHouse();
        });
        /*
        使用方法引用优化lambda表达式
        this已经存在的
        本类的成员方法buyHouse已经存在的
        可以直接使用this引用本类的成员方法buyHouse方法
         */
        marry(this :: buyHouse);
    }
    public static void main(String[] args) {
        new Demo455husband().soHappy();
    }
}
