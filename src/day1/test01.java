package day1;

public class test01 {
    public static void main(String[] args) {
//        java是一种强类型语言
//        int a = 10L; 这种写法错误，原因表示范围大的数据类型转化为范围小的数据类型，导致数据不准确会损失,编译直接报错
//        正确写法：long a = 10L;
        long a = 10L;

//        浮点型
//        float b =  10.1;这种写法错误。原因10.1这个浮点型默认是double类型，而b是float类型，double类型范围大所以会导致数据截断，编译器直接报错
//        正确写法：float b = 10.1f;
//        把小的给大的也是可以的：double c = 10.1f;
//        格式如果是0.123这样的浮点数那么前面的0可以省略
//        例如：double d = 0.123;可以写成
//        double d = .123;
        double d = 0.123;
        double e = .123;
        System.out.println(d);
        System.out.println(e);
//        浮点数使用陷阱
        double num1 = 2.7;
        double num2 = 8.1 / 3;
        System.out.println(num1);
        System.out.println(num2);
//        num2输出结果是一个接近2.7的的小数而不是2.7
//        重要警告：当对运算结果是小数的进行相等判断时，要小心，千万注意

    }
}
