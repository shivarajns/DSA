import java.util.*;
public class Main {
    public static void main(String[] args){
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

        boolean isFound = false;
        for(int i=0; i<N; i++){
            if(Array[i] == target){
                System.out.println("Element Found at Index " + i);
                isFound = true;
            }
        }

        if(!isFound){
            System.out.println("Element is not Present in the Array");
        }




    }
}