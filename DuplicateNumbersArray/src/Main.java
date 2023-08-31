import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);

        int[] arr1 = {3,2,4,2,3,5,3,6,3,2,4,2,4,2,-1,-1};
        String[] arr2 = new String[arr1.length];
        String[] rep = new String[arr1.length];
        int counter;

        System.out.println("\narray : " + Arrays.toString(arr1)+"\n");

        for (int i = 0; i < arr1.length; i++) {
            rep[i] = arr1[i]+"";
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = "*";
        }


        for (int i = 0; i < arr1.length - 1; i++) {

            counter = 1;

            if(rep[i].equals("#")){
                continue;
            }

            for (int j = i + 1; j < rep.length; j++) {
                if(rep[i].equals(rep[j])) {
                    counter++;
                    rep[j] = "#";
                    arr2[i] = String.valueOf(counter);
                }
            }
        }

        System.out.println("Duplicate numbers : ");

        for (int i = 0; i < arr1.length; i++) {
            if(!arr2[i].equals("1") && !arr2[i].equals("*")) {
                System.out.println(arr1[i] + " : " + arr2[i] + " times");
            }
        }

    }
}