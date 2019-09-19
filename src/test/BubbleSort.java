package test;

import java.util.ArrayList;

public class BubbleSort {
	/**
	 * Ã°ÅİÅÅĞò
	 */
	private static ArrayList<Integer> data;
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
	}
	
	public BubbleSort(){
		doSort();
	}
	
	private void doSort(){
		datas.addAll(data);
		int step = 0;
		int temp = 0;
		long time = System.currentTimeMillis();
		for(int i = 0 ; i < datas.size() - 1; i++){
			for(int k = i; k < datas.size() ; k++){
				step ++;
				if(datas.get(i) > datas.get(k)){
					temp = datas.get(i);
					datas.set(i, datas.get(k));
					datas.set(k,temp);
				}
			}
		}
		System.out.println("Ã°ÅİÅÅĞò    step = " + step +"   time = " + ( System.currentTimeMillis() - time) +" ÕıÈ· £¿ " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("Ã°ÅİÅÅĞò½á¹û    result = " + datas.toString());
	}
}
