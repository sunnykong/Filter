package com.kong.strategy;

public class CatNameComparator implements Comparator {

	public int compare(Object one, Object other) {
		if (null != one && one instanceof Cat && null != other
				&& other instanceof Cat) {
			Cat oneCat = (Cat) one;
			Cat otherCat = (Cat) other;
			if (oneCat.getName().length() > otherCat.getName().length())
				return 1;
			else if (oneCat.getName().length() < otherCat.getName().length())
				return -1;
			return 0;
		}
		return -100;
	}

}
