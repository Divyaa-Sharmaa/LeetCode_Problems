import java.util.*;

public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = new int[] {6,6,6,7,7};
        System.out.println("element: " + majorityElements(arr));
    }
    
    public static int majorityElements(int[] nums){
        int count = 0;
        int num = 0;
        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i++){
            if(nums.length==1){
            return nums[i];
        }
            if(i!=nums.length-1){
                if(nums[i]==nums[i+1]){
                    count++;
                    num = nums[i];
                }    
                else{
                    count = 0;
                }
            }else{
                if(nums[i]==nums[i-1])
                 count++;
                else{
                    count = 0;
                }
            }
        }
        System.out.println(count);
        return num;
    }
}
