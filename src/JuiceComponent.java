
public class JuiceComponent implements IComponent{
	
	String ordername;
	float orderprice;
	
	public JuiceComponent(String OrderName) {
		this.ordername = OrderName;
	}
	
	public float getPrice() {
		if(ordername == "orange juice") {
			return 4;
		}
		else 
			return 5;
	}
}
