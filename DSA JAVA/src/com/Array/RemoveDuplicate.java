import java.util.*;

public class RemoveDuplicate {

    public static void rd(int arr[]) {

        for(int i = 0; i < arr.length; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }

        for(int j : arr) {
            if(j != -1) {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rd(arr);
    }
}