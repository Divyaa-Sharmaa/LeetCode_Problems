public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,2,2};
        System.out.println("element: " + removeDupli(arr));
    }

    public static int remove_duplicates(int[] arr){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if((i!=arr.length-1) &&  arr[i]!=arr[i+1] ){
                arr[index] = arr[i];
                index++;
            }
            if(i==arr.length-1){
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
    }

    // the above one is correct and performing in 1ms
    // but optimized one is below in 0ms:
   public static int removeDupli(int[] nums){
    int j = 1;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
   }
}
