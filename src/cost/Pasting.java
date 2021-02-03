package cost;

import java.util.HashMap;


	public class Pasting implements Join {
		HashMap<String,Integer> map = new HashMap<>();;
		private int id;
		public Pasting() {
			super();
			map.put("Universal", 20);
			map.put("AllFlapMeeting", 30);
			map.put("HoneyComb", 40);
			map.put("ReverseTuckIn", 40);
			map.put("TopOpening SnapLock", 50);	
		}
		@Override
		public int cost(String name) {
			// TODO Auto-generated method stub
			return map.get(name);	
			}
		public int getId() {
			return id;
		}
}
