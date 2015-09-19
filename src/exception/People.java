package exception;

public class People {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Eexception {
		
		if(age>=160 || age<0){
			//throw new Eexception(age);
			Eexception e = new Eexception(age);
			throw e;//e必须是throwable的子类
		}
		else{
			this.age = age;	
		}
	}
	
}
