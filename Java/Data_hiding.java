//Data hiding Getter and Setter Function

import java.util.Scanner;

class data{
    private int length, width;
    int getterLength(){
        return length;
    }
    void setterLength(int l){
        length = l;
    }
    int getterWidth(){
        return width;
    }
    void setterWidth(int w){
        width = w;
    }
    int area(){
        return length*width;
    }
}
public class Data_hiding {
    public static void main(String args[]){
        data ob1 = new data();
        ob1.setterLength(2);
        ob1.setterWidth(5);
        System.out.println("Area :"+ob1.area());

    }
}
