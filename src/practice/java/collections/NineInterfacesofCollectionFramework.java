package practice.java.collections;

public interface NineInterfacesofCollectionFramework {

}

/*
 * 9 Interfaces of Collection Framework :
 * 
 * 1. Collection :1.2V
 * 			Root Interface of collection framework
 * 			If we want to represent group of individual objects as single entity then we should go for collection
 * 			Collection defines most common which are applicable for any collection objects
 * 			There is no concrete class which implements collection interface directly
 * 	
 * Difference between collection(I) and Collections(C) :
 * 		Collections.sort(l);
 * 		Collection is an Interface , if we want to represent group of individual objects as single entity then we should go for Collection
 * 		Collections is an Utility class which is present in java.util package to define several utility methods for collection objects like sorting searching etc.				
 * 
 * 2. List : 1.2V
 * 			Child Interface of Collection(I)
 * 			If we want to represent group of individual objects as single entity where duplicates are allowed and insertion order must be preserved then we should go for List
 * 			Implementation classes :   ArrayList :1.2V,
 * 									   LinkedList : 1.2V,
 * 									   Vector 1.0V(Legacy Classes)
 * 									   Stack 1.0V(Legacy Classes)
 * 
 * 3. Set : 1.2 V
 *			Child interface of Collection
 *			When insertion order is not preserved and (Duplicates are not allowed)Unique elements are needed then set is used 
 *			Implementation Classes :	HashSet : 1.2
 *										LinkedHashSet : 1.4
 *
 *
 * 4. SortedSet : 1.2 V
 * 			Child Interface of Set
 * 			If we want to represent group of individual objects as single entity where duplicates are not allowed and all objects should be 
 * 			inserted according to some sorting order, then we should go for Sorted Set
 * 
 * 5. NavigableSet : 1.6V
 * 			Child interface of sorted set , it contains several methods for navigation purpose
 * 			Provide several methods for navigation purpose
 * 			Implementation Class  : TreeSet
 * 
 * Difference between List and Set 
 * List : 
 * Duplicates are allowed
 * Insertion order preserved
 * 
 * Set:
 * Duplicated not allowed
 * Insertion order not preserved
 * 
 * 6. Queue : All concepts of queue are introduced in 1.5V
 * 			Queue is child interface of collection
 * 			Before processing if we want to represent group of individual objects as single entity then Queue is used : FIFO
 * 			Queue implements FIFO ,But based on our requirement we can implement our own priority order as well
 * 			Implementation Classes : PriorityQueue
 * 									 BlockingQueue : PriorityBlockingQueue
 * 													 LinkedBlockingQueue
 * 7. Map : 1.2 V
 * 			All above interfaces(Collection,List,Set,sorted Set,Navigable Set and Queue) meant for representing group of individual object ...
 * 			When we want to represent group of objects as Key,Value pairs then Map is used
 * 			Map is not child interface of collection
 * 			Implementation Classes : HashMap : 1.2V > LinkedHashMap : 1.4V
 * 									WeakHashMap : 1.2V
 * 									IdentityHashMap : 1.4V
 * 					Dictionary 	>	Hashtable > Properties (Legacy Classes :1.0 V)
 * 
 * 8. SortedMap : 1.2V
 * 			It is child interface of map
 * 			If we want to represent group of key value pair according to some sorting order of keys then we should go for Sorted Map		
 * 			In Sorted map sorting should be based on Key but not based on value
 * 
 * 9. NavogableMap : 1.6V
 * 			It is child interface of SortedMap
 * 			It defines several methods for navigation purposes
 * 			Implementation Class : TreeMap : 1.2V
 * 
 * Following are legacy characters present in collection framework :
 * 			Enumeration
 * 			Dictionary
 * 			Verctor
 * 			Stack
 * 			Hashtable
 * 			Properties
 * 
 */
