package com.codecool.dynamicarray;

import java.util.Arrays;

public class DynamicArray {

    private int capacity;

    private int index=0;

    private int[] array;
    public DynamicArray(int capacity) {
        this.capacity=capacity;
        array= new int[capacity];
    }

    public DynamicArray() {
        this.capacity=4;
        array= new int[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {

        return index;

    }

    public void add(int value) {

        if(index >= capacity){
            int[] temp = array;
            capacity=capacity*2;
            array = new int[capacity];
            for (int i =0; i<temp.length;i++){
                array[i]=temp[i];
            }
        }
        array[index]=value;
        index++;
    }

    public int get(int index)
    {
        if(index>=this.index){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public void remove(int indexToBeRemoved) {
        if(indexToBeRemoved<0){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(indexToBeRemoved>this.index){
            throw new ArrayIndexOutOfBoundsException();

        }
        this.index--;
        int[] temp = new int[array.length-1];
        for (int i=0; i<temp.length; i++){
            if(i<indexToBeRemoved-1){
                temp[i]=array[i];
            }
            if (i>indexToBeRemoved-1){
                temp[i]=array[i+1];
            }
        }

        array=temp;
    }

    public void insert(int index, int newValue) {
        if(index<0){
            throw new ArrayIndexOutOfBoundsException();
        }

        if (index>capacity-1){
            index=this.index;
            capacity*=2;
        }

        this.index++;

        int[] temp = new int[capacity];

        for (int i=0; i<this.index;i++){
            if(i<index){
                temp[i]=array[i];
            } else if (i==index) {
                temp[i]=newValue;
            }else {
                temp[i]=array[i-1];
            }
        }
        array=temp;
    }

    @Override
    public String toString(){
        String temp="";
        if(index<1){
            return "[]";
        }
        temp+="[";
        for (int i =0; i<this.index; i++){
            temp+=Integer.toString(array[i]);
            if(i<this.index-1){
                temp+=", ";
            }
        }
        temp+="]";
        return temp;
    }
}
