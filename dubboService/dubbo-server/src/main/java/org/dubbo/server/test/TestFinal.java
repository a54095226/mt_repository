package org.dubbo.server.test;

public class TestFinal {
	
	int num = 1;
	
	public int getNum()
	{
		System.out.println(" getNum invoke ");
		num++;
		return num;
	}
	
	public void doFinally()
	{
		System.out.println(" doFinally ");
		num++;
	}
	
	public int getCount()
	{
		try{
			return getNum();
		}finally
		{
			doFinally();
		}
	}
	
	public static void main(String[] args) {
		TestFinal fin = new TestFinal();
		System.out.println(fin.getCount());
	}

}
