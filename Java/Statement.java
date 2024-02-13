import java.util.Scanner;
public class Statement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /* 
        System.out.println("Enter your Age :");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Eligible to vote");
        }
        else if(age<18){
            System.out.println("Not Eligible");
        }
        else{
            System.out.println("Go");
        }
        */

        //Goruping Switch
        System.out.println("Enter the Character :");
        char c = sc.next().charAt(0);
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            System.out.println("it is vowel");
            break;
            default:
            System.out.println("not vowel");
        }

    }
}
