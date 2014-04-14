package com.tencent.qqmail.trd.guava;

public class Iterables {
	
	public static<T> boolean any(Iterable<T> it,Predicate<T> fn){
		if(it == null){
			return true;
		}
		for(T ele : it){
			if(fn.apply(ele)){
				return true;
			}
		}
		return false;
	}

}
