
public class BoostDecorator extends Decorator{

	public BoostDecorator(IComponent c) {
		super(c);
	}

	public float getPrice() {
		float base = c.getPrice();
		return base + 1;
	}
}
