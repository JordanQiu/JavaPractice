package innerClass;

public  class OuterClass {
    private String test="outerClass";
    private innerClass incls;//一定要声明一个内部类
    public  void test(){
    	System.out.println("I am function of outerClass");
    	//外部类可以访问内部类的私有变量，可以访问内部类的方法。
    	innerClass inCls = new innerClass();
    
    	System.out.println(inCls.testInner);
    }
    //innerClass只是一个类成员,outerClass和innerClass之间可以互相访问成员变量和方法。
    //innerClass可以是静态类和静态方法,但是静态方法的同时，一定要静态类
    public  class innerClass{
    	private String testInner="innerClass";
    	public  void testInner(){
    		System.out.println("I am function of innerClass");
    	    
    	
    	}
		public String getTestInner() {
			return testInner;
		}
		public void setTestInner(String testInner) {
			this.testInner = testInner;
		}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public innerClass getIncls() {
		return incls;
	}

	public void setIncls(innerClass incls) {
		this.incls = incls;
	}

}
