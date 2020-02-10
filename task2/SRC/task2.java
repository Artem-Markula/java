import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class task2 {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("\n///////////////////////////////////////////////////////////////////////");
        System.out.println("\nЭта программа из 2 задания, из нагрузочного тестирования на работу");
        System.out.print("Которая проверяет на подобность 2 треугольника\n");
        System.out.print("Командной строке подается в качестве аргумента путь к файлу\n");
        System.out.print("С цифрами и другими символами, программа берет координаты для сравнения\n");
        System.out.print("Пример аргумента C:\\Users\\Администратор\\Desktop\\Geometry.txt\n ");
        System.out.println("\nВ файле написан следующий формат сравнения 2 треугольников");
        System.out.println("{triangle1: {A: [x,y,z] , B: [x,y,z], C:[x,y,z]},");
        System.out.println("{triangle2: {A: [x,y,z] , B: [x,y,z], C:[x,y,z]}}");
        System.out.println("Вместо x,y,z стоят числа, которые показывают координаты");
        System.out.println("\n///////////////////////////////////////////////////////////////////////\n");

        int g = 0;
        int s = 0;

        String h[] = new String[100];
        Integer A[] = new Integer[100];
        Integer B[] = new Integer[100];
        Integer C[] = new Integer[100];
        if (args.length == 0) {
            System.out.println("Путь к файлу не найден, укажите путь к файлу вставив его в командную строку");

        } else {
            for (String str : args) {
                File x = new File(str);
                try (Scanner sc = new Scanner(x)) {
                    while (sc.hasNext()) {
                        String j = sc.next();

                        String n = j.replaceAll("[^0123456789]", "");

                        g = g + 1;
                        h[g] = n;
                }
                    List<String> list = new ArrayList<String>(Arrays.asList(h));
                    list.removeAll(Arrays.asList(":", null));

                    Integer[] myArray = new Integer[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        myArray[i] = Integer.valueOf(list.get(i));
                        if (myArray[i] == 0){
                            myArray[i] = 1;

                        }
                    }
                    sc.close();

                    for (int l = 0; l <= myArray.length; l = l + 7){
                        for (int d = 1; d <= l; d = d + 4){
                            A[d] = myArray[d];

                        }

                        for (int r = 2; r <= l; r = r + 4){
                            B[r] = myArray[r];

                        }
                        for (int q = 3; q <= l; q = q + 4){

                            C[q] = myArray[q];
                        }

                    }


                    Integer sum1 = A[1]%A[5];

                    Integer sum2 = B[2]%B[6];

                    Integer sum3 = C[3]%C[7];

                    Integer sum4 = A[5]%A[1];

                    Integer sum5 = B[6]%B[2];

                    Integer sum6 = C[7]%C[3];


                    if (sum1 == 0){
                        s = s + 1;
                    }
                    else {
                        s = s - 1;
                    }

                    if (sum2 == 0){
                        s = s + 1;
                    }
                    else {
                        s = s - 1;
                    }

                    if (sum3 == 0){
                        s = s + 1;
                    }
                    else {
                        s = s - 1;
                    }


                    if (sum4 == 0){
                        s = s + 1;
                    }
                    else {
                        s = s - 1;
                    }

                    if (sum5 == 0){
                        s = s + 1;
                    }
                    else {
                        s = s - 1;
                    }

                    if (sum6 == 0){
                        s = s + 1;
                    }
                    else {
                        s = s - 1;
                    }
                    switch (s) {
                        case (6):
                            System.out.println("Треугольники подобные");
                            break;
                        case (4):
                            System.out.println("Треугольники подобные");
                            break;
                        case (0):
                            System.out.println("Треугольники подобные");
                            break;




                    default:
                        System.out.println("Треугольники не подобные");

                    }



                } catch (Exception e) {
                    System.out.print("Файл поврежден");
                }



                }
            }
        }
    }

