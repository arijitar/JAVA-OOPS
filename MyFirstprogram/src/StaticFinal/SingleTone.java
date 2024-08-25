package StaticFinal;
class coffeeMatchine{
	private float coffeeQty;
	private float waterQty;
	private float milkQty;
	private float sugarQty;
	
	static private coffeeMatchine my = null;
	
	private coffeeMatchine(){
		setCoffeeQty(1);
		setWaterQty(1);
		setMilkQty(1);
		setSugarQty(1);
	}
	public void fillwater(float qty) {
		setWaterQty(qty);
	}
	public void fillsugar(float qty) {
		setSugarQty(qty);
	}
	public float getcoffee() {
		return 0.23f;
	}
	static coffeeMatchine getInstance() {
		if(my==null) {
			my = new coffeeMatchine();
		}
		return my;
	}
	public float getCoffeeQty() {
		return coffeeQty;
	}
	public void setCoffeeQty(float coffeeQty) {
		this.coffeeQty = coffeeQty;
	}
	public float getWaterQty() {
		return waterQty;
	}
	public void setWaterQty(float waterQty) {
		this.waterQty = waterQty;
	}
	public float getMilkQty() {
		return milkQty;
	}
	public void setMilkQty(float milkQty) {
		this.milkQty = milkQty;
	}
	public float getSugarQty() {
		return sugarQty;
	}
	public void setSugarQty(float sugarQty) {
		this.sugarQty = sugarQty;
	}
}
public class SingleTone {

	static public  void main(String[] args) {
		// TODO Auto-generated method stub
       coffeeMatchine m1=coffeeMatchine.getInstance();
       coffeeMatchine m2=coffeeMatchine.getInstance();
       coffeeMatchine m3=coffeeMatchine.getInstance();
       
       System.out.println(m1+"\n"+m2+"\n"+m3);
       if(m1==m2 && m1==m3)
    	   System.out.println("same");
	}

}
