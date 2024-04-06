package Super_calling_stmt;
class Parent_Super
{
	Parent_Super()
	{
		System.out.println("1");
	}

	Parent_Super(int a)
	{
		System.out.println("this is a parent constructor");
}
}
public class Super_Calling_Statement extends Parent_Super {

	Super_Calling_Statement()
	{
		super(2);
		System.out.println("this is a child constructor");
	}

	public static void main(String[] args) {
		Super_Calling_Statement n1=new Super_Calling_Statement();		
}
}