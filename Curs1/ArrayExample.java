class ArrayExample{
	public static void main(String[] args) {
		//definition + size initialization + element initialization
		int[] array = new int [3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		//definition + initialization
		int[] array2 = new int []{11,22,33};
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		//definition= initialization + change something
		int[] array3 = new int []{1,2,3};
		array3[2]=100;
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);

		System.out.println("Array length: " + array3.length);
	}
}