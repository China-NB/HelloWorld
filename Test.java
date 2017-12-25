package cn.com.xwk;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		
		R r=new R();
		
		
		Thread t1=new Thread(r);
		r.x=1;
		r.t=t1;
		Thread.currentThread().join();
		t1.start();
	
		Thread.sleep(500);
		
		Thread t2=new Thread(r);
		r.t=t2;
		r.x=2;
		t1.join();
		t2.start();
		
	}

}
