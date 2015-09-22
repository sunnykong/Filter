package com.kong.filter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.kong.json.JSONSerializerUtils;
import com.kong.strategy.Cat;
import com.kong.strategy.CatAgeComparator;
import com.kong.strategy.CatNameComparator;
import com.kong.strategy.Sort;

public class strategyTest {
	
	@Test
	public void test() {
//		Cat one = new Cat(1, "mimi");
//		Cat other = new Cat(6, "LetterMini");
		Cat other = new Cat(2, "bigger", new CatAgeComparator());
		Cat one = new Cat(1, "mini", new CatNameComparator());
		List<Cat> cats = new ArrayList<Cat>();
		cats.add(one);
		cats.add(other);
		Sort s = new Sort(new CatAgeComparator());
		s.sorted2(cats.toArray());
//		Sort.sorted(cats.toArray());
		System.out.println(JSONSerializerUtils.serialize(cats));
	}

}
