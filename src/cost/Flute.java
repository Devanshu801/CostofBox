package cost;

import java.util.HashMap;

public class Flute {

	
	private String name;
	private int gsm;
	private int id;

		public int getId() {
			return id;
		}
		HashMap<String,Integer> map;
		public Flute() {
			
	map	 = new HashMap<>();
				map.put("A",10);
				map.put("B", 30);
				map.put("C", 20);
				map.put("E",40);
				map.put("F", 50);
				map.put("G",20);
				
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getGsm() {
			return gsm;
		}
		public void setGsm(int gsm) {
			this.gsm = gsm;
		}
		
		public int getExtragsm() {
			return map.get(name);
		}
		public void setExtragsm(int extragsm) {
		
		}
		public void setId(int id) {
			this.id = id;
		}		
		
}		

