package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> yinZiList = allzhishuyinzi(999);
		for(int i=0;i<yinZiList.size();i++){
		System.out.println(yinZiList.get(i));
		}	
	}
	
	//判断是否是质数
		public static boolean isZhiShu(int num){
			switch(num){
			case 1:
			case 2:
			case 3:
				return true;//return 就是跳出方法体
			}
			
			for(int i=2;i<num/2+1;i++){
				if(num%i==0){
					return false;
				}
				else if(num%i!=0){
					continue;	//继续循环
				}
			}
			return true;
		} 
		//列出所有的质数
		public static List<Integer> zhishu(){
			List<Integer> zhishuList = new ArrayList<Integer>();
			zhishuList.add(1);
			zhishuList.add(2);
			zhishuList.add(3);
			for(int num=5;num<10;num++){
			for(int i=2;i<num/2+1;i++){
				if(num%i!=0){
					zhishuList.add(num);
					break;//跳出最里层循环
				}
				else{
				break;//跳出for循环 不是跳出else语句
				}
			}
			
			}
			return zhishuList;
			
		}
		//找出最小质数因子
		public static int xiaozhishuyinzi(int num){
			switch(num){
			case 1:return 1;
			case 2:return 2;
			case 3:return 3;
			}
			if(isZhiShu(num)){
				return 1;
			}
			else{
				for(int i=2;i<num/2+1;i++){
					if(num%i==0){
						return i;//跳出方法体
					}
				}
					
		}
			return 0;
		}
		
		public static List<Integer> allzhishuyinzi(int num){
			List<Integer> yinZiList = new ArrayList<Integer>();
			if(!isZhiShu(num)){
				int xiaozhishuyinzi;
				int remainNum;
				xiaozhishuyinzi = xiaozhishuyinzi(num);
			    yinZiList.add(xiaozhishuyinzi);
			    remainNum = num/xiaozhishuyinzi;	
			    yinZiList.addAll(allzhishuyinzi(remainNum));
			}
			else{
				yinZiList.add(1);
				yinZiList.add(num);
			}
			return yinZiList;
			//执行allzhishuyinzi(121)11*1*11步骤：第一次到这行allzhishuyinzi(remainNum);进入allzhishuyinzi(remainNum)方法体，return函数后;/
			//return不跳出方法体，继续跑到递归方法那一行,继续执行第一次剩余的代码，到return这行，跳出方法体。
			//执行allzhishuyinzi(999)3*3*3*1*37步骤：第一次到这行allzhishuyinzi(remainNum);进入allzhishuyinzi(remainNum)方法体，return函数后;/
			//return不跳出方法体，继续跑到递归方法那一行,继续执行第一次剩余的代码，到return这行，跳出方法体。
			
		}
		//输出格式类似 99=3x3x11
		public static void zsyzwrite(int num){
			List<Integer> yzl = allzhishuyinzi(num);
			System.out.print(num+"=");
			for(int i=0;i<yzl.size();i++){
				
				if(i==0){
					System.out.print(yzl.get(i));
				}
				else{
					System.out.print("*"+yzl.get(i));
				}
			}
			
		}
}
