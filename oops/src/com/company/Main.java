package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        class Car
        {
            private double price = 100.10; public Car() {
            price = 234.5; System.out.println("object creating from class..."); }
            public double rate() { return 5*price;
            }
        }
        class Tata extends Car{
            public int price;
            double mileage; }
        class Animal{
            double weight; int legs;
            public Animal(double w,int l) {
                weight = w; legs = l;
                System.out.println("object creating from Animal class...");
            }
            public int showLegs() {
                return legs;
            }
        }
        public class Main { public static void main(String[] args) {
            Car c1 = new Car(); Car c2 = new Car(); Car c3 = new Car();
            System.out.println(c1.price); System.out.println(c2.price);
            System.out.println(c3.price); System.out.println(c1.rate());
            System.out.println(c2.rate()); System.out.println(c3.rate());
            Animal a1 = new Animal(20.4,2);
            Animal a2 = new Animal(50.4,4);
            Animal a3 = new Animal(1.4,10);
            System.out.println(a1.weight);
            System.out.println(a2.weight);
            System.out.println(a3.weight);
            System.out.println(a1.showLegs());
            System.out.println(a2.showLegs());
            System.out.println(a3.showLegs());
            Tata t1 = new Tata(); t1.price = 50;
            System.out.println(t1.price);
            System.out.println(t1.rate()); } }
    }
}
