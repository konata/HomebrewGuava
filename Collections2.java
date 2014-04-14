package com.tencent.qqmail.trd.guava;

import java.util.Collection;

public class Collections2 {
	
	public static<T> Collection<T> filter(Collection<T> container,Predicate<? super T> fn){
		Collection<T> ret = Lists.newArrayList();
		for(T item: container){
			if(fn.apply(item)){
				ret.add(item);
			}
		}
		return ret;
	}

}
