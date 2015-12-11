
public class Decorator implements IComponent{
	IComponent c;
	
	public Decorator(IComponent c) {
		this.c = c;
	}
	
	@Override
	public float getPrice() {
		return c.getPrice();
	}
}
