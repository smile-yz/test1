
/*
���巽����������ʽ��
���η�  ����ֵ����  �������ƣ��������� ��������,...)(
    ������
        return ����ֵ;
        }
 */
public class PyramindNumber {
    public static void main(String[] args){
        for (int x= 1;x <= 5;x++) {
            for (int y = 1;y <= 6-x;y++){
                System.out.print(" ");
            }
            //��ӡ�ո�������Ͻ����������
            for (int y = 1;y <= x;y++){
                System.out.print(y);
            }
            //��ӡ��һ��ֱ��������
            for (int y = x-1;y >= 1;y--){
                System.out.print(y);
            }
            //��ӡ�ڶ���ֱ��������
            System.out.println();
            //����
        }
    }
}