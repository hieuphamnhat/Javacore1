public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int sum = add(1, 2);
        System.out.println(sum);
        showArray();
    }

    public static int add(int x1, int x2) {
        return x1 + x2;
    }

    public static void showArray() {
        int[][] arr1 = { { 1, 2 }, { 3, 4 } };
        System.out.println(arr1.length);
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.println("arr1[" + i + "]" + "[" + j + "]" + ": " + arr1[i][j]);
            }
        }
    }
}