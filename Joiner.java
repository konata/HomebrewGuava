package com.tencent.qqmail.trd.guava;

import com.tencent.qqmail.trd.commonslang.StringUtils;

public class Joiner{
	private String mChar;
	
	private Joiner(String c){
		mChar = c;
	}
	
	public static Joiner on(String c){
		return new Joiner(c);
	}
	
	public Joiner skipNulls(){
		return this;
	}
	
	public String join(Iterable<?> items){
		return StringUtils.join(items, mChar);
	}
	
	public String join(Object[] items){
		return StringUtils.join(items, mChar);
	}
	
	
}