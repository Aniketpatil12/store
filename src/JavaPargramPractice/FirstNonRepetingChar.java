package JavaPargramPractice;

import java.util.Scanner;

// 1.	Given a String, find the first non-repeated character in it using Stream functions
public class FirstNonRepetingChar {
    public static void main(String args[]){

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a String");
        String data = obj.next();

      Character result =  data.chars().mapToObj(i -> (char) i).filter(ch -> data.indexOf(ch)==data.lastIndexOf(ch)).findFirst().orElse(null);

      System.out.println(result);
    }
}
