import java.util.Arrays;
import java.util.Scanner;

public class Arrays_5 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n  = in.nextInt();
        if ((n>=1)&(n<=500)){
            int nums[] = new int[2*n];

            int pointer_1 = 1;
            int pointer_2 = n;
            for (int i = 0;i<(2*n);i++){
                System.out.print("Enter the number you would like to append to the array nums : ");
                int element = in.nextInt();
                if ((element>=1)&(element<=1000)){
                    nums[i] = element;
                }
            }
            int[] ans = new int[2*n];
            for (int j = 0;j<(2*n);j++){
                if (j==0){
                    ans[j] = nums[j];
                }
                else if((j%2)!=0){
                    ans[j] = nums[pointer_2];
                    pointer_2++;
                }
                else{
                    ans[j] = nums[pointer_1];
                    pointer_1++;
                }
            }
            System.out.println("Required array is : "+ Arrays.toString(ans));

    }
}
}