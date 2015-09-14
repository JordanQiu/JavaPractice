package example;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.stream.IntStream;

import arrayList.EmployeeList;
import set.User;
import set.UserCollection;

public class Example extends Thread {

	public static void main(String[] args) {
    UUID uuid = UUID.randomUUID();
    System.out.println(uuid);
    

}
	public String generateUUID(){
		 String uuid = UUID.randomUUID().toString();
		 return uuid;
	}
	
	public String[] getUUIDS(int number){
		String[] uuid = new String[number];//String数组一定要初始化
		//new String[]{'','',''}   new一个带数值的String
		for(int i=0;i<number;i++){
			uuid[i] = generateUUID();	
		}
		return uuid;
	}
	



public static double floor(Double value, Double minValue) {
	int offset = 1;
	if (value > 0) {
		offset = 1;
	} else if (value < 0) {
		offset = -1;
	} else {
		offset = 0;
		return 0;
	}
	
	
	
	
	int mod = (int)(value / minValue);
	Double m = (value % minValue);
	if (m.compareTo(new Double(0)) == 0) {
		offset = 0;
	}
	return (mod + 1 * offset) * minValue;
}
}