package set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class UserCollection {
   HashSet<User> users= new HashSet<User>();
   User user1 = new User();
   User user2 = new User();
   public  void addUsers(){
	   user1.setUserName("12");
	   user1.setPassWord("12");
	   user2.setUserName("23");
	   user2.setPassWord("23");
	 boolean a =  users.add(user1);
	  boolean b = users.add(user2);
//	  System.out.println(a);
//	  System.out.println(b);
//	  for(int i=0;i<users.size();i++){
//	  if(users.iterator().hasNext()){
//		  
//		  System.out.println(users.iterator().next());
//	  }
//	  }
	  System.out.println(users.size());
	Iterator<User>  iter = users.iterator();
	  while(iter.hasNext()){
		User us =  iter.next();
		  System.out.println(us.getUserName()); 
	  }
	  
	  boolean  c = users.contains(user1);
	  System.out.println(c);
	  
	 System.out.println(users.hashCode()); 
	 
	 
   }
   public void searchUsers(){
	   
   }
   
   public static void main(String arg[]){
	   
	   
   }
}
