package FirstPackage;

public class SecondClass {

	private int param1;
	private int param2;

	public SecondClass() {}

	public SecondClass(int param1, int param2)
	{
		this.param1 = param1;
		this.param2 = param2;
	}

	public void setParam1(int param1)
	{
		this.param1 = param1;
	}

	public int getParam1()
	{
		return param1;
	}

	public void setParam2(int param2)
	{
		this.param2 = param2;
	}

	public int getParam2()
	{
		return param2;
	}

	public int Sum()
	{
		return this.param1 + this.param2;
	}
}