package com.tnsif.MapInterface;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class MapsDemo {

	public static void main(String[] args) {
		//HashMap--> not following insertion
		HashMap<String,Integer> m=new HashMap<String,Integer>();
		
		m.put("AIML",69);
		m.put("DS",78);
		m.put("CS",65);
		m.put("CC",80);
		m.put("OS",75);
		m.put("OS",75);
		
		System.out.println("Subject   Marks");
		for(HashMap.Entry<String, Integer> entry:m.entrySet()) {
		System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		//LinkedHashMap
 LinkedHashMap<String,Integer> lm=new LinkedHashMap<String,Integer>();
		
		lm.put("AIML",69);
		lm.put("DS",78);
		lm.put("CS",65);
		lm.put("CC",80);
		lm.put("CC",80);
		lm.put("OS",75);
		
		System.out.println("LinkedHashmap output");
		for(Entry<String, Integer> entry:lm.entrySet()) {
		System.out.println(entry.getKey()+","+entry.getValue());
		}
		
		
		//TreeMap
		 TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
				
				tm.put("AIML",69);
				tm.put("DS",78);
				tm.put("CS",65);
				tm.put("CC",80);
				tm.put("CC",80);
				tm.put("OS",75);
				
				System.out.println("Treemap output");
				for(Entry<String, Integer> entry:tm.entrySet()) {
				System.out.println(entry.getKey()+","+entry.getValue());
				}	
	}


}

