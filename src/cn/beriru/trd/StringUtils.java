package cn.beriru.trd;

import java.util.Iterator;

public class StringUtils {

	public static String join(Iterator<?> iterator, String mChar) {
		StringBuilder sb = new StringBuilder();
		while(iterator.hasNext()){
			String value = iterator.next().toString();
			sb.append(value);
			if(iterator.hasNext()){
				sb.append(mChar);
			}
		}
		return sb.toString();
	}

	public static String[] split(String str, String mOn) {
		return str.split(mOn);
	}

	public static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	public static String join(Object[] items, String c) {
		if(items == null){
			return "";
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < items.length ;i++){
			sb.append(items[i]);
			if(i != items.length - 1){
				sb.append(c);;
			}
		}
		return sb.toString();
	}

}
