package cn.beriru.trd;

import java.util.HashMap;


public class Maps {
	
	public static<T,N> HashMap<T,N> newHashMap(){
		return new HashMap<T, N>();
	}
	

	/**
	 * map literal constructor
	 * @param k
	 * @param v
	 * @return
	 */
	public static<K,V> InnerMap<K,V> newHashMap(K k,V v){
		return InnerMap.init(k,v);
	}
	
	public static class InnerMap<K,V>{
		private HashMap<K,V> mValue;
		private InnerMap(K k,V v){
			mValue = new HashMap<K, V>();
			mValue.put(k, v);
		}
		
		public InnerMap<K, V> add(K k,V v){
			mValue.put(k, v);
			return this;
		}
		
		public HashMap<K, V> commit(){
			return mValue;
		}
		
		protected static<M,N> InnerMap<M,N> init(M m,N n){
			return new InnerMap<M, N>(m,n);
		}
	}
	
}
