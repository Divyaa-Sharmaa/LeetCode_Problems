public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4 };
        int target = 6;
        int num[] = twoSum(arr, target);
        System.out.println(num[0] + " " + num[1]); // Output: 0 1
    }

    public static int[] twoSum(int[] numbers, int target) {
        int idx1 = 0;
        int idx2 = numbers.length - 1;
        System.out.println("idx1: " + idx1 + " idx2: " + idx2);
        while (idx1 < idx2) {
            if (numbers[idx1] + numbers[idx2] == target) {
                return new int[] { idx1 + 1, idx2 + 1 };
            } else if (numbers[idx1] + numbers[idx2] >= target) {
                idx2--;
            } else {
                idx1++;
            }
        }
        return new int[] { idx1 + 1, idx2 + 1 };
    }
}
