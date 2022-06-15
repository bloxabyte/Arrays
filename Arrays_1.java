import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1 {
    static int i;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in the array : ");
        int length;
        length = in.nextInt();
        if ((length<=1000)&(length>=1)){
            int[] nums = new int[length];
            int cnt = 0;//counter for value 0
            for (int i = 0; i<length ; i++){
                    System.out.print("Enter the element to be appended to the array : ");
                    int element = in.nextInt();
                    if (0==element&(i==0)){
                    nums[i] = element;
                    cnt = 1;
            }
                    else if(cnt==0&nums[i]==0){   // here when nums[i]=0 , the RHS is the value of element
                        nums[i] = element;
                    }
                    else if(nums[i]!=element){
                        nums[i] = element;
                }
                    else{
                        System.out.println("You have entered a number that already exists in the array . Try again.");
                        i--;

                    }
                }

            int[] ans = new int[length] ;
            for (int j = 0;j<nums.length;j++){
                ans[j]=nums[nums[j]];
            }
            System.out.print("Required array is : ");
            System.out.println(Arrays.toString(ans));

        }else{
            System.out.println("Invalid length of array specified.");
        }

    }
}
