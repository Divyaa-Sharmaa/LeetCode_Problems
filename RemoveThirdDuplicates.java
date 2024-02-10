public class RemoveThirdDuplicates {
    public static void main(String[] args) {
        int arr[] = new int[] { 1,1,1,2,2,3 };
        System.out.println("element: " + remove_duplicates(arr));
    }

    public static int remove_duplicates(int[] arr) {
        int count=0;
        int index = 0;
        for(int i=0; i<arr.length;i++){
            if(i!=arr.length-1){     
              if(arr[i]==arr[i+1]){
                count++;
                if(count<2){
                arr[index] = arr[i];
                index++;
                }
              } 
              else{
                arr[index] = arr[i];
                index++;
                count=0;
              } 
            }
            else{
                arr[index] = arr[i];
                index++;
            }
        }
        return index;

    }
}
