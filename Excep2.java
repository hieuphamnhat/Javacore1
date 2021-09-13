public class Excep2 {
    public static void main(String args[]) {
        try {
            int a[] = new int[7];
            a[4] = 30 / 0;
            System.out.println("this is try block");
        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Warning!!!!");
        }
        System.out.println("Escape try-catch block...");
    }
}
