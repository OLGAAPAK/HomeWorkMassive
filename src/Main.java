import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");

        int[] arr2 = new int[15];

        for (int i = 0; i < arr2.length; i++) {
            if (i < 2) {
                arr2[i] = i;
            } else {
                arr2[i] = arr2[i - 1] + arr2[i - 2];
            }
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
            }
        }

            System.out.println("Task2");

            int[] arr3 = new int[30];
            Random random = new Random();
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = random.nextInt(-70, 50);
                System.out.println(arr3[i]);
            }
            int maxNum = arr3[0];
            int minNum = arr3[0];
            for (int i = 0; i < arr3.length; i++){
                if (arr3[i] > maxNum) {
                    maxNum = arr3[i];
                }
                if (arr3[i] < minNum) {
                    minNum = arr3[i];
                }
            }
            System.out.print("max=");
            System.out.println(maxNum);
            System.out.print("min=");
            System.out.println(minNum);

            System.out.println("Task3");

            int[] arr4 = new int[]{2, 3, 2, 2, 2};
            boolean g = true;
            for (int i = 0; i < arr4.length; i++){
                if (arr4[i] != arr4[0]){
                    g = false;
                    break;
                }
            }
            if (g) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
    }
}
