package set;

public class User extends Object{
  private String userName;
  private String passWord;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public boolean equals(Object anObject) {
    
	
	
        if (anObject instanceof User) {
        	User anotherObj = (User) anObject;
        	if(this.getUserName().equals(anotherObj.getUserName()))
        	{
        		return true;	
        	}
        	else 
        	return false;
		}
   
	else
		return false;
}

//public int hashCode() {
//	return 1;
//	
//	
//}


}
