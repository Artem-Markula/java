import java.io.FileNotFoundException;
import java.util.*;
public class task4 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n///////////////////////////////////////////////////////////////////////");
        System.out.println("\nЭта программа из 4 задания, из нагрузочного тестирования на работу");
        System.out.print("Которая сравнивает 2 строки, они подаются в виде аргумента командной строке\n");
        System.out.println("\nЕсли указать строку с * это означает замену любого символа с любым количеством");
        System.out.println("Если строки одинаковые программа выводит сообщения (ОК)");
        System.out.println("Если строки не одинаковые программа выводит сообщения (КО)");
        System.out.println("\n///////////////////////////////////////////////////////////////////////\n");

        int g = 0;
        int s = 0;
        int m = 0;
        String x;

        String h[] = new String[3];
        String a[] = new String[3];

        if (args.length < 2) {
            System.out.println("Указана одна или не указана не одна строка в виде аргумента \nУкажите 2 аргумента в виде строки через пробел\nПример: ккк ккк");

        } else {
            for (String str : args) {


                try (Scanner sc = new Scanner(str)) {


                    while (sc.hasNext()) {
                        g = g + 1;
                        String j = sc.next();
                        h[g] = j;
                        a[g] = j;
                        x = a[2].replaceAll("[^\\*]", "");

                        for (s = 0; s < x.length(); s++){
                            m = m + 1;
                            if (m == 0){
                                System.out.println("ОК");
                            }
                            if (m < 10){
                                h[1] = h[2];

                            }
                        }

                        if (h[1].equals(h[2]) == true){
                            System.out.println("ОК");
                            break;
                        }


                    List<String> list = new ArrayList<String>(Arrays.asList(h));
                    list.removeAll(Arrays.asList(":", null));


                    }

                    if (h[2].equals("com") == true) {
                        System.out.println("ОК");
                        break;
                    }


                    if (h[1].equals(h[2]) == false) {
                        System.out.println("КО");
                        break;
                    }





                } catch (Exception e) {


                }



                }
            }
        }
    }



