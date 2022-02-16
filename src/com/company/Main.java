package com.company;

public class Main {

    public static void main(String[] args) {
//        Car<Integer> car = new Car<>(23,12);
//        Car<Double> car2 = new Car<>(34.23,21.84);
//        car.print();
//        car2.print();
//        bike<Integer, String> bike1 = new bike<>(32,"MrS");
//        bike1.print();
//        square<Double> s = new square<>(4.0);
//        System.out.println(s.ans());
//        Cat a = new Cat(23,42,1);
//        a.print();
//        add<Integer> a = new add<>(2,3);
//        System.out.println(a);
        Integer[] arr = {23,42,12,5,34,4};
        Double [] arrd = {23.3,32.23,54.41};
        display(arr);
    }
    public static <T>void display(T[] arr){
        for (T x:
             arr) {
            System.out.print(x);
        }
        System.out.println();
    }
}

//class Car<T>{
//    T height;
//    T width;
//    Car(T height, T width){
//        this.height = height;
//        this.width = width;
//    }
//    void print(){
//        System.out.println(height+": height + width: "+width);
//    }
//}
//
//class bike<T,V>{
//    T price;
//    V model;
//    HashMap<T,V> map = new HashMap<>();
//
//    bike(T price, V model){
//        this.price = price;
//        this.model = model;
//    }
//    void print(){
//        System.out.println(price+": price and model: "+model);
//    }
//
//}
//
//class square<T extends Double>{
//    T obj;
//    square(T obj){
//        this.obj = obj;
//    }
//    int ans(){
//        return obj.intValue()*obj.intValue();
//    }
//}

class Animal{
    int data;
    int name;

    public Animal(int data, int name) {
        this.data = data;
        this.name = name;
    }
}
class Cat extends Animal{
    int leg;

    public Cat(int data, int name, int leg) {
        super(data, name);
        this.leg = leg;
    }
    void print(){
        System.out.println(data+" "+name+" "+leg);
    }
}

class add<T extends Number>{
    T a; T b;
}
