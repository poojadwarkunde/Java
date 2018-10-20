package practice.java;

public class IsARelationship {

}

/* 
 * Also known as inheritance
 * Main advantage of is a relationship is code reusability
 * by using extends keyword we can implement is a relationship
 * class P {
 * public void m1(){ sop ("Parent"); } 
 * }
 * class C extends P {
 * public void m2 () { sop ("Child"); } 
 * }
 * 
 * class Test {
 * p s v main(String[] args)
 * {
 * 1. P p = new P();
 * p.m1();
 * p.m2(); -- will get compile time error for this line as cannot find symbol
 * 
 * 2. C c = new C();
 * c.m1();
 * c.m2();
 * 
 * 3. P p1 = new C();
 * p1.m1();
 * p1.m2(); -- will get compile time error for this line as cannot find symbol
 * 
 * 4. C c new P(); -- will get compile time error as incompatible types , found P, required C
 * 
 * Conclusions :
 * 1. Whatever methods parent has by default available to child, and hence on child reference we can call both parent and child methods
 * 2. whatever methods child has not available to parent and hence on parent reference we can't call child specific methods
 * 3. Parent reference can be used to hold child object but using the reference we can't child specific methods, but we can call methods present in parent class
 * 4. parent reference can be used to hold child object, but child ref can not be use to hold parent object
 * 
 * the most common methods which are applicable for any type of child, we have to define in parent class
 * Specific methods which are applicable for child, we have to define in child class
 * 
 * Total JAVA API IS IMPLEMENTED BASED ON IH=NHERITANCE CONCEPT.
 * THE most common methods which are applicable for any java object are defined in JAVA Object class, and hence every class in java is child class of object either directly or indirectly
 * Hence object class methods by default available to every class without re-writing , object class acts as root for all java classes
 * throwable class defines most common methods required for every exception and error classes and hence this class acts as root for java exception hierarchy
 * 
 * Multiple Inheritance :
 * 
 * A JAVA class can't extend more than one class at a time, hence java wont provide support for multiple inheritance in classes
 * if our class doesn't extend any other class then only our class is direct child class of object
 * If our class extends any other class then our class is indirect child class of object -- Multilevel inheritance
 * either directly or indirectly java wont provide support w.r.t classes
 * 
 * WHy java wont provide support for multiple inheritance :
 * 1. There may be chance of ambiguity problem and hence java wont provide support for multiple inheritance
 * 2. But interface can extend any no of interfaces simultaneously hence java provide support for multiple inheritance for interfaces 
 * WHy ambiguity problem wont be there any interfaces 
 * 3. even though multiple method declarations are available but implementation is unique and hence there is not chance of ambiguity problem in interfaces
 * 4. Strictly speaking through interfaces we wont get any inheritance
 * 
 * Cyclic inheritance :
 * CI is not allowed in java of course it is not required
 * class A extends A { }
 * class A extends B {} class B extends A {}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
*/