import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1 {
    static int i;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in the array : ");
        int length;
        length = in.nextInt();
        //System.out.println("Enter the card");
        if (length == 1) {
            int[] arr = new int[1];
            System.out.print("The length of your array is 1. Enter the element you would like to enter : ");
            arr[0] = in.nextInt();
            System.out.println(Arrays.toString(arr));
        } else if ((length <= 1000) & (length > 1)) {
            int[] nums = new int[length];
            int cnt = 0;//counter for value 0
            for (int i = 0; i < length; i++) {
                System.out.print("Enter the element to be appended to the array : ");
                int element = in.nextInt();
                if (0 == element & (i == 0)) {
                    nums[i] = element;
                    cnt = 1;
                } else if (cnt == 0 & element == 0) {   // here when nums[i]=0 , the RHS is the value of element
                    nums[i] = element;
                } else if (nums[i] != element) {
                    nums[i] = element;

                } else {
                    System.out.println("You have entered a number that already exists in the array . Try again.");
                    i--;

                }
            }

            int[] ans = new int[length];
            int cnt_2 = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= nums.length) {
                    System.out.println("The element " + nums[j] + " is greater than or equal to the length of the array you have entered. Try again.");
                    cnt_2 += 1;
                } else {
                    ans[j] = nums[nums[j]];
                }
            }
            if (cnt_2 == 0) {
                System.out.print("Required array is : ");
                System.out.println(Arrays.toString(ans));
            }

        }
        else {
            System.out.println("Invalid length of array specified.");
        }
    }
}

