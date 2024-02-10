public class RotateArray {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(arr,k);
    }

    public static void rotateArray(int[] nums, int k){
        // if (nums == null || nums.length == 0) return 0;
        for(int i=0;i<k;i++){
            int n = nums.length-1;
            int temp = nums[n];
            for(int m=n;m>0;m--){
                nums[m]=nums[m-1];
            }
            nums[0] = temp;
            
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        // return nums;
        // return 1;
    }
    
}
