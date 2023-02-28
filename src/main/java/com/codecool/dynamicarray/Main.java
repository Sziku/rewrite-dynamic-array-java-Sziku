package com.codecool.dynamicarray;

public class Main {
    public static void main(String[] args) {

        System.out.println("Execute all tests to check your work.");
        DynamicArray array = new DynamicArray();
        System.out.println("Array ini capacity: "+array.getCapacity());
        System.out.println("Array ini size: "+array.size());
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

       // array.insert(600,999);
        //array.insert(600,999);
       // array.insert(600,999);
        array.add(5);
        array.insert(100,666);
        array.remove(5);
        //array.add(6);
        //array.add(7);
        //array.add(8);
        //array.add(9);
        //array.add(10);
        //array.add(11);

        System.out.println("Array after size: "+array.size());
        System.out.println("Array after capacity: "+array.getCapacity());
        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        System.out.println(array.get(4));
        //System.out.println(array.get(5));
        //System.out.println(array.get(6));
        //System.out.println(array.get(7));
        //System.out.println(array.get(8));
        //System.out.println(array.get(9));
        //System.out.println(array.get(10));
        //System.out.println(array.get(11));
        //System.out.println(array.get(18));
    }
}
