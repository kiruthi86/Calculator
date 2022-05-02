import java.util.Scanner;
public class calci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integer numbers to do arithmetic operation:");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println("Enter any arithmetic operation (+,-,/,*,% to calculate between the numbers:");
        String  operator =scanner.next();
        System.out.println(operator);
        switch (operator) {
            case "+":
                System.out.println(num1+ " + "+ num2 +" = " +(num1 + num2));
                break;
            case "-":
                System.out.println(num1+" - "+ num2+" = " +(num1-num2));
                break;
            case "*":
                System.out.println(num1+" * "+ num2+" = " +(num1 * num2));
                break;
            case "/":
                System.out.println(num1+" / "+ num2+" = " +(num1 / num2));
                break;
            case "%":
                System.out.println(num1+" % "+ num2+" = " +(num1 % num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
