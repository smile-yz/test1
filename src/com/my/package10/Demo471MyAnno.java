package com.my.package10;

/*
public interface Demo471MyAnno extends java.lang.annotation.Annotation {
}
 */
public @interface Demo471MyAnno {
    /*public abstract String name() default "张三";
    public abstract int age();*/
    //public abstract Demo472Person per();
    Demo472MyAnno anno2();
    String[] strs();
}
