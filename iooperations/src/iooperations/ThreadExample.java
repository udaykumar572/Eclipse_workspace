package iooperations;
class MyThread extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<10;i++) {
			try {
				MyThread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			}
	}
}
public class ThreadExample {
	public static void main(String ar[])
	{
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.getState();
				t1.start();

				 try{  
				  t1.join(1500);  
				 }catch(Exception e){System.out.println(e);}  
				 
		t2.start();
		
		}
		
	}


  