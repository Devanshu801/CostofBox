package cost;



public class Box {
	private String name;
	private int length;
	private int width;
	private int height;
	private Flute flute;
	private Join typejoin;
	private int multiplyingfactor;
    private int id;
    
    public Box() {
    }
    public float area() {
    	return length*width*height;
    }
    public float takeTotalgsm()
	{
		return flute.getGsm()*100+flute.getExtragsm();
	}
    public float getStichingCost() {
		
		return typejoin.cost(name);
	}
	
    public float manufacturingCost()
	{
		return area()*takeTotalgsm()*flute.getExtragsm()*getStichingCost()*getMultiplyingfactor();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Flute getFlute() {
		return flute;
	}
	public void setFlute(Flute flute) {
		this.flute = flute;
	}
	public Join getTypeofjoin() {
		return typejoin;
	}
	public void setTypeofjoin(Join typeofjoin) {
		this.typejoin = typeofjoin;
	}
	public int getMultiplyingfactor() {
		return multiplyingfactor;
	}
	public void setMultiplyingfactor(int multiplyingfactor) {
		this.multiplyingfactor = multiplyingfactor;
	}
	public int getId() {
		return id;
	}

    
    
}
