import java.util.Scanner;

public class LeapYear {
    public static void main (String args[]){


        int year = 2030;

        if ((year % 400 ==0) || (year % 4 ==0 && year % 100 != 0 )){
            System.out.println(year + "is a Leap Year");
        }else
            System.out.printf(year +  "is NOT a Leap Year");
    }
}