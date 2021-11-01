package com.bridgelabzAddress;
import java.util.*;
public class MainLinkedList {
    public static void main(String[] arg) {
        LinkedList obj = new LinkedList();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number");
            int d = s.nextInt();
            obj.push(d);
        }
        System.out.println("The pushed data are:");
        obj.traverse();
        obj.pop();
        System.out.println("Poped elements are");
        obj.traverse();
        System.out.println("The last deletd data is");
        obj.traverse();
        System.out.println(obj.search(30));

    }

}
