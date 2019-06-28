package com.ruoyi.common.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

public class PageData extends HashMap implements Map{
	
	private static final long serialVersionUID = 1L;
	
	Map map = null;
	HttpServletRequest request;
	
	
	/*
	 * request.getParameterMap方法不需要参数，返回结果为Map<String,String[]> 
	 * request.getParameterMap()方法也是通过前台表单中的name值进行获取的，获取到后又进行了一次封装。 
	 * 之所以返回的map中的value为字符串类型的数组，是为了解决表单中有多个name值一样的项。
	 * 
	 * map.entrySet()是把HashMap类型的数据转换成集合类型
	 * map.entrySet().iterator()是去获得这个集合的迭代器，保存在iter里面。
	 * 迭代器这么用：
	 *	while(iter.hasNext()) {
	 *	Entry obj = it.next();//就能获得map中的每一个键值对了
	 *	}
	*/
	public PageData(HttpServletRequest request){
		this.request = request;
		Map properties = request.getParameterMap();
		Map returnMap = new HashMap(); 
		Iterator entries = properties.entrySet().iterator(); //获得map的迭代器，用作遍历map中的每一个键值对
		Entry entry;
		String name = "";  
		String value = "";  
		while (entries.hasNext()) {
			//Map是java中的接口,Map.Entry是Map的一个内部接口
			entry = (Entry) entries.next();
			name = (String) entry.getKey(); 
			Object valueObj = entry.getValue(); 
			if(null == valueObj){ 
				value = ""; 
			}else if(valueObj instanceof String[]){ //判断valueObj是不是数组，instanceof是为了判断某个对象是否是某个类的实例，如果是则返回true,否则是false
				String[] values = (String[])valueObj;
				for(int i=0;i<values.length;i++){ 
					 value = values[i] + ",";
				}
				value = value.substring(0, value.length()-1); 
			}else{
				value = valueObj.toString(); 
			}
			returnMap.put(name, value); 
		}
		map = returnMap;
	}
	
	public PageData() {
		map = new HashMap();
	}
	
	@Override
	public Object get(Object key) {
		Object obj = null;
		if(map.get(key) instanceof Object[]) {   //instanceof是为了判断某个对象是否是某个类的实例，如果是则返回true,否则是false
			Object[] arr = (Object[])map.get(key);
			obj = request == null ? arr:(request.getParameter((String)key) == null ? arr:arr[0]);
		} else {
			obj = map.get(key);
		}
		return obj;
	}
	
	public String getString(Object key) {
		return (String)get(key);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Object put(Object key, Object value) {
		//向列表中添加数据
		return map.put(key, value);
	}
	
	@Override
	public Object remove(Object key) {
		return map.remove(key);
	}

	public void clear() {
		map.clear();
	}

	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		//map集合中判断是否包含指定的键名
		return map.containsKey(key);
	}

	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		//map集合中判断是否包含指定的值
		return map.containsValue(value);
	}

	public Set entrySet() {
		// TODO Auto-generated method stub
		//map的entrySet()返回map中的映射关系的set视图set<Map.Entry<k,v>>可以理解为是将map中的键值对以set的形式存储便于取出来
		return map.entrySet();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		//map的isEmpty()方法判断Map是否有内容（即new分配空间后是否put键值对），若没有内容则true，否则false
		return map.isEmpty();
	}

	public Set keySet() {
		// TODO Auto-generated method stub
		//Map读取键值对，Java遍历Map的两种实现方法
		//第一种方法是根据map的keyset（）方法来获取key的set集合，然后遍历map取得value的值
		return map.keySet();
	}

	@SuppressWarnings("unchecked")
	public void putAll(Map t) {
		// TODO Auto-generated method stub
		//putAll可以合并两个MAP，只不过如果有相同的key那么用后面的覆盖前面的
		map.putAll(t);
	}

	public int size() {
		// TODO Auto-generated method stub
		//Map集合大小为
		return map.size();
	}

	public Collection values() {
		// TODO Auto-generated method stub
		//返回map所有的value组成的collection
		return map.values();
	}
	
}
