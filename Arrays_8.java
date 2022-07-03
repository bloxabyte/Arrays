import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array you would like to enter : ");
        int length = in.nextInt();
        int[] nums = new int[length];
        if ((length>=2)&(length<=100)){
            for (int i = 0;i<length;i++){
                System.out.print("Enter the element you would like to enter at index "+i+" : ");
                int element = in.nextInt();
                if ((element>=0)&(element<=100)){
                    nums[i] = element;
                }
                else{
                    System.out.println("The element you have just entered violates the constraints given.Try again.");
                    i--;
                }
            }
            ArrayList<Integer> ans = new ArrayList<Integer>();
            int cnt = 0;
            int j = 0;
            while(j<length){
                int k = 0;
                while(k<length){
                    if (nums[k]<nums[j]){
                        cnt++;
                    }
                    k++;
                }
                ans.add(cnt);
                cnt = 0;
                j++;
            }
            System.out.println("The required array is : "+ans);
        }
        else{
            System.out.println("The length of the array nums you just entered violates the given constraints.");
        }
    }
}
