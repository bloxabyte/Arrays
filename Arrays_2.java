import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the element to be appended to the array : ");
            int element = in.nextInt();
            nums[i] = element;
        }
        System.out.println(Arrays.toString(nums));
        int new_len = (2 * n);
        int ans[] = new int[new_len];
        for (int j = 0; j < new_len; j++) {
            if (j == nums.length) {
                for (int k = 0; k < nums.length; k++) {
                    ans[k + n] = nums[k];
                    j++;
                }
            } else {
                ans[j] = nums[j];
            }

        }
        System.out.println(Arrays.toString(ans));

    }
}
