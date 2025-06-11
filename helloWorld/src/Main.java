public class Main {

    public static void main(String[] args) {
        //  System.out.println("Hello, World!");

        //data type long
        // long number = 1234567890000000;
        // System.out.println("Long: " + number);
        // // data type int
        // int integerNumber = 25;
        // System.out.println("Integer: " + integerNumber);
        // //data type double
        // double decimalNumber = 19.99f;
        // System.out.println("Double: " + decimalNumber);
        // //data type char
        // char character = 'A';
        // System.out.println("Character: " + character);
        // //data type boolean
        // boolean isTrue = true;
        // System.out.println("Boolean: " + isTrue);
        // //data type String
        // String text = "Hello World!";
        // System.out.println("String: " + text);
        // //data type Array
        // int[] numbersArray = {1, 2, 3, 4, 5};
        // System.out.print("Array: ");
        // for (int num : numbersArray) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();

        // arithmetic operator
        int a = 20;
        int b = 5;
        int tambah = a + b;
        int kurang = a - b;
        int kali = a * b;
        int bagi = a / b;
        int remainder = a % b;
        System.out.println("tambah: " + tambah);
        System.out.println("kurang: " + kurang);
        System.out.println("kali: " + kali);
        System.out.println("bagi: " + bagi);
        System.out.println("Remainder: " + remainder);

        // relational operator
        boolean isEqual = (a == b);
        System.out.println("isEqual: " + isEqual);
        boolean isGreater = (a > b);
        System.out.println("isGreater: " + isGreater);

        // logical operator
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("OR: " + (condition1 || condition2));
    }
}