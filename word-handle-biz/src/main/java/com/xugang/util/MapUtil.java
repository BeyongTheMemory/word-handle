package com.xugang.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*≈≈–Ú”√*/
public class MapUtil
{
	//À≥–Ú≈≈¡–
    public static <K, V extends Comparable<? super V>> Map<K, V>
        sortByValue( Map<K, V> map )
    {
        List<Map.Entry<K, V>> list =
            new LinkedList<Map.Entry<K, V>>( map.entrySet() );
        Collections.sort( list, new Comparator<Map.Entry<K, V>>()
        {
            public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )
            {
                return (o1.getValue()).compareTo( o2.getValue() );
            }
        } );

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list)
        {
            result.put( entry.getKey(), entry.getValue() );
        }
        return result;
    }
    //

    //µπ–
   public static Map<String,Integer> reversSortByValue(Map<String,Integer> map)
{
	   List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>();
	   list.addAll(map.entrySet());
	   Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	      public int compare(Map.Entry obj1, Map.Entry obj2) {//¥”∏ﬂÕ˘µÕ≈≈–Ú
	            
	          if(Integer.parseInt(obj1.getValue().toString())<Integer.parseInt(obj2.getValue().toString()))  
	              return 1;  
	          if(Integer.parseInt(obj1.getValue().toString())==Integer.parseInt(obj2.getValue().toString()))  
	              return 0;  
	          else  
	             return -1;  
	      }  
	   });
	   
	   
	   Map<String,Integer> result = new LinkedHashMap<String,Integer>();  
       for (Map.Entry<String,Integer> entry : list)  
       {  
           result.put( entry.getKey(), entry.getValue() );  
       }  
       return result;  
	   
	  /* Map<String,Integer> rmap = new HashMap<String,Integer>();

	   for(Iterator<Map.Entry<String, Integer>> ite = list.iterator(); ite.hasNext();) {  
		     Map.Entry<String, Integer> map2 = ite.next();  
		    
		    System.out.println("key-value: " + map2.getKey() + "," + map2.getValue());  
		    rmap.put(map2.getKey(), map2.getValue());
		}*/
	   //return rmap;
}  
}  
