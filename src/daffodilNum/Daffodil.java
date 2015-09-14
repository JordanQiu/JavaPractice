package daffodilNum;

public class Daffodil {

	public static void main(String[] args) {
		// int num=0;
		// int i,j,k;
		// for(i=1;i<10;i++){
		// for(j=0;j<10;j++){
		// for(k=0;k<10;k++){
		   ////速度比较慢
		// num = i*i*i+j*j*j+k*k*k;
		// if(num == i*100+j*10+k){
		// System.out.println(num);
		// }
		//
		//
		// }
		// }
		// }
		{
			int i = 0;
		
			for (i = 100; i <= 999; i++)
				if (shuixianhua(i) == true)
					System.out.println(i);
		}
	}



		public static  boolean shuixianhua(int x) {
			int i = 0, j = 0, k = 0;
			i = x / 100;
			j = (x % 100) / 10;
			k = x % 10;
			if (x == i * i * i + j * j * j + k * k * k)
				return true;
			else
				return false;
		}
	}


