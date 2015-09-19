package exception;

public class Eexception extends Exception //必须继承throwable的子类
{
private NumberFormatException ee;

	/**
	 * 
	 */
	private String message;
	private static final long serialVersionUID = 1L;
	//异常类构造方法
  public Eexception(int m){
	  message = m+"age:不合理";
	  Integer.parseInt("ss");
  }
  
  public String getmessString(){
	return message;
	  
  }

}
