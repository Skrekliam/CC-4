import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, "CP1251");
        Scanner s1 = new Scanner(System.in, "CP1251");
        boolean work = true;
        ArrayList<String> visitedCities = new ArrayList<>();
        while (work) {
            System.out.println("Choose task \n 1: Task 1 \n 2: Task 2 \n 3: Task 3 \n 0: Exit ");
            int k = s.nextInt();
            switch (k) {
                case 0:
                    work = false;
                    break;


                case 1:
                    System.out.println("Enter string to reverse it");
                    String text = s1.nextLine();
                    int len = text.length();
                    for (int i = text.length() - 1; i >= 0; i--) {
                        text = text + text.charAt(i);
                    }
                    System.out.println(text.substring(len));
                    break;


                case 2:
                    int[] arr1 = new int[5];
                    int[] arr2 = new int[5];
                    int sum1 = 0, sum2 = 0;
                    Random rnd = new Random();
                    for (int i = 0; i < 5; i++) {
                        arr1[i] = rnd.nextInt(6);
                        arr2[i] = rnd.nextInt(6);
                        System.out.print(arr1[i] + "\t");
                        sum1 += arr1[i];
                        sum2 += arr2[i];
                    }
                    System.out.println();
                    for (int i = 0; i < 5; i++) {
                        System.out.print(arr2[i] + "\t");
                    }
                    System.out.println();
                    sum1 /= 5;
                    sum2 /= 5;
                    System.out.println("Arithmetic mean of first is " + sum1 + ", second " + sum2);

                    if (sum1 > sum2) {
                        System.out.println("Arithmetic mean of first is higher");
                    } else if (sum1 < sum2) {
                        System.out.println("Arithmetic mean of second is higher");
                    } else {
                        System.out.println("Arithmetic means are same ");
                    }
                    break;


                case 3:
                    System.out.println("Enter number of cities you want to add[1-9] \t0 to view list");
                    int citiesCount = s.nextInt();
                    if (citiesCount > 0 && citiesCount < 10) {
                        System.out.println("Enter " + citiesCount + " names of cities, only one in line");
                        for (int i = 0; i <= citiesCount; i++) {
                            visitedCities.add(s.nextLine());
                        }
                    } else if (citiesCount == 0) {
                        for (int i = 0; i < visitedCities.size(); i++) {
                            System.out.println(visitedCities.get(i));
                        }
                        System.out.println();
                    } else {
                        System.out.println("Entered wrong number:" + citiesCount);
                        break;
                    }

                    break;
            }

        }
    }
}
