package threadtwice;

public class TestThreadTwice1 extends Thread{
	public void run(){  
		   System.out.println("running...");  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TestThreadTwice1 t1=new TestThreadTwice1();  
		  t1.start();  
		  t1.start();  

	}

}
