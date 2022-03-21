public class Function2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i * i;
            System.out.println(arr[i]);
        }
    }

    public static void printAll(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i * i;
            System.out.println(arr[i]);
        }
    }
}
