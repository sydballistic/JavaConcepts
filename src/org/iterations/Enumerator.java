package org.iterations;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Enumerator {

	public static void main(String[] args) {

		// to get value one one by one we need to go for iteration
		// for iteration we use enumeration
		// enumeration is using to iterate legacy class only
		// legacy class--1)Vector 2)Hashtable

		// 1Vector
		// without generics
		Vector v = new Vector();

		v.add(10);
		v.add(40);
		v.add(30);
		v.add(50);

		System.out.println("Enumerataion");
		System.out.println("-------------");
		System.out.println("Vector Without Generics");

		Enumeration elements = v.elements();

		while (elements.hasMoreElements()) {
			Object object = elements.nextElement();
			System.out.println(object);

		}
		// 2)Hashtable
		// with generics
		Hashtable<String, String> m = new Hashtable<>();

		m.put("GT", "16");
		m.put("CSK", "13");
		m.put("LSG", "11");
		m.put("RR", "10");

		System.out.println("HashTable With Generics");

		Enumeration<String> elements2 = m.elements();
		while (elements2.hasMoreElements()) {
			String string = (String) elements2.nextElement();
			System.out.println(string);
		}

		System.out.println("=============================================");

		// for iteration we use iterator---->
		// it iterate all classes in collection
		// In iterator we can remove the specific element using remove method
		List li = new ArrayList();

		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);

		System.out.println("Iterator");
		System.out.println("--------");
		System.out.println("List Without Gnerics");

		Iterator iterator = li.iterator();

		while (iterator.hasNext()) {
			Object object = iterator.next();
			if (object.equals(30)) {
				iterator.remove();

			}
		}
		System.out.println(li);

		// with generics

		HashSet<String> h = new HashSet<>();

		h.add("RCB");
		h.add("CSK");
		h.add("DC");
		h.add("PBKS");
		
		System.out.println("HashSet with Generics");
		
		Iterator<String> iterator2 = h.iterator();
		
		while (iterator2.hasNext()) {
			String string = iterator2.next();
			System.out.println(string);
		}

	}

}
