import java.util.Scanner;

public class Arrays_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of customers : ");
        int customer = in.nextInt();
        System.out.print("Enter the number of banks : ");
        int banks = in.nextInt();
        int[][] accounts = new int[customer][banks];
        int max_amount = 0;
        for (int rows = 0;rows<customer;rows++){
            for(int columns = 0;columns<banks;columns++){
                System.out.print("Enter the money at "+"bank "+(columns+1)+" of "+"customer "+(rows+1)+ " : ");
                accounts[rows][columns] = in.nextInt();
            }
        }
        for (int i = 0;i<accounts.length;i++){
            int sum = 0;
            for (int j = 0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if (sum>max_amount){
                max_amount = sum;
            }
            else{
                continue;
            }
        }
        System.out.println("The wealth that the richest customer has : "+max_amount);
    }
}
