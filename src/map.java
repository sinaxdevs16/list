import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class map {
    public static float sum;

    public static void main(String[] arg) {

        Map<String, Float> hashMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int index = 1;
        String name;
        float grade;
        while (true) {
            //get key :
            System.out.format("enter lesson name [%d} : ", index);
            name = scanner.next();

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
        if (hashMap.size() != 0) {
            float avg = sum / hashMap.size();
            System.out.format("avg = %.2f \n", avg);
            System.out.println(hashMap.size());
        } else
            System.out.format("map is empty !");
    }
}