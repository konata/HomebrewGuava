package cn.beriru.trd;

import java.util.Collection;
import java.util.List;

public class Ints {

	public static boolean contains(int[] ary,int item){
		for(int m : ary){
			if(m == item){
				return true;
			}
		}
		return false;
	}

	public static List<Integer> asList(int[] accountIds) {
		List<Integer> intList = Lists.newArrayList();
		for(int m : accountIds){
			intList.add(m);
		}
		return intList;
	}

	public static int[] toArray(Collection<Integer> intList) {
		int[] ret = new int[intList.size()];
		int position = 0;
		for(int m : intList){
			ret[position] = m;
      position++;
		}
		return ret;
	}
	
	
}
