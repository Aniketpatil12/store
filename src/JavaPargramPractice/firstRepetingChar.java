package JavaPargramPractice;

import java.util.Scanner;

public class firstRepetingChar {
    public  static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the data ");
        String data = obj.next();
       Character result = data.chars().mapToObj(i ->(char)i).filter(ch -> data.indexOf(ch)!= data.lastIndexOf(ch)).findFirst().orElse(null);

       System.out.print("hello there! return content info fount");
        System.out.print("feature changes for PR ");
       System.out.println(result);
    }
}
