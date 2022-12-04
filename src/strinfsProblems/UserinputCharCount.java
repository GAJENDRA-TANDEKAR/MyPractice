package strinfsProblems;

import java.util.Scanner;

public class UserinputCharCount {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter string  = ");
           // String str = "Welcome to Javatpoint portal";
            String str = sc.next();
            System.out.println( " entred str  = " + str);

            System.out.println(" enter charter = ");
            char[] ch = sc.next().toCharArray();
            int len = ch.length;
            int count = 0;
            System.out.println();



        }
    }

