package thread;

import java.util.Random;

public class runable implements Runnable{
	private  String taskName;
	private  int sleeptime;
	private Random random = new Random();
	
	public runable(String taskName){
		this.taskName = taskName;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		
		for(int i=0;i<5;i++){
			sleeptime =random.nextInt(5000);
		System.out.println(taskName+" prepare to sleep in "+sleeptime);
//		try {
//			Thread.sleep(sleeptime);
//		} catch (InterruptedException e) {
//		System.out.println(taskName +"will be terminated due to interuption");
//			e.printStackTrace();
//		}
		
	}
	}
	
	public void generalFunction(){
		System.out.println("it's just a general Function");
	}
}
