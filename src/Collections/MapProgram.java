package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		
		Map<String, String> languages = new HashMap<>();
		languages.put("java", "Descrition of java");
		
		if(languages.containsKey("java")) {
			System.out.println("java already exist");
		}
		
		languages.put("Python", "Descrition of Python");
		languages.put("Basic", "Descrition of Basic");
		languages.put("Lisp", "Descrition of Lisp");
		
		System.out.println(languages.get("java"));
		
		languages.put("java", "abc");
		
		System.out.println(languages.get("java"));
		
			
		System.out.println("=============================================");
		
		languages.remove("Lisp");
		
		for(String key: languages.keySet()) {
			System.out.println(key+" : "+languages.get(key));
		}
		
		
	}

}
