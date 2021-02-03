package cost;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Box u =new Box();
			u.setLength(2);
			u.setHeight(2);
			u.setWidth(2);
			u.setTypeofjoin(new Pasting());
			u.setName("HoneyComb");		
			Flute H = new Flute();
			H.setName("B");
			H.setGsm(1);
			u.setFlute(H);
			u.setMultiplyingfactor(1);
			System.out.println(u.area());
			System.out.println(u.takeTotalgsm());
			System.out.println(u.getStichingCost());
			System.out.println(H.getGsm());
			System.out.println(u.getMultiplyingfactor());
			System.out.println(H.getExtragsm());
			System.out.println(u.manufacturingCost());
	}

}
