package com.rqx.containers;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SlowMap<K, V> extends AbstractMap<K, V> {

	private List<K> keys = new ArrayList<K>();
	private List<V> values = new ArrayList<V>();
	public V PutField(K key, V value){
		V oldValue = get(key);
		if(!keys.contains(key)){
			keys.add(key);
			values.add(value);
		}else{
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}
	
	public V get(Object key){
		if(!keys.contains(key))
			return null;
		else {
			return values.get(keys.indexOf(key));
		}
	}
	
	
	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K, V>>();
		Iterator<K> ki = keys.iterator();
		Iterator<V> vi = values.iterator();
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
