package com.bridgelabzAddress;
import java.util.*;
public class MainLinkedList {
    public static void main(String[] arg){
        LinkedList n=new LinkedList();
        Scanner s= new Scanner(System.in);
        for(int i =0; i<4;i++){
            System.out.println("Enter a number");
            int d=s.nextInt();
            n.push(d);
        }
        System.out.println("The pushed data are:");
        n.traverse();
        n.pop();
        System.out.println("Poped elements are");
        n.traverse();
        }

}

