import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float sum = 0;

        int index = 1;

        List<Float> list = new ArrayList<>();

        float num;

        while (true) {

            System.out.format("nomreye dars [%d] :", index);

            if ((num = scanner.nextFloat()) != -1) {
                list.add(num);
                sum += num;
                index++;
            } else {
                break;
            }
        }

        float avg = sum / list.size();
        System.out.format("avg = %.3f \n", avg);
    }
}