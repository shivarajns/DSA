import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");

        int N=scnr.nextInt();
        int[] nums = new int[N];
        int temp=0;
        int steps=0;


        for(int i=0; i<N; i++){
            System.out.print("Enter the " + (i+1) + "th Element of an Array: ");
            nums[i] = scnr.nextInt();
        }


        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N-i-1; j++)
            {
                steps++;
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println("After Sort: "+ Arrays.toString(nums));
        System.out.println("Number of steps taken: " + steps);
    }

}
