package algorithm;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//quickSort
	public static void quickSort(int[] arra){
		//int[] arra = new int[]{3,8,5,10,12,10};
		int min =arra[0];
		int temp;
		int i=0;
		if(min>arra[i+1]){
			temp=arra[i];
			arra[i]=arra[i+1];
			arra[i+1]=temp;
			min = arra[i+1];
			i++;
		    quickSort(arra);
		}
		
	}

}
