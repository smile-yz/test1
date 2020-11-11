
/*
定义方法的完整格式：
修饰符  返回值类型  方法名称（参数类型 参数名称,...)(
    方法体
        return 返回值;
        }
 */
public class PyramindNumber {
    public static void main(String[] args){
        for (int x= 1;x <= 5;x++) {
            for (int y = 1;y <= 6-x;y++){
                System.out.print(" ");
            }
            //打印空格，填充左上角这块三角形
            for (int y = 1;y <= x;y++){
                System.out.print(y);
            }
            //打印第一块直角三角形
            for (int y = x-1;y >= 1;y--){
                System.out.print(y);
            }
            //打印第二块直角三角形
            System.out.println();
            //换行
        }
    }
}