public class Main
	{
	public static void main(String args[])
		{
		FactoryPattern factoryObj = new FactoryPattern();
		/*here we call just one method and appropriate object is automatically cretaed.
		Hence, we are hiding logic of object creation which is simple in this case but can be complex*/
		Shape circle = factoryObj.getShape("circle");
		Shape square = factoryObj.getShape("square");
		Shape rectanlge = factoryObj.getShape("rectangle");
		circle.draw();
		square.draw();
		rectanlge.draw();
		}
	}