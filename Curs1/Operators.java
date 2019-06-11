class Operators{
	public static void main(String[] args) {
		int result = add(1,1);
		System.out.println(result);

		int result2 = substract(5,1);
		System.out.println(result2);

		int result3 = multiply(3,3);
		System.out.println(result3);

		int result4 = division(17,9);
		System.out.println(result4);

		int result5 = remainder(17,9);
		System.out.println(result5);

		String result6 = div(7,2);
		System.out.println(result6);
	}
	public static int add(int termen1, int termen2){
		return termen1+termen2;
	}
	public static int substract(int termen1, int termen2){
		return termen1-termen2;
	}
	public static int multiply(int termen1, int termen2){
		return termen1*termen2;
	}
	public static int division(int termen1, int termen2){
		return termen1/termen2;
	}
	public static int remainder(int termen1, int termen2){
		return termen1%termen2;
	}

//rezultat=cat  \* impartitor + rest
/* Poti scrie
pe mai multe linii*/

	public static String div(int termen1 , int termen2){
		return division(termen1,termen2)+" * "+termen2+" + "+remainder(termen1,termen2)+" = "
		+termen1;
	}
}