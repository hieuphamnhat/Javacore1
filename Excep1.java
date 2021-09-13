public class Excep1 {
    public static void main(String args[]) {
        int num1, num2;
        try {
            num1 = 0;
            num2 = 62 / num1;
            System.out.println(num2);
            System.out.println("End try block.");
        } catch (ArithmeticException e) {
            System.out.println("Error: divide for 0");
        } catch (Exception e) {
            System.out.println("Error: Something wrong!");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("Escape try catch block.");
    }
}
