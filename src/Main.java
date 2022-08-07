import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] games = {1.2, 2.2, -5.4, 0.5, -5.5, 1.2, 4.5, -1.2, -0.7, 2.7, -2.8, 2.3, 0.3, -3.2 - 4.3};
        System.out.println(Arrays.toString(games));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$");

        double[] number = {1.2, 2.2, -5.4, 0.5, -5.5, 1.2, 4.5, -1.2, -0.7, 2.7, -2.8, 2.3, 0.3, -3.2 - 4.3};
        boolean isPlus = false;
        int count = 0;
        double sum = 0;
        for (double i : number) {
            if (isPlus == false) {
                if (i < 0) {
                    isPlus = true;
                }
            } else {
                if (i > 0) {
                    count++;
                    sum = sum + i;

                }

            }


        }

        double result = sum / count;
        System.out.println("Srednee arifmeticheskoe polojitelnyh chisel" + result);
        System.out.println("$$$$$$$$$$$$$");
        int [] ultimate = {8, -5, 2, 14, 6, -4};
        selectionSort(ultimate);
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            String str = Arrays.stream(arr)
                    .mapToObj(String::valueOf)
                    .reduce((x, y) -> x + ", " + y)
                    .get();

            System.out.println(str);

        }
    }

}














