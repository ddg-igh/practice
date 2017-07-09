package practice;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args){
		int[] array=new int[100];
		
		for (int i=0; i<array.length; i++){
			array[i]=(int) (Math.random()*1000);
		}	
		
		System.out.println(Arrays.toString(array));
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static int[] mergeSort(int[] array){
		if (array.length<=1){
			return array;
		}
		int[] left=new int[array.length/2];
		int[] right=new int[array.length-(array.length/2)];
		
		/*
		 * An dieser Stelle muss die variable array aufgeteilt werden in eine linke h�lfte und eine rechte h�lft.
		 * Die variablen left und right wurden schon so erzeugt, dass diese nur noch bef�llt werden m�ssen.
		 * Daf�r muss die erste h�lfte von der variable array zu left hinzugef�gt werden und die zweite h�lfte (+ vielleicht einer mehr bei ungerader l�nge) zu right.
		 */
		
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		return merge(left,right);
	}	
	
	private static int[] merge(int[] left, int[] right){
		int[] result=new int[left.length+right.length];
		
		/*
		 * Hier findet das eigentliche sortieren statt.
		 * Man bekommt die 2 listen/arrays left und right die man zusammenf�hren muss zu dem array result.
		 * Dabei werden die Elemente der Liste miteinenader verglichen und jeweils immer sortiert in die neue liste eingef�gt.
		 * 
		 */
		
		
		return result;
		
	}
}
