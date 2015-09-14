package thread;

public class Test {

	public static void main(String[] args) {
		//集成thread实现多线程，结果：一个线程运行结束才运行另一个线程
	
//		Tthread ted = new Tthread("A");
//		Tthread ted2 = new Tthread("B");
//		ted.start();
//		ted2.start();
		//start()是启用新线程，run()是普通方法
		runable rn = new runable("c");
		Thread rab = new Thread(rn);
		rab.start();
	
		Thread rab2 =new Thread( new runable("d"));
		rab2.start();
		rn.generalFunction();
	}

}
