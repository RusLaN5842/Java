package HomeWork_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Home1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        //
        Random rnd = new Random();
        List<Integer> earlBio = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            earlBio.add(rnd.nextInt(100));
        }

        System.out.printf("Запись в LinkedList: %s \n", earlBio);

        System.out.printf("Развернутый список: %s \n", earlBio);

        System.out.print("Время работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));

    }

    public static List<Integer> reverse(List<Integer> direct) {
        List<Integer> reversed = new LinkedList<>();

        for (int i = direct.size() - 1; i >= 0; i--) {
            reversed.add(direct.get(i));
        }

        return reversed;
    }

    private static int[] RANDOM() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 31) - 0);
        }
        return arr;
    }

}