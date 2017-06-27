package practice;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args){
		int[] array=new int[5];
		
		for (int i=0; i<array.length; i++){
			array[i]=5-i;
		}	
		
		System.out.println(Arrays.toString(array));
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void bubbleSort(int[] array){
		for (int n=array.length; n>1 ; n--){
			for (int i=0; i<n-1; i++){
				if (array[i]>array[i+1]){
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
	}	
}
