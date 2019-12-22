import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float sum = 0;

        int index = 1;

        float grade;
		
        List<Float> list = new ArrayList<>();


        while (true) {

            System.out.format("nomreye dars [%d] :", index);

            if ((grade = scanner.nextFloat()) != -1) {
                list.add(grade);
                sum += grade;
                index++;
            } else {
                break;
            }
        }

        if (list.size() != 0) {
            float avg = sum / list.size();
            System.out.format("avg = %.3f \n", avg);
        } else
            System.out.format("list is empty !");
    }
}