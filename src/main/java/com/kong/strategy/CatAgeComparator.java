package com.kong.strategy;

public class CatAgeComparator implements Comparator{

	public int compare(Object one, Object other) {
		if (null != one && one instanceof Cat && null != other && other instanceof Cat) {
			Cat oneCat = (Cat) one;
			Cat otherCat = (Cat)other;
			if(oneCat.getAge() < otherCat.getAge()) return 1;
			else if (oneCat.getAge() > otherCat.getAge()) return -1;
			return 0;
		}
		return -100;
	}
	

}
