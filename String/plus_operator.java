public class plus_operator {
    public static void main(String[] args) {
        String str = "abc ";
        str = str.concat("bcb ");
        System.out.println(str); // abc bcb
        str = str+"ajcc ";
        System.out.println(str); // abc bcb ajcc
        String t = "zcc ";
        str = str+t;
        System.out.println(str); // abc bcb ajcc zcc
        str = str+10;
        System.out.println(str); // abc bcb ajcc zcc 10
        System.out.println("abc" + 10+20); // abc1020
        System.out.println(10+20+"abc");//30abc
    }
}
