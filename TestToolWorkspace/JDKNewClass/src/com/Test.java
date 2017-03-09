package com;

/**
 * Created by heshuzhan on 2017/3/8.
 */
import  java.util.*;
public class Test {
    public static void main(String args[]){

        int a =1;
        int b = 2;
        lambda la = new lambda();
        int c = la.add(a,b);
        System.out.println(c);
        System.out.print("ok");

     //System.out.println((int even, int odd) -> 1 + 2);
        List list = new ArrayList();
        list.add("ok");
        list.add("hello");
        list.add("jump");
        list.add("dongdong");
        list.forEach(n -> System.out.println(n));
        list.forEach(System.out::println);

    }
}
