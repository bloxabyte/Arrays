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

            for (int i = 0; i<length ; i++){
                System.out.print("Enter the element to be appended to the array : ");
                int element = in.nextInt();
                for (int j =0 ;j< nums.length;j++){
                    if (nums[j]!=element){
                        nums[j] = element;
                    }
                    else{
                        System.out.println("You have entered a number that already exists in the array. enter the number again.");
                        j-=1;
                        break;
                    }
                }
            }
            int[] ans = new int[length] ;
            for (int j = 0;j<nums.length;j++){
                ans[j]=nums[nums[j]];
            }
            System.out.print("Required array is : ");
            System.out.println(ans);

        }else{
            System.out.println("Invalid length of array specified.");
        }

    }
}
