import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class goodpairs{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array nums : ");
        int length = in.nextInt();
        if ((length>=1)&(length<=100)){

        
        ArrayList<Integer> nums = new ArrayList<Integer>(); 
        for (int i = 0; i<length;i++){
            System.out.print("Enter the element you would like to add to the array nums at index "+i+" : ");
            int element = in.nextInt();
            if((element>=1)&(element<=100)){
            nums.add(element);
        }    
        }
        int cnt = 0;
        int i = 0;
        while (i<length){
            int j = 0;
            while (j<length){
                if ((nums.get(i)==nums.get(j))&(i<j)){
                    cnt+=1;
                }
                j+=1;
            }
            i+=1;
        }
        System.out.print("The number of good pairs in the array nums = "+cnt);
}
    else{
        System.out.println("The length of the array nums you have entred violates the given constraints.");
    }
}
}
