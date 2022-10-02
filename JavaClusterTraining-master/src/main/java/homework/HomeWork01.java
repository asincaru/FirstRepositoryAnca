package homework;

public class HomeWork01 {
    // 1. Declare a variable for each primitive type and assign a value to it.
    public static void main(String[] args) {

        char c1 = 'c';
        byte b = 1;
        short s = 1;
        int i = 10;
        long l = 2;
        float f = 10.56f;
        double doubleNo = 123.8888;
        boolean t = true;

        System.out.println("c1=" + c1);
        System.out.println("i=" + i);
        System.out.println("f=" + f);
        System.out.println("s=" + s);
        System.out.println("l=" + l);
        System.out.println("f=" + f);
        System.out.println("t=" + t);
        System.out.println("doubleNo=" + doubleNo);

        // 2. Declare a String variable and use one method at your choice from String (e.g toLowerCase(), toUpperCase(), length())
        String text = "Hello,Hello  #worl22232231";
        String textUpperCase = text.toUpperCase();
        String textLowerCase = text.toLowerCase();
        System.out.println("The size of the String is " + text.length());
        System.out.println(textUpperCase);
        System.out.println(textLowerCase);

        //3 .Declare few variables and use 3 operators from each type and display the result at the console (Assignment,Comparision,Logical)
        int number1 = 10;
        int number2 = 8;
        int number3 = 10;
        int number4 = 14;

        int sumNumbers = number1 + number3;
        boolean compareNumbers = (number2 == number3);
        boolean logicalCompare = (number2 <= number1) && (number3 < number4);

        System.out.println("The sum is: " + sumNumbers);
        System.out.println("The comparition result is: " + compareNumbers);
        System.out.println("The logical result is: " + logicalCompare);

        // 4. Create a class Student with the following attributes (String name, int age) and create an object from this class
        Student student = new Student();
        student.name = "Popescu";
        student.age = 20;

        //5. Create a void method which receives 1 parameter of type int and displays that parameter value on the console
        int displayValue = 20;
        displayValue(displayValue);

        // 6. Create a method which receives 2 parameters of type int and returns the result of multiplying the two parameters
        int x = 10;
        int y = 20;
        multiplying(x, y);

       // 7  Within the Main class, create a method named "MyFirstName", having a String type parameter and the method must display in the console the message "Hello! I am + your first name"
         String firstname = "Pop";
         System.out.print ("Hello I am " + firstname);
    }

     public static void displayValue(int value) {
        System.out.println("Value is:" + value);
    }

    public static void multiplying(int x, int y){
        int multy = x * y;
        System.out.println("multiplying is: " + multy);
    }

    public static String getMyFirstName(String firstName) {
        return firstName;
    }

}









