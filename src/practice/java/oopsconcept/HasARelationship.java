package practice.java.oopsconcept;

public class HasARelationship {

}

/* Has A relationship :
 * 1. Commonly used
 * 2. car has a engine reference
 * 3. Also known as Composition or aggregation
 * 4. no specific keyword to implement has a relationship, most of the time we use new keyword
 * 5. main advantage of has a relationship is re-usability
 * 6. class Engine { }
 * class Car { Engine e = new Engine(); } : car has a Engine reference
 * 
 * DIfference between Composition and Aggregation :
 * 1. without existing container object if there is no chance of existing contained objects then container and contained objects are strongly associated and this strong association is nothing but composition
 * Without university department can't exist
 * 2. without existing container object if there is chance of existing contained objects then container and contained objects are weakly associated and this weak association is nothing but aggregation
 * without department professors can exist 
 * 3. In Composition object are strongly associated whereas in aggregation objects are weakly associated
 * 4. In Composition container object holds directly contained objects , whereas in aggregation container object holds just a reference of contained objects
 * 
 * when to go for Is A or Has A relationship :
 * 1. if we want total functionality of class automatically then we should go for Is A relationship
 * 2. If we want part of functionality of class then we should go for Has A Relationship
 */
