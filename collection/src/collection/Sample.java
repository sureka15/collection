package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {


	public static void main(String[] args) {

		String s ="i am sureka and sureka friend sureka";
		String[] allword = s.split("");
		Map<String, Integer> m =new  LinkedHashMap<String,Integer>();
		for (String word : allword) {
			if(m.containsKey(word))
			{
				Integer value = m.get(word);
				m.put(word, value +1);
			}else {
			m.put(word, 1);
		}
		}
		System.out.println(m);
}}
