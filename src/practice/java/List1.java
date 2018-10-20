package practice.java;

public interface List1 {
 
}

/* 
 * List Interface 
 * 		List is child interface of collection
 * 		if we want to represent group of individual object as single entity, 
 * 		where duplicates are allowed and insertion order must be preserved then we should go for list
 * 		We can preserve insertion order via index and we can differentiate duplicate objects by using index, 
 * 		hence index will play very imp role in list
 * 
 * List interface defines followingMethods :
 * 1. void l.add(int index,object 0) : l.add(3,"A");
 * 2. boolean l.addAll(int index , Collection c);
 * 3. Object remove(int index)
 * 4. Object get(int index)
 * 5. Object set(int index, object o)
 * 6. int indexOf(object o)
 * 7. int lastIndexOf(object o)
 * 8. ListIterator listIterator() : 
 * 
 * Array :
 * underlying data structure is Resizable Array is growable array
 * Duplicates are allowed
 * insertion order is preserved
 * heterogeneous objects 
 * null insertion is possible
 * 
 * Except Tree set and Tree Map heterogeneous objects are allowed
 * 
 *  Array new capacity : 
 * 
 */