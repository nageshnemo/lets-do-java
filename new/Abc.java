class Abc {
	public Abc() { 
	System.out.println("hey i'm in default constructor: ");        //defaukt constructor which is to be invoked by jvm
	}
	public Abc(int a) { 
	System.out.println("hey i'm in parametrised constructor : ");        //defaukt constructor which is to be invoked by jvm
	}
	//public Abc(double d) { 
	//System.out.println("hey i'm in double constructor  ");        //defaukt constructor which is to be invoked by jvm
	//}


	public static void main(String args[]) {
	//Abc obj = new Abc();
	Abc obj1 = new Abc(23.44);   // two constructor with same name and different parameters and this concept is constructor overloading
	//obj.Abc();  //default constructor is called
	}
}                                                             