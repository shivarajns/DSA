public class searching {
    public static void main(String[] args) {
        int[] nums = new int[10000000];
        int target = 1000;
        int result=0;

        result=(binarysearch(nums, target));
        System.out.println("Element Found (Linear Search) at index: "+result);
        result=(linearsearch(nums, target));
        System.out.println("Element Found (Binary Search) at index: "+result);

    }

    public static int linearsearch(int[] nums, int target) {
        int steps=0;

        for(int i=0; i<nums.length; i++){
            steps++;
            if(nums[i] == target){
                return i;

            }
        }
        System.out.println("Number of Steps taken by LinerSearch is " + steps);

        return -1;
    }

    public static int binarysearch(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        int steps=0;

        while(left<=right){
            steps++;
            int midValue = left + (right-left) /2;

            if(nums[midValue] == target){
                return midValue;
            }

            else if (target > midValue){
                left = midValue+1;
            }
            else {
                right = midValue-1;
            }
        }
        System.out.println("Number of Steps taken by BinarySearch is " + steps);
        return -1;
    }
}
