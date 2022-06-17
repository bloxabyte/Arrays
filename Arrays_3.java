import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Arrays_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int length = in.nextInt();
        if ((length >= 1) & (length <= 1000)) {
            int[] nums = new int[length];
            for (int i = 0; i < nums.length; i++) {
                System.out.print("Enter the element to be appended to the array at index " + i + " : ");
                int element = in.nextInt();
                if ((element >= -(Math.pow(10, 6))) & (element <= (Math.pow(10, 6)))) {
                    nums[i] = element;
                } else {
                    System.out.println("The element " + element + " you just entered is violating the given constraints.Try again. ");
                    i--;
                }
            }
            int[] ans = new int[length];
            int cnt = 1;
            int sum=0;
            for(int j = 0;j<nums.length;j++){
                int k ;
                for(k = j;k<cnt;k++){
                        sum+= nums[k];
                        ans[j] = sum;
                }
                cnt++;
            }
            System.out.print("The required array is : ");
            System.out.println(Arrays.toString(ans));
        }
     else {
            System.out.println("The length of the array you have entered is violating the constraints.Try again.");
        }
    }
}