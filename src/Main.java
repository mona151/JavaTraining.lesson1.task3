/*
 * Main class
 * EPAM Java training for automation QA
 * Author: Kirill Kuzin
 * Lesson 1 Task 3
 * */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        CalculatingEngine calculatingEngine = new CalculatingEngine();
        char operator;
        double result;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A and B");
        int A = Integer.parseInt(in.nextLine());
        int B = Integer.parseInt(in.nextLine());
        System.out.println("Enter operator: +, -, / or *");
        operator = in.nextLine().charAt(0);
        switch (operator){
            case '+': result = calculatingEngine.doSum(A, B);
                System.out.println(A + "+" + B + "=" + result);
                break;

            case '-': result = calculatingEngine.doDiff(A, B);
                System.out.println(A + "-" + B + "=" + result);
                break;

            case '*': result = calculatingEngine.doMutliply(A, B);
                System.out.println(A + "*" + B + "=" + result);
                break;

            case '/': result = calculatingEngine.doDivide(A, B);
                System.out.println(A + "/" + B + "=" + result);
                break;

            default:
                System.out.println("\"" + operator + "\" is not a correct operator!");
        }
    }
}
