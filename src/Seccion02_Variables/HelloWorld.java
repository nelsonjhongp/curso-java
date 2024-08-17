package Seccion02_Variables;

public class HelloWorld {
    public static void main(String[] args) {
        String textGreet = "Hello world!";
        System.out.println("- TextGreet : "+textGreet);

        int numberTest = 10;
        System.out.println("- Number : "+numberTest);

        boolean condValue = true;
        if (condValue){
            System.out.println("- Conditional test : "+condValue);
        }

        var variableTest = "whatTheFuckText";
        System.out.println("- Printing a var variable : "+variableTest);
    }
}