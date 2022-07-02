import java.util.ArrayList;
import java.util.Scanner;

public class candies{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the length of the array candies : ");
        int length = in.nextInt();
        System.out.print("Enter the number of extra candies : ");
        int extracandies = in.nextInt();
        if (((length)>=2)&(length<=100)&(extracandies>=1)&(extracandies<=50)){
        int cnt = 0;
        ArrayList<Integer> candies = new ArrayList<Integer>();
        while (-1+length >= cnt){
            System.out.print("Enter element at index "+cnt+" of the array candies : ");
            int element = in.nextInt();
            if ((element>=1)&element<=100) {
                candies.add(cnt, element);
                cnt++;
            }
            else{
                System.out.println(element+" is either > 100 or < 1 . So this element is invalid. Try again.");
            }
        }
        ArrayList<Boolean> result = new ArrayList<Boolean>();
        for (int i = 0 ;i< candies.size();i++){
            int j = 0;
            int check = 1;
            int result_element_decider = (candies.get(i)+extracandies);
            while(j!=(length-1)){
                if(result_element_decider<candies.get(j)){
                    check = 0;
                }
                j++;
            }
            if(check==1){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        System.out.print("The required array is : "+result);

    }
    else{
            System.out.println("The length of the array you have entered violates the given constraints of the question.");
        }
}
}