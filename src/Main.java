import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int [] firstArrays = new int [3];
        firstArrays[0]=1;
        firstArrays[1]=2;
        firstArrays[2]=3;

        double [] secondArrays = {1.57, 7.654, 9.986};

        int [] weekDays = {1, 2, 3, 4, 5 ,6, 7};
    }
    public static void task2() {
        System.out.println("Задание 2");
        int [] firstArrays = new int [3];
        firstArrays[0]=1;
        firstArrays[1]=2;
        firstArrays[2]=3;
        System.out.print(firstArrays[0]+", ");
        System.out.print(firstArrays[1]+", ");
        System.out.println(firstArrays[2]);

        double [] secondArrays = {1.57, 7.654, 9.986};
        System.out.print(secondArrays[0]+", ");
        System.out.print(secondArrays[1]+", ");
        System.out.println(secondArrays[2]);

        int [] weekDays = {1, 2, 3, 4, 5 ,6, 7};
        for (int i = 0; i < 6; i++) {
            System.out.print(weekDays[i]+", ");
        }
        System.out.println(weekDays[6]);
    }
    public static void task3() {
        System.out.println("Задание 3");
        int [] firstArrays = new int [3];
        firstArrays[0]=1;
        firstArrays[1]=2;
        firstArrays[2]=3;
        System.out.print(firstArrays[2]+", ");
        System.out.print(firstArrays[1]+", ");
        System.out.println(firstArrays[0]);

        double [] secondArrays = {1.57, 7.654, 9.986};
        System.out.print(secondArrays[2]+", ");
        System.out.print(secondArrays[1]+", ");
        System.out.println(secondArrays[0]);

        int [] weekDays = {1, 2, 3, 4, 5 ,6, 7};
        for (int i = 6; i > 0; i--) {
            System.out.print(weekDays[i]+", ");
        }
        System.out.println(weekDays[0]);
    }
    public static void task4() {
        System.out.println("Задание 4");
        int [] firstArrays = new int [3];
        firstArrays[0]=1;
        firstArrays[1]=2;
        firstArrays[2]=3;
        for (int i = 0; i < 3; i++) {
            if (firstArrays[i]%2==1) {
                firstArrays[i]=firstArrays[i]+1;
            }
        }
        System.out.println(Arrays.toString(firstArrays));
    }
}