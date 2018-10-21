package practice.java.oopsconcept;

public class TightlyCapsulatedClass {

}

/*
 * The class is said to be tightly encapsulated if and only if each and every variable declared as private.
 * Whetger class contains corresponding getter /setter methods are not and whether these methods declared as public or not these things we don't need to check
 * 
 * public class Account{
 * private double balance;
 * public double getBalance(){
 * return balance;
 * }
 * }
 * 
 * which of the following classes are tightly encapsulated
 * 
 * class A {
 * private int x=10; }
 * class B extends A {
 * int y =20; }
 * class C extends A {
 * private int z =30; }
 * 
 * class A and C are tightly encapsulated class
 * 
 * class A { int x =10; }
 * class B extends A { private int y=20; }
 * class C extends B { private int z =30; }
 * 
 * none of the above classes are tightly encapsulated as parent class A is not tightly encapsulated, then no child class is tightly encapsulated
 */
