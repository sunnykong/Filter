package com.kong.strategy;
/**
 * 策略模式的 环境对象
 * http://yangguangfu.iteye.com/blog/815107
 * 可参考 
 * @author Administrator
 *
 */
public class Sort {

	private Comparator comparator;

	public Sort() {
	}

	public Sort(Comparator comparator) {
		this.comparator = comparator;
	}

	public static void sorted(Object[] a) {
		for (int i = a.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				Comparable o1 = (Comparable) a[j];
				Comparable o2 = (Comparable) a[j + 1];
				// if (o1.compareTo(o2) == 1) {
				// swap(a, j, j + 1);
				// }
			}
		}
	}

	public void sorted2(Object[] a) {
		for (int i = a.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				Comparable o1 = (Comparable) a[j];
				Comparable o2 = (Comparable) a[j + 1];
				if (comparator.compare(o1, o2) == 1) {
					swap(a, j, j + 1);
				}
			}
		}
	}

	private static void swap(Object[] a, int x, int y) {
		Comparable temp = (Comparable) a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
