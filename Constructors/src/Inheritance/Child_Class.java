package Inheritance;
class Grandparent_Class{
	Grandparent_Class()
	{
			System.out.println("1");
	}
	}
class Parent_Class extends Grandparent_Class{
	Parent_Class()
	{
		super();
		System.out.println("2");
	}
	}


public class Child_Class extends Parent_Class {
Child_Class()
{
	super();
	System.out.println("3");
}
public static void main(String[] args) {
	Child_Class n1= new Child_Class();
	}
}

