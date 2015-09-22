package com.kong.filter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestList extends webTest{
	
	@Test
	public void test() {
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(1);
		lists.add(4);
		lists.add(3);
		lists.add(4);
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
	}
}
