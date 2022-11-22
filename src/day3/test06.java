package day3;

public class test06 {
    public static void main(String[] args) {
//        强制类型转换,会发生截断，丢失精度
        int a = (int) 1.9;
        System.out.println(a);

        int j = 100;
        byte b = (byte) j;
        System.out.println(j);

//        强制数据类型转换会造成数据溢出
        int n2 = 2000;
        byte b1 = (byte) n2;
        System.out.println(b1);

//        细节
//        强转符号只针对最近的操作数有效，后面的数据往往会使用小括号提升优先级
//        int x = (int)10*3.5+6*1.5; 错误，只转换了最近的操作数
        int y = (int) (10 * 3.5 + 6 * 1.5);

//       char类型能保存int的常量值，但不能保存int的变量值，需强转
        char c1 = 100;//正确
        int m = 100;//正确
//        char c2 = m;//错误
        char c3 = (char) m;//正确
    }
}