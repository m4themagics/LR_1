import FirstPackage.*;

class FirstClass {
	 public static void main(String[] args) {
		SecondClass o = new SecondClass();
		int i, j;
		for(i = 1; i <= 8; i++)
		{
			for(j = 1; j <= 8; j++)
			{
				o.setParam1(i);
				o.setParam2(j);
				System.out.print(o.Sum());
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
