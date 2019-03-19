package notesForClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //PERSON HOMEWORK
        Person robo1 = new Person();
        System.out.println(robo1);

        Person robo2 = new Person(22, "Avonte'", "Track", 20000, "Graphic Designer");
        System.out.println(robo2.aboutMyLife());

        //TWO NUMBER INPUT
        Scanner Number1 = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1;
        num1 = Number1.nextInt();

        Scanner Number2 = new Scanner(System.in);
        System.out.print("Enter number 2: ");
        double num2;
        num2 = Number2.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(Math.pow(num1, num2));
        System.out.println(Math.sqrt(num1));
        System.out.println(num1 * num1);
        System.out.println("Math.cos(" + num1 + ")=" + Math.cos(num1));
        System.out.println("Math.sin(" + num1 + ")=" + Math.sin(num1));

        //PASSWORD HOMEWORK
        //Create a Scanner object
        Scanner username = new Scanner(System.in);

        System.out.println("Enter username");

        //reads user inputs
        String userName = username.nextLine();

        System.out.println("Username is: " + userName);
        //_________________________________________________

        // scanner for password and unassign string for do while loop
        Scanner password = new Scanner(System.in);
        String passWord;

        //attempt object
        int numAttempts = 0;
        int count = 1;

        // do while loop with if else loop to limit possibilities
        do {
            System.out.println("Enter Password" + "\t" + count);
            passWord = password.nextLine();
            numAttempts++;
            count = count + 1;
        }
        while (!"PIZZAPALACE".equals(passWord) && numAttempts < 5);
        {
            if (passWord.equals("PIZZAPALACE")) {
                System.out.println("YOUR LOGGED IN MY BOY");
            } else {
                System.out.println("ERROR! ERROR!. YOUR LOCKED OUT SUCKA");
            }

        }
        //CHAPTER 3 HOMEWORK

    }
}