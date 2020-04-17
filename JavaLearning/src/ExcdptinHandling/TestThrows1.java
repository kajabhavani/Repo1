package ExcdptinHandling;

import java.io.IOException;

public class TestThrows1 {
	
	void m() throws IOException	{
		      throw new IOException("device error");
			}
void n() throws IOException
{
	m();
}
void p()
{
	try{
		n();
	}catch(Exception e)
	{
		System.out.println("exception handled");
	}
}
public static void main(String[] args)
{
	
	TestThrows1 t2=new TestThrows1();
	t2.p();
	System.out.println("normal flow");
}
}
