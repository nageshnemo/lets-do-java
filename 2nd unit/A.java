class A{
	private int i; 
	private float f;

	public A(){
		i=5;
		f=3.23f;
		System.out.println("the value of i is:"+i +"\nand value of f is"+f);
		}
	public A(int i){
		this.i=i;
		System.out.println("this value of i is is come through parametrised constructor:"+i);
		}
	public A(int k,float l){
		i=k;
		f=l;
		System.out.println("ye bhi cha;l rah bina object create kiye hue");

		}

	
	public static void main(String []args){
		A obj=new A();
	      
		 obj.i=2000;
		 System.out.println(obj.i);		
	}
}
