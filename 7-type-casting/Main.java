public class Main {
    public static void main(String[] args) {
        // Widening Casting (automatic) - converting a smaller type to a larger type size
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing Casting (manual) - converting a larger type to a smaller type size
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);
        System.out.println(myInt2);
    }

}
