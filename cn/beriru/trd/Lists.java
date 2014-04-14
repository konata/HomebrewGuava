package cn.beriru.trd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Lists {
	
	
	public static<T> ArrayList<T>  newArrayList(){
		return new ArrayList<T>();
	}
	
	
	public static<T> ArrayList<T> newArrayList(Collection<T> input){
		  return new ArrayList<T>(input);
	}
	
	public static<T> ArrayList<T> newArrayList(T ... args){
		ArrayList<T> ret =  new ArrayList<T>();
		for(T m : args){
			ret.add(m);
		}
		return ret;
	}
	
	/*你抓不住collection的子类来实例化
	public static<Element,Return> Collection<Return> transform(Collection<Element> col,Function<Element, Return> fn){
		Collection<Return> ret = new ArrayList<Return>();
		for(Element e : col){
			Return n = fn.apply(e);
			ret.add(n);
		}
		return ret;
	}
	*/
	
	public static<Element,Return> List<Return> transform(List<Element> col,Function<Element, Return> fn){
		List<Return> ret = newArrayList();
		for(Element e : col){
			Return n = fn.apply(e);
			ret.add(n);
		}
		return ret;
	}
}
