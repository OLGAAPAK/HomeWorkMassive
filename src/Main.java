

public class Main {
    public static void main(String[] args) {

        int[] arr2 = new int[15];

        for (int i = 0; i < arr2.length; i++) {
            if (i < 2) {
                arr2[i] = i;
            }
            else {
                arr2[i] = arr2[i-1] + arr2[i-2];
            }
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
            }
        }

    }
}