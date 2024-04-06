package Super_calling_stmt;
class grandparent{
	 grandparent()
	{
		System.out.println("1");
	}
}
class parent extends grandparent{
	 parent(int a)
	{
		//super();
		System.out.println("2");
	}
}
class child extends parent{
	child(int a, double b) {
		super(10);
		System.out.println("3");
	}
}

public class Super_calling_Argchild {
public static void main(String[] args) {
	child c1= new child(1,10.5);
	System.out.println("4");
	
	}
	
		
	
}

