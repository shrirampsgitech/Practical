package org.example;

import java.util.*;
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c) {
            System.out.printf("Largest Number: %d",a);
        }
        else if(b>a && b>c){
            System.out.printf("Largest Number: %d",b);
        }
        else{
            System.out.printf("Largest Number: %d",c);
        }
    }
}