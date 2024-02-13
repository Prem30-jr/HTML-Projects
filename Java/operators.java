public class operators {
    public static void main(String args[]){
        /* Arithmetic operators
        int a = 10, b = 20;
        System.out.println("Addition :" + (a+b));
        System.out.println("Subtraction :" + (a-b));
        System.out.println("Multiplication :" + (a*b));
        System.out.println("Division :" + (a/b));
        System.out.println("Modulu :" + (a%b));
        */

        //Arithmetic Assignment operator
        /* 
        int a = 10;
        System.out.println("Add :"+(a+=10));
        System.out.println("Sub :"+(a-=10));
        System.out.println("Mul :"+(a*=10));
        System.out.println("Divide :"+(a/=10));
        System.out.println("Mod :"+(a%=10));

        */

        //Relational Operator
        /* 
        int a = 30, b = 20;
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        */

        //Logical operator
        /* 
        int m1 = 20, m2 = 12;
        System.out.println("Check :" + (m1==m2 || m1>m2));
        System.out.println("Check :" + (m1==m2 && m1>m2));
        System.out.println("Check :" + (m1==m2 ^ m1>m2));

        */


        //Conditional operator
        /* 
        int a = 10, b = 20;
        System.out.println("Ternary Operator :" + (a > b ? "True" : "False"));
        */

        //Unary Operator
        /* 
        int a = 100;
        System.out.println("Unary :" + (a));
        a++;
        System.out.println("Unary :"+ (a));
        for( int i = 1;i<=a;i++)
        {
            i++;
            System.out.println("For loop :"+i);
        }

        */

        //Bitwise shift operator
        int a = 10, b = 20;
        System.out.println("Bitwise :" + (a&b));
    }
    
}
