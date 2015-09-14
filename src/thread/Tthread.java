package thread;

import java.util.Random;


public class Tthread extends Thread{
 
    private int sleeptime;
    private Random random = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public Tthread(String name){
		super(name);
	}

	public void run(){
		for(int i=0;i<5;i++){
            
             try {
            	sleeptime = random.nextInt(100);
				Thread.sleep(sleeptime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             System.out.println(getName());
		}
	}
	

	
}
