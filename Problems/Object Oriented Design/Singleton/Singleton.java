// Singleton class can have only one instance
public class Singleton
	{
	public static Singleton instance;
	//Private Contructor so, not other class can instantiate
	private Singleton()
		{
		}
	public static Singleton getObject()
		{
		if(instance == null)
			{
			instance = new Singleton();
			}
		return instance;
		}
	public static void main (String args[])
		{
		Singleton obj1 = getObject();
		Singleton obj2 = getObject();
		//you check if the object references points at the same place in memory by using ==

		if(obj1 == obj2)
			{
			System.out.println("Object 1 and 2 are same");
			}
		else
			{
			System.out.println("Object 1 and 2 are not same");	
			}
		}
	}