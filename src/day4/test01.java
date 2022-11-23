package day4;

public class test01 {
    public static void main(String[] args) {
//        基本数据类型转String
        int a = 100;
        String s = a + "";

//        String转基本数据类型
        String b = "100";
        int num1 = Integer.parseInt(b);
        double num2 = Double.parseDouble(b);
        float num3 = Float.parseFloat(b);
        long num4 = Long.parseLong(b);
        byte num5 = Byte.parseByte(b);

    }
}
