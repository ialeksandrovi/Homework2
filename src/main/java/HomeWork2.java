import java.util.Arrays;

public class HomeWork2 {

    public static void main(String[] args) {
        int[] massive = {1, 5, 3, 2, 7, 8, 9, 1};
        int[] massive2 = {1, 753, 3, 7, 2, 737};
        int[] massive3 = {3, 7, 9, 35, 23, 71, 2, 6, 12, 25, 19, 20, 1, 5};


        task1();
        task2();
        task3();
        task4();
        starTask5();
        starTask6(massive);
        starTask6(massive2);
        starTask7(massive3);
    }

    public static void task1() {
        int[] massive = {0,1,0,1,1,1,0,1,0,0,0,1,1,1};
        System.out.println("Task1:");
        for (int value: massive) {
            System.out.println(value == 0 ? 1 : 0);
        }
        System.out.println(" ");
    }

    public static void task2() {
        int[] newMassive = new int[8];

        System.out.println("Task2:");
        for (int index = 0; index < newMassive.length; index++) {
            System.out.println(newMassive[index] = index*3);
        }
        System.out.println(" ");
    }

    public static void task3() {
        int[] massive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Task3:");
        for (int value: massive) {
            System.out.println(value < 6 ? value*2 : value);
        }
        System.out.println(" ");
    }

    public static void task4() {
        int[][] array = new int[6][6];

        System.out.println("Task4:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++ ) {
                if (i==j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public static void starTask5() {
        int[] massive = {14, 5, 3, 2, 11, 4, 45, 2, 4, 8, 89, 56};

        System.out.println("Task5*:");
        option1(massive);
        option2(massive);
        option3(massive);
        System.out.println(" ");
    }

    private static void option1(int[] massive) {
        int min = massive[0];
        int max = massive[0];
        for (int value: massive) {
            if (min > value) {
                min = value;
            }
        }
        for (int value: massive) {
            if (max < value) {
                max = value;
            }
        }
        System.out.print("Option1: ");
        showMinMax(min, max);
    }

    private static void option2(int[] massive) {
        int min = Arrays.stream(massive).min().getAsInt();
        int max = Arrays.stream(massive).max().getAsInt();
        System.out.print("Option2: ");
        showMinMax(min, max);
    }

    private static void option3(int[] massive) {
        Arrays.sort(massive);
        int min = massive[0];
        int max = massive[massive.length-1];
        System.out.print("Option3: ");
        showMinMax(min, max);
    }

    private static void showMinMax(int min, int max) {
        System.out.printf("min: %d, max: %d", min, max);
        System.out.println();
    }

    public static void starTask6(int[] massive) {
        int sum1;
        int sum2;
        Boolean result = false;


        System.out.println("Task6**:");

        for (int index = 1; index < massive.length; index++) {
            int[] subArray1 = new int[index];

            System.arraycopy(massive, 0, subArray1, 0, index);
            sum1 = Arrays.stream(subArray1).sum();
            sum2 = Arrays.stream(massive).skip(index).sum();
            if (sum2 == sum1) {
                result = true;
            }
            System.out.printf("%d   %d", sum1, sum2);
            System.out.println();
        }
        System.out.println(result);
        System.out.println(" ");
    }

    public static void starTask7(int[] array) {
        int shift = 14;

        System.out.println("Task7***:");

// Можно сократить число шагов
        if (shift > array.length) {
            shift = shift % array.length;
        }

        System.out.print("Input: ");
        for (int a: array) {
            System.out.printf(" %d", a);
        }
        System.out.println();


        for (int i = shift; i > 0; i--) {
            System.out.printf("Step%d: ", shift - (i-1));
            int firstValue = array[0];
            for (int index = 0; index < array.length; index++) {
                if (index < array.length - 1) {
                    array[index] = array[index + 1];
                    System.out.printf(" %d", array[index]);
                } else {
                    array[index] = firstValue;
                    System.out.printf(" %d", array[index]);
                    System.out.println();
                }
            }
        }




        System.out.println(" ");
    }
}
