import java.util.*;

class Calculator {
    public static void main(String[] args) {
        // declaring
        double n1, n2;
        double result;
        Scanner scan = new Scanner(System.in);
        // interface of calculator
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                                  Calculator  ");
        System.out.println("Choose operation\n\n");
        System.out.println("Addition       -> 1");
        System.out.println("Substration    -> 2");
        System.out.println("Multiplication -> 3");
        System.out.println("Divide         -> 4");
        System.out.println("Square         -> 5");
        System.out.println("Cube           -> 6");

        System.out.println("Enter operation : ");
        int op = scan.nextInt();
        if (op == 1 || op == 2 || op == 3 || op == 4) {
            /// input of data
            System.out.println("Enter first digit:  ");
            n1 = scan.nextDouble();
            System.out.println("Enter Second digit:  ");
            n2 = scan.nextDouble();

            //// if else ladder

            if (op == 1) {
                result = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + result);
            } else if (op == 2) {
                result = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + result);
            } else if (op == 3) {
                result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result);
            } else if (op == 4) {
                result = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + result);
            }
        } else if (op == 5) {
            System.out.println("Enter Digit:  ");
            int n = scan.nextInt();
            result = n * n;
            System.out.println("Square of " + n + " is " + result);
        } else if (op == 6) {
            System.out.println("Enter Digit:  ");
            int n = scan.nextInt();
            result = n * n * n;
            System.out.println("Cube of " + n + " is " + result);

        } else {
            System.out.println("Invalid operation");
        }
    }

}
