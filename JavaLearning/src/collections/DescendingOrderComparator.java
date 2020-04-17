package collections;

import java.util.Comparator;

public class DescendingOrderComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		
		return -(num1.compareTo(num2));
	}

}
