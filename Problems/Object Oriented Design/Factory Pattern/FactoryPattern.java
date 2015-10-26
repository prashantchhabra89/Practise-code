public class FactoryPattern{
	public Shape getShape(String type)
		{
		type = type.toLowerCase();
		if(type.equals("circle"))
			{
			return new Circle();
			}
		if(type.equals("square"))
			{
			return new Square();
			}
		if(type.equals("rectangle"))
			{
			return new Rectangle();
			}
		return null;
		}
	}