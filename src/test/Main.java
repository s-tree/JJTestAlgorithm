package test;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static ArrayList<Integer> list = new ArrayList<>();
	
	public static void main(String[] args){
		for(int i = 0 ; i < 1000; i++){
//			list.add((int)(Math.random() * 1000));
			list.add(i);
		}
//		new Collections();
//		new TreeInsert();
//		new HalfInsert();
//		new BubbleSort();
//		new ChooseSort();
//		new InsertSort();
//		new ShellSort();
//		new MergeSort();
//		new QuickSort();
//		new HeapSort();
//		new CountSort();
		
		
//		for(int i = 0 ; i < 400 ; i++){
//			char startChar = 'a';
//			StringBuilder builder = new StringBuilder();
//			for(int k = 0 ; k < 100 ; k++){
//				int index = (int) (Math.random() * 26);
//				builder.append((char)(startChar + index));
//			}
//			System.out.println("public static final String a" + i + " = " + "\"" + builder.toString() +"\";");
//		}
		
		new SleepSort();
	}
}
