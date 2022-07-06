import java.util.Scanner;

//SEYDA
public class Day07_SwapNumbers {

    public static void main(String[] args) {
//        Swapping two numbers: Get two numbers from user then swap/exchange them.
//        User ==> a=5, b=10, then after swapping a=10, b=5.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = scan.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scan.nextInt();
        System.out.println("first number before swap : " + firstNumber);
        System.out.println("second number before swap : " + secondNumber);

//        int temporary=0;
//        temporary=firstNumber;
//        firstNumber=secondNumber;
//        secondNumber=temporary;
//        System.out.println("after swap first number: "+firstNumber);
//        System.out.println("after swap second number:"+secondNumber);

        //2.nd way:Without using 3rd container:
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("after swap: " + firstNumber + "-" + secondNumber);

    }

}
