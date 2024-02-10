public class ContestQuestions {
    public static void main(String[] args) {
        int arr[] = new int[] { -9, 9, -6, 6 };
        String str = "abacaba";
        int k = 3;
        System.out.println("element: " + returnToBoundaryCount(arr));
        System.out.println("element: " + minimumTimeToInitialState(str, k));

    }

    public static int returnToBoundaryCount(int[] nums) {
        int boundaryValue = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            boundaryValue += nums[i];

            // boundaryValue = Math.abs(boundaryValue);
            if (boundaryValue == 0)
                count++;
        }
        return count;

    }

    public static int minimumTimeToInitialState(String word, int k) {
        String str = "";
        int count = 0;
        for(int i=0;i<word.length();i++){
            str = word.substring(0, k);
            word = word.substring(k );
            word = word + str; 
            System.out.println(word);
            }
        return count;
    }
   
}
