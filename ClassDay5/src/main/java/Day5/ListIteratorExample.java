package Day5;


import java.util.*;

public class ListIteratorExample {

 public static void main(String[] args) {
// TODO Auto-generated method stub

 LinkedList<String> ar = new LinkedList<String>();

 ar.add("India");
ar.add("China");
ar.add("Japan");
ar.add("Nepal");
ar.add("Nepal");
System.out.println("List elements in forward direction..");
ListIterator ltr = ar.listIterator();
while(ltr.hasNext())
System.out.println(ltr.next());
System.out.println("List elements in backward direction..");
while(ltr.hasPrevious())
System.out.println(ltr.previous());

 }

}