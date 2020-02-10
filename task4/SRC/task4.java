import java.io.FileNotFoundException;
import java.util.*;
public class task4 {

    public static void main(String[] args) throws FileNotFoundException {
        int g = 0;
        int s = 0;
        int m = 0;
        String x;

        String h[] = new String[3];
        String a[] = new String[3];
        Integer B[] = new Integer[100];
        Integer C[] = new Integer[100];

        if (args.length < 2) {
            System.out.println("Указана одна или не указана не одна строка в виде аргумента, укажите 2 аргумента");

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



