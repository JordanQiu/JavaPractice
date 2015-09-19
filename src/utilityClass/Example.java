package utilityClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Example {

	public static void main(String[] args)  {
    
//		System.out.println(Math.abs(-10));
//		System.out.println(Math.max(1, 2));
//		System.out.println(String.format("%.2f", Math.random()));
//		System.out.println(Math.pow(2, 2));
//		System.out.println(String.format("%.0f", Math.sqrt(3.8)));
		
//		BigInteger bigInt = new BigInteger("3456788");
//		System.out.println(bigInt);
//		BigInteger bigInt2 = new BigInteger("3456789");
//		System.out.println(bigInt.add(bigInt2));
//		System.out.println(bigInt.subtract(bigInt2));
		
//		DecimalFormat format = new DecimalFormat("00.0000");
//		System.out.println(format.format(678.890)); 
//		DecimalFormat format2 = new DecimalFormat("4##,###,000000.00%");
//		System.out.println(format2.format(908.789));
		String regex = "^[a-zA-Z0-9]{6,16}$";
		Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		String s = "a3444dffd,fffff";
		Matcher m =p.matcher(s);
		System.out.println(m.matches());
		while(m.find()){
			String ss = m.group();
			System.out.println(m.start());
			System.out.println("从"+m.start()+"到"+m.end()+"匹配子序列：");
			System.out.println(ss);
		}
		
	
	}

}
