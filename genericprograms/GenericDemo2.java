package genericprograms;

import Variables.A;

public class GenericDemo2<T>
{

	public static void main(String[] args) 
	{

		GenericDemo2<String> g1=new GenericDemo2<String>();


		GenericDemo2<Integer> g2=new GenericDemo2<Integer>();
		g2.funA(10);
		
		GenericDemo2<Boolean> g3=new GenericDemo2<Boolean>();
		g3.funA(true);
		
		GenericDemo2<A> g4=new GenericDemo2<A>();
		g4.funA(null);
		
	}

	void funA(T t1)
	{
		System.out.println(t1);
	}
}

