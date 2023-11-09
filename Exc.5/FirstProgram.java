import FirstPackage.*;

class FirstClass {
	 public static void main(String[] args) {
		 //What mean o?
		SecondClass o = new SecondClass();
		for(int i = 1; i <= 8; i++) {
			for(int j = 1; j <= 8; j++) {
				o.setParam1(i);
				o.setParam2(j);
				System.out.print(o.Sum()+" ");
			}
			System.out.println();
		}

	}
}
