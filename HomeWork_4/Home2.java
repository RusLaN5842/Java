package HomeWork_4;

import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Home2 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Logger logger = Logger.getLogger(Home2.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("logTask_2.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);
        SimpleFormatter log = new SimpleFormatter();
        fh.setFormatter(log);

        Queue<Integer> earlBio = new LinkedList<>();
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));

        System.out.printf("Запись в LinkedList: %s \n", earlBio);
        logger.info("Запись в LinkedList: " + Arrays.toString(new List[] { (List) earlBio })
                + "\n_____________________________________________________");

        int SS = size(earlBio);
        logger.info(new StringBuilder().append("Размер списка в LinkedList: ").append(Arrays.toString(
                new List[] { Collections.singletonList(SS) }))
                .append("\n_____________________________________________________").toString());

        int AA = enqueue((LinkedList<Integer>) earlBio);
        logger.info(new StringBuilder().append("Добавленный элемент: ").append(Arrays.toString(
                new List[] { Collections.singletonList(AA) }))
                .append("\n_____________________________________________________").toString());

        System.out.printf("Список с добавленным элементом: %s\n", earlBio);
        logger.info("Список с добавленным элементом: " + Arrays.toString(new List[] { (List) earlBio })
                + "\n_____________________________________________________");

        int BB = size(earlBio);
        logger.info(new StringBuilder().append("Размер списка в LinkedList: ").append(Arrays.toString(
                new List[] { Collections.singletonList(BB) }))
                .append("\n_____________________________________________________").toString());

        int FF = first((LinkedList<Integer>) earlBio);
        logger.info(new StringBuilder().append("первый элемент из очереди: ").append(Arrays.toString(
                new List[] { Collections.singletonList(FF) }))
                .append("\n_____________________________________________________").toString());

        int DD = dequeue((LinkedList<Integer>) earlBio);
        logger.info(new StringBuilder().append("Удаляет первый элемент: ").append(Arrays.toString(
                new List[] { Collections.singletonList(DD) }))
                .append("\n_____________________________________________________").toString());

        System.out.printf("итоговая запись в LinkedList: %s \n", earlBio);
        logger.info("Список с добавленным элементом: " + Arrays.toString(new List[] { (List) earlBio })
                + "\n_____________________________________________________");

        int WW = size(earlBio);
        logger.info(new StringBuilder().append("Размер списка в LinkedList: ").append(Arrays.toString(
                new List[] { Collections.singletonList(BB) }))
                .append("\n_____________________________________________________").toString());
        //

        System.out.print("Время работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));// вывод
                                                                                                                    // и
                                                                                                                    // замер
                                                                                                                    // времени
        logger.info("Время работы для LinkedList (в миллисекундах)" + +(System.currentTimeMillis() - start)
                + "\n*====================================================*");
    }

    private static int dequeue(LinkedList<Integer> earlBio) {
        Integer first = earlBio.get(0);
        earlBio.remove(0);
        System.out.printf("Удаленный элемент: %s\n", first);
        return first;
    }

    private static int first(LinkedList<Integer> earlBio) {
        Integer first = earlBio.get(0);
        System.out.printf("Первый элемент очереди: %s\n", first);
        return first;
    }

    private static int size(Queue<Integer> earlBio) {
        int aa = earlBio.size();
        System.out.printf("Размер списка: %s\n", aa);

        return aa;
    }

    public static int enqueue(LinkedList<Integer> earlBio) {
        earlBio.add(getRandomNumber(10));
        int ae = earlBio.get(7);
        System.out.printf("Добавленный элемент %s\n", ae);
        return ae;
    }

    public static int getRandomNumber(int i) {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }

}