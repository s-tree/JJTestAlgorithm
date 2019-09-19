package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSort {

	/**
	 * 计数排序
	 */
	private static List<Integer> data = Arrays.asList(5,48,7,12,0,96,7,3,4,849,2);
	private ArrayList<Integer> datas = new ArrayList<>();

	public CountSort(){
//		data = (List<Integer>) Arrays.asList(12, 87, 13, 19, 37, 81, 31, 18, 0, 98);
		data = Main.list;
		datas.addAll(data);
		doSort();
	}
	
	int step = 0;
	public void doSort(){
		step = 0;
		long time = System.currentTimeMillis();
		
		int max = getMax();
		int[] tempArray = new int[max + 1];
		
		setValues(tempArray);
		
		copyToList(tempArray);
		
		System.out.println("计数排序  step = " + step +" time = " + (System.currentTimeMillis() - time ) +" 正确 ？ "+ ValidateTrueUtil.validateTrueList(datas));
	}
	
	private int getMax(){
		int max = datas.get(0);
		for(int i = 1 ; i < datas.size();i++){
			step++;
			if(datas.get(i) > max){
				max = datas.get(i);
			}
		}
		return max;
	}
	
	private void setValues(int[] tempArray){
		for(int i = 0 ; i < datas.size();i++){
			step++;
			tempArray[datas.get(i)] ++;
		}
	}
	
	private void copyToList(int[] tempArray){
		datas.clear();
		for(int i = 0 ; i < tempArray.length; i++){
			step++;
			if(tempArray[i] == 0){
				continue;
			}
			while(tempArray[i] > 0){
				step++;
				datas.add(i);
				tempArray[i] --;
			}
		}
	}
	
	private void swip(int i ,int k){
		int temp = datas.get(i);
		datas.set(i, datas.get(k));
		datas.set(k, temp);
	}
}
