import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.FileSystemNotFoundException;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class task4 {

    public static void main(String[] args) throws FileNotFoundException {
        int g = 0;
        int s = 0;
        int m = 0;
        int o = 0;
        int w = 0;
        String x;
        String y;
        File file = new File("C:\\stdout2.txt");
        Formatter save = new Formatter(file);

        String h[] = new String[3];
        Integer A[] = new Integer[100];
        Integer B[] = new Integer[100];
        Integer C[] = new Integer[100];
        if (args.length < 2) {
            System.out.println("Указана одна или не указана не одна строка в виде аргумента, укажите 2 аргумента");

        } else {
            for (String str : args) {

                try (Scanner sc = new Scanner(str)) {

                    while (sc.hasNext()) {
                        //System.out.println(sc.findInLine("\\*+"));
                        //System.out.println(sc.findInLine("(\\*+)(\\w+)"));
                        //System.out.println(sc.findInLine("(\\w+)(.*+)"));

                        g = g + 1;
                        String j = sc.next();
                        h[g] = j;

                }
                    List<String> list = new ArrayList<String>(Arrays.asList(h));
                    list.removeAll(Arrays.asList(":", null));

                    if (list.get(1).equals("com") == true) {
                        System.out.println("ОК");
                        break;
                    }


                    if (list.get(0).equals(list.get(1)) == true){
                        System.out.println("ОК");
                        break;
                    }


                    else{
                        System.out.println("КО");
                    }


                } catch (Exception e) {

                }



                }
            }
        }
    }
