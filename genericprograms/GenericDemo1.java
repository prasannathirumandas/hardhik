package genericprograms;

public class GenericDemo1<T>
{
	T t1;
	public static void main(String[] args) 
	{

		GenericDemo1 g1=new GenericDemo1();
		g1.funA("RBG");
		g1.funA(10);
		g1.funA(true);
		

	}

	void funA(T t1)
	{
		System.out.println(t1);
	}
}
