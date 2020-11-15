class A_overload{}
class B_overload extends A_overload{}
class C_overload extends B_overload{}
public class Overload{
	void myOverload(A_overload a){
		System.out.println("Overload.myOverload(A_overload a)");
	}
	
	void myOverload(B_overload b){
		System.out.println("Overload.myOverload(B_overload b)");
	}
	
	public static void main(String[] args){
		Overload o = new Overload();
		C_overload c = new C_overload();
		o.myOverload(c);
	}
}