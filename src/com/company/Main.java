package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(15);
        hashSet.add(16);
        System.out.println("Qaydasız (not ordered) strukturu : " + hashSet);
        hashSet.remove(15);
        System.out.println("remove() metodundan sonra HashSet : " + hashSet);
        System.out.println(" HashSet 12-ni ehtiva edir mi ? : " + hashSet.contains(12));
        System.out.println("HashSet-in ölçüsü = " + hashSet.size());
        hashSet.add(22);
        System.out.println("Massivə çevrilmiş HashSet-in elementləri : ");
        Object[] massivEdedler = hashSet.toArray();
        for (Object eded : massivEdedler) {
            System.out.print(eded + ", ");
        }
        System.out.println();
        System.out.println("HashSet boşdur mu? " + hashSet.isEmpty());
        hashSet.clear();
        System.out.println("clear() metodundan istifadə etdikdən sonra : " + hashSet);
        System.out.println("HashSet boşdur mu? " + hashSet.isEmpty());
        hashSet.add(155);
        hashSet.add(144);
        hashSet.add(155);
        hashSet.add(null);
        System.out.println(hashSet);
    }
}
