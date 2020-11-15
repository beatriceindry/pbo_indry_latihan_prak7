class Parent_VMI{
	int x = 5;
	public void Info(){
		System.out.println("Ini class Parent");
	}
}

class Child_VMI extends Parent_VMI{
	int x = 10;
	public void Info(){
		System.out.println("Ini class Child");
	}
}

public class VMI{
	public static void main(String args[]){
		Parent_VMI tes = new Child_VMI();
		System.out.println("Nilai x = "+tes.x);
		tes.Info();
	}
}