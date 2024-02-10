class RemoveElement {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 3, 4, 5, 6 };
        int value = 4;
        System.out.println("element: " + remove_element(arr, value));
    }

    public static int remove_element(int[] arr, int val) {
        if (arr == null || arr.length == 0)
            return 0;
        int count = 0;
        int nums[] = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                nums[k] = arr[i];
                k++;
            }
        }
        return count;
    }

    // the above one is correct but not the solution of leetcode problem .So,
    // the below one is for leetcode problem Solution - RemoveElement

    public static int removeEle(int[] arr, int val) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}