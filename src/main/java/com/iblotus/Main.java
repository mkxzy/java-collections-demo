package com.iblotus;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Set<String> books = new HashSet<String>();

        //注意List是实现Collection接口的
        List list = new ArrayList();
        double array[] = { 112, 111, 23, 456, 231 };
        for (int i = 0; i < array.length; i++) {
            list.add(new Double(array[i]));
        }
        Collections.sort(list);
        for (int i = 0; i < array.length; i++) {
            System.out.println(list.get(i));
        }

        HashSet<String> hs = new HashSet<String>();
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println("HashSet 顺序:\n"+hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("B");
        lhs.add("A");
        lhs.add("D");
        lhs.add("E");
        lhs.add("C");
        lhs.add("F");
        System.out.println("LinkedHashSet 顺序:\n"+lhs);

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("B");
        ts.add("A");
        ts.add("D");
        ts.add("E");
        ts.add("C");
        ts.add("F");
        System.out.println("TreeSet 顺序:\n"+ts);
    }
}