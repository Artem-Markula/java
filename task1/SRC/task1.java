import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.FileSystemNotFoundException;
import java.util.*;
import java.util.stream.IntStream;

public class task1 {

    public static void main(String[] args) throws FileNotFoundException {
        int g = 0;
        int s = 0;
        int sum = 0;
        int sum4 = 0;
        double sum5 = 0;
        int sum6 = 0;
        int c=0;
        int n = 0;
        String h[] = new String[100];
        File file = new File("C:\\stdout.txt");
        Formatter save = new Formatter(file);

        if (args.length == 0) {
            System.out.println("Путь к файлу не найден, укажите путь к файлу вставив его в командную строку");

        } else {
            for (String str : args) {
                File x = new File(str);
                try (Scanner sc = new Scanner(x)) {
                    String j = sc.next();
                    while (sc.hasNext()) {
                        g = g + 1;
                        String f = sc.next();
                        h[s] = j;
                        h[g] = f;
                    }

                    List<String> list = new ArrayList<String>(Arrays.asList(h));
                    list.removeAll(Arrays.asList(":", null));



                    Integer[] myArray = new Integer[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        myArray[i] = Integer.valueOf(list.get(i));

                    }

                    sc.close();

                    double average = 0;


                    for (int l = 0; l < myArray.length; l++) {
                        sum4 = sum4 + 1;
                    }

                    if (myArray.length > 0) {
                        float sum2 = 0;
                        for (int q = 0; q < myArray.length; q++) {
                            sum2 += myArray[q];
                        }



                        average = sum2 / myArray.length;
                        double newDouble = new BigDecimal(average).setScale(1, RoundingMode.UP).doubleValue();
                        System.out.println("Среднее значение " + newDouble);
                        save.format("%s %s %s", "Среднее значение ", newDouble, "\r");
                        int tre = (int) newDouble;
                        sum5 = 0.9 * sum4;
                        double newDouble2 = new BigDecimal(sum5).setScale(3, RoundingMode.UP).doubleValue();
                        int value = (int) newDouble2;

                        List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(myArray));
                        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(myArray));
                        Collections.sort(list2);




                        for (int z = 0; z < list2.size(); z++) {
                            n = n + 1;
                            System.out.print(tre);
                            if(list2.get(z) == tre){
                                sum = sum + list2.get(z);
                            }
                            if(list2.get(z) == myArray[value]){
                                sum = sum + list2.get(z);
                            }

                    }


                        System.out.println("Процентиль из 90: " + "Ранг получился " + value + " Значения получилось " + myArray[value]);
                        System.out.println("Сумма масива в диапозоне равна " + c);
                        System.out.println("Значения записаны в файл stdout");

                        try {
                            save.format("%s %s %s", "|", "Значение процентеля получилось ", myArray[value], "\r");
                            save.format("\r %s \n %s %s %s", "|", "Сумма масива в диапозоне", c, "\r");

                            save.close();
                        } catch (Exception e) {
                            System.out.print("Ошибка записи");
                        }


                    }
                }
            }
        }
    }
}

