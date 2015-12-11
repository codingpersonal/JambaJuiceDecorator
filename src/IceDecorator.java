
public class IceDecorator extends Decorator{

	public IceDecorator(IComponent c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public float getPrice() {
		float base = c.getPrice();
		return base;
	}
}
