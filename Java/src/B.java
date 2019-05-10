
public class B extends A{

	public static void main(String[] args) {
		System.out.println("B");
		A a=new A();
		A b=new B();
		B c=new B();
		B d=(B) new A();
		a.add();
		b.add();

	}

}
