package iterator;

import org.junit.Test;

import com.kong.filter.webTest;
import com.kong.iterator.LinkListCustom;
import com.kong.strategy.Cat;

public class TestIterator extends webTest {

	@Test
	public void add() {
		LinkListCustom<Cat> strings = new LinkListCustom();
		for (int i = 0; i < 15; i++) {
			strings.add(new Cat(i));
		}
		System.out.println(strings.size());
	}

	@Test
	public void print() {
		try {
			int n = 10;
			int mat[][] = new int[n][]; //下标表示第几行几列 即所在位置，数组里面的值 为要输出的值
			int i, j;
			for (i = 0; i < n; i++) { //i 表示行数
				mat[i] = new int[i + 1]; // 每行个数:i+1
				// mat[i][0] = 1;
				mat[i][i] = 1;
				for (j = 1; j < i; j++) {
					//mat[i - 1][j - 1] 是i-1行的j-1列,mat[i - 1][j];是i-1行的j列
					//比如：4 =          1          +         3 
					mat[i][j] = mat[i - 1][j - 1] + mat[i - 1][j];
				}

			}
			//执行到此处mat里面值：[[1], [0, 1], [0, 1, 1], [0, 1, 2, 1], [0, 1, 3, 3, 1], [0, 1, 4, 6, 4, 1],
			//[0, 1, 5, 10, 10, 5, 1], [0, 1, 6, 15, 20, 15, 6, 1], [0, 1, 7, 21, 35, 35, 21, 7, 1], 
			//[0, 1, 8, 28, 56, 70, 56, 28, 8, 1]]
			//下面开始打印
			for (i = 0; i < mat.length; i++) {
				for (j = 0; j < n - i; j++)
					System.out.print(" "); //打印空格
				for (j = 0; j < mat[i].length; j++)
					System.out.print(" " + mat[i][j]);
				System.out.println(); //换行
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
