package com.example.Training;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
	public static void main(String[] args) {
		
		 Supplier<List<Integer>> supplier = () -> { 
		        ArrayList<Integer> a = new ArrayList<Integer>();
		        a.add(5);
		        a.add(8);
		        return a;
		    };

		    Iterator<List<Integer>> i = Stream.generate(supplier).limit(2).iterator();

		    // This shows there are elements you can do stuff with.
		    while (i.hasNext()) {
		        List<Integer> list = i.next();
		        // You could add them to your list here.
		        System.out.println(list.size() + " elements, [0] = " + list.get(1));
		    }
	}

}
