
public class Order {

	public static void main(String[] args) {
		String juiceType = "orange juice";
		IComponent c = new JuiceComponent(juiceType);
		
		Decorator d = new IceDecorator(c);
		Decorator d1 = new LightDecorator(d);
		Decorator d2 = new BoostDecorator(d1);
		
		System.out.println(d2.getPrice());
	}

}
