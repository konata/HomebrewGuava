package com.tencent.qqmail.trd.guava;

import java.util.Collection;
import java.util.HashSet;

public class Sets {
	
	public static<T> HashSet<T> newHashSet(){
		return new HashSet<T>();
	}
	
	public static<T> HashSet<T> newHashSet(Collection<T> input){
		  return new HashSet<T>(input);
	}
	
	public static<T> HashSet<T> newHashSet(T ... args){
		HashSet<T> sets = new HashSet<T>();
		for(T m : args){
			sets.add(m);
		}
		return sets;
	}
}
