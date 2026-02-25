public class Main {
    public static void main(String[] args) {
        // primitive data types: byte, short, int, long, float, double, boolean and char
        // non-primite data types: String, Arrays, Classes...

        // byte: -128 to 127
        byte byteNum = 100;
        System.out.println(byteNum);

        // short: -32768 to 32767
        short shortNum = 500;
        System.out.println(shortNum);

        // int: 2147483648 to 2147483647
        int intNum = 100000;
        System.out.println(intNum);

        // long: -9223372036854775808 to 9223372036854775807
        long longNum = 15000000000L;
        System.out.println(longNum);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        char myGrade = 'B';
        System.out.println(myGrade);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        String greeting = "Hello World";
        System.out.println(greeting);

        // introduced in Java 10
        var x = 5;
        System.out.println(x);

    }
}
