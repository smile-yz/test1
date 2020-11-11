package com.my.package10;
/*
注解（Annotation）也叫元数据。
JDK中预定义的一些注解：
@Override：洁厕被该注解标注的方法是否是继承自父类（接口）的
@Deprecated：该注解的内容，表示已过时
@SuppressWarnings：压制警告,一般传递参数all，@SuppressWarnings("all")

自定义注解
格式：
  元注解
  public @interface 注解名称{}
  //注解的本就是一个接口，该接口默认继承Annotation接口
  public interface Demo471MyAnno extends java.lang.annotation.Annotation {}
属性：接口中可以定义的成员方法(抽象方法)
    要求：1.属性的返回值类型：基本数据类型、String、枚举、注解和以上类型的数组
         2.定义了属性，在使用时需要给属性赋值
            如果定属性时，使用default关键字给属性默认初始值，则使用注解时，可以不进行属性的赋值。
            如果只有一个属性需要赋值，并且属性名称时value，则value可以省略，直接定义值即可
         3.数组赋值时使用大括号包裹，如果数组中只有一个值，则大括号可以省略

元注解：用于描述注解的注解
    @Target:描述注解能够作用的位置
    @Retention：描述注解被保留的阶段
    @Documented：描述注解是否被抽取到api文档中
    @Inherited：描述注解是否被子类继承


 */

/**
 * 注释javadoc演示
 * @author itcat
 * @version 1.0
 * @since 1.5
 */
@SuppressWarnings("all")
public class Demo469Annotation {
    /**
     * 计算两数的和
     * @param a 整数
     * @param b 整数
     * @return 两数的和
     */

    public int add(int a,int b) {
        return a + b;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show01() {
        //有缺陷
    }
    

    public void show02() {
        //替代show01()方法
    }

    //@Demo471MyAnno




    public void demo() {
        show01();
    }


}
