public class Main {

    public static void main(String[] args) {
        String name = "John";
        System.out.println("Hello " + name);

        int myNum;
        myNum = 15;
        System.out.println(myNum);

        final int NUM = 10; // constant
        System.out.println(NUM);

        // other types:
        float myFloat = 5.99f;
        char myLetter = 'd';
        boolean myBool = true;

        // plus operator
        int x = 5, y = 6;

        System.out.println("The sum is " + x + y); // Prints: The sum is 56
        System.out.println("The sum is " + (x + y)); // Prints: The sum is 11

        // one value to multiple variables
        int z;
        x = y = z = 50;
    }
}
