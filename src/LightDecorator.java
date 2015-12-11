
public class LightDecorator extends Decorator{

	public LightDecorator(IComponent c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public float getPrice() {
		float base = c.getPrice();
		return base + 2;
	}
}
