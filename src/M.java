import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M {

    public static float sum;

    public static void main(String[] arg) {

        Map<String, Float> hashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int index = 1;

        while (true) {

            String name;
            float grade;

            //get key :
            System.out.format("enter lesson name [%d} : ", index);
            name = scanner.next().toString();

            //get value :
            System.out.format("enter grade of lesson [%d} : ", index);

            if ((grade = scanner.nextFloat()) != -1) {
                hashMap.put(name, grade);
                sum += grade;
                index++;
            } else {
                break;
            }
        }
//        for (int i = 0; i < 3; i++) {
//            //get key :
//            System.out.format("enter lesson name [%d} : ", index);
//            String name = scanner.next().toString();
//
//            //get value  :
//            System.out.format("enter grade of lesson [%d} : ", index);
//            float grade = scanner.nextFloat();
//
//            hashMap.put(name, grade);
//
//            index++;
//        }

//        hashMap.forEach((key, value) ->
//        {
//            sum += hashMap.get(key);
//            System.out.println();
//            System.out.format(" the grade of lesson %s is --> %.2f", key, value);
//        });
//        System.out.println();
//        System.out.format("the sum of grades is %.2f", sum);
//        for (int i = 0; i < hashMap.size(); i++) {
//            sum += hashMap.values();
//        }
        if (hashMap.size() != 0) {
            float avg = sum / hashMap.size();
            System.out.format("avg = %.2f \n", avg);
            System.out.println(hashMap.size());
        } else
            System.out.format("map is empty !");
    }
}