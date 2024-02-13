import java.util.Scanner;
public class loops {
    public static void main(String args[]){
        System.out.println("Enter the Limit :");
        Scanner sc = new Scanner(System.in);
        //While Loop
        /* 
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        */
        //Do while Loop
        /* 
        int n = sc.nextInt();
        int i = 2;
        do{
            System.out.println(i);
            i+=2;
        }while(i<=n);
        */


        //For loop
        /* 
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);

        }
        */

        //Enhanced For loop
        /* 
        int numbers[] = {10,20,30};
        for(int n : numbers){
            System.out.println(n);
        }
        */

        //Nested for loop
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println("");
        }
    }
}
