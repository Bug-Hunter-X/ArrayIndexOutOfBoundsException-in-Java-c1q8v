public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (0 <= 4 && 4 < arr.length) {
            System.out.println(arr[4]); // Accessing the last element correctly
        } else {
            System.out.println("Index out of bounds");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}