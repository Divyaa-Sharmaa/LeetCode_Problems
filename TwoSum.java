public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int index1 = 0,index2 = 0;
        int i=0;
        while(i!=nums.length-1){      
            for(int j=i+1;j<nums.length;j++){
                if((nums[i] + nums[j])==target){
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
            i++;
        }
        return new int[]{index1,index2};

        // another one:
        // int n = nums.length;
        // for (int k = 0; k < n - 1; k++) {
        //     for (int j = k + 1; j < n; j++) {
        //         if (nums[k] + nums[j] == target) {
        //             return new int[]{k, j};
        //         }
        //     }
        // }
        // return new int[]{};
    }
    public static void main(String[] args) {
        int[] n= new int[]{3,2,3};
        int arr[] = twoSum(n,6);
        System.out.println("Index of first element : "+arr[0]);
        System.out.println("Index of second element: "+arr[1]);
    }
}
