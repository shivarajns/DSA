public class classselectionsort {
    public static void selectionsort(int[] nums){
        int n = nums.length;
        int maxIndex=-1;
        int temp = 0;
        for(int i=0; i<n; i++){
            maxIndex=i;

            for(int j=i+1; j<n; j++){
                if(nums[maxIndex] > nums[j]){
                    maxIndex =j;
                }
            }

            temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex]=temp;
        }
    }

    public static void printArray(int[] nums){
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
