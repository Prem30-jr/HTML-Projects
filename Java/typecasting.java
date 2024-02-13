/* Widening casting
 * byte -> short -> char -> int -> long -> float -> double
 Narrow casting
   double -> float -> long -> int -> char -> short -> byte
 */


public class typecasting {
    public static void main(String args[]){
        int a = 10;
        double b = a, d = 3122.1231;
        int c = (int)d;
        System.out.println("Int :" + a);
        System.out.println("Double :" + b);
        System.out.println("Int :" + c);
    }
    
}
