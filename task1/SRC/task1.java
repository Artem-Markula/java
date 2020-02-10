import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class task1 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n///////////////////////////////////////////////////////////////////////");
        System.out.println("\nЭта программа из 1 задания, из нагрузочного тестирования на работу");
        System.out.print("Которая считает сумму цифр масива, находящиеся в диапозоне между\n");
        System.out.print("Средним значением и Процентилем из 90\n");
        System.out.print("Командной строке подается в качестве аргумента путь к файлу\n");
        System.out.print("С цифрами и другими символами, программа берет цифры для счета\n");
        System.out.print("Пример аргумента C:\\Users\\Администратор\\Desktop\\As.txt\n ");
        System.out.println("\nПосле этого эти значения Программа записывает в файл");
        System.out.println("Под названием stdout он записывается в корень диска C");
        System.out.println("Помимо суммы, так же программа показывает процентиль и Среднее значение");
        System.out.println("\n///////////////////////////////////////////////////////////////////////\n");

        int g = 0;
        int s = 0;
        int sum = 0;
        int sum4 = 0;
        double sum5 = 0;
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
                        String p = f.replaceAll("[^0123456789]", "");
                        h[s] = j;
                        h[g] = p;
                    }

                    List<String> list = new ArrayList<String>(Arrays.asList(h));
                    list.removeAll(Arrays.asList("", null));



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
                        
                        save.format("%s %s %s", "Среднее значение ", newDouble, "\r");
                        int tre = (int) newDouble;
                        sum5 = 0.9 * sum4;
                        double newDouble2 = new BigDecimal(sum5).setScale(3, RoundingMode.UP).doubleValue();
                        int value = (int) newDouble2;

                        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(myArray));
                        Collections.sort(list2);




                        for (int z = 0; z < list2.size(); z++) {
                            n = n + 1;
                            if(list2.get(z) == tre){
                                sum = sum + list2.get(z);
                            }
                            if(list2.get(z) == myArray[value]){
                                sum = sum + list2.get(z);
                            }



                    }

                        System.out.println("Полученная сумма масива " + sum);
                        System.out.println("Среднее значение " + newDouble);
                        System.out.println("Процентиль из 90: " + "Ранг получился " + value + " Значения получилось " + myArray[value]);                
                        System.out.println("Значения записаны в файл stdout");


                        try {
                            save.format("%s %s %s", "|", "Значение процентеля получилось ", myArray[value], "\r");
                            save.format("\r %s \n %s %s %s", "|", "Сумма масива в диапозоне", sum, "\r");

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
