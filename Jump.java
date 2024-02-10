public class Jump {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println("he jumped? " + canJump(arr));
    }

    public static boolean  canJump(int[] nums) {
        if (nums == null || nums.length <= 1){
            return true;
        }
        int i = 0;
        if(nums[i]!=0){
            i++;
            int jump = nums[i];
            if(nums[jump]==0){
                if(jump==nums.length-1) 
                   return true;
                return false;   
            }
            else{
                if(nums[jump]==nums.length-1) return true;
                jump += nums[jump];
            }
        }
        return false;
    }
}
