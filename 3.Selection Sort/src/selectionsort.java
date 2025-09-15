public class selectionsort {
    public static void main(String[] args) {

        int[] nums = {2,9,6,8,1,7};
        classselectionsort selsort = new classselectionsort();

        System.out.println("Array Before Sort: ");
        selsort.printArray(nums);

        selsort.selectionsort(nums);

        System.out.println("Array After Sort");
        selsort.printArray(nums);


    }
}
