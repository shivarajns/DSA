public class searching {
    public static void main(String[] args) {
        int[] nums = {10,50,70,100,534};
        int target = 534;
        int result=0;

        result=(binarysearch(nums, target));
        System.out.println(result);
        result=(linearsearch(nums, target));
        System.out.println(result);

    }

    public static int linearsearch(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarysearch(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;

        while(left<=right){
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

        return -1;
    }
}
