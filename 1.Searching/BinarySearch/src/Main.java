import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("Linear Search");
        System.out.println("*************************************************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Length of the array: ");
        int N = scanner.nextInt();
        int[] Array = new int[N];
        for(int i=0; i<N; i++){
            System.out.print("Enter the "+(i+1)+"th element of the array: ");
            Array[i]=scanner.nextInt();
        }
        Arrays.sort(Array);
        System.out.print("Enter the Target Element: ");
        int target = scanner.nextInt();

        //Binary search

        int left = 0;
        int right = Array.length - 1;
        boolean isFound = false;

        while(left <= right){
            int midValue = left+(right-left)/2;
            if(Array[midValue] == target){
                System.out.println("Element Found at index "+midValue);
                isFound = true;
                break;
            }

            else if (target > Array[midValue]){
                left = midValue + 1;
            }

            else {
                right = midValue - 1;
            }

        }
        if(!isFound){
            System.out.println("Element is not in Array");
        }

    }
}