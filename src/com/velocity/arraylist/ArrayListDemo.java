package com.velocity.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("Bangalore");
		list.add("Delhi");
		// System.out.println(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
