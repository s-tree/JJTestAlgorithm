package test;

import java.util.ArrayList;

public class ChooseSort {
	/**
	 * ѡ������
	 */
	private static ArrayList<Integer> data;
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
	}
	
	public ChooseSort(){
		doSort();
	}
	
	private void doSort(){
		datas.addAll(data);
		int temp = 0;
		long time = System.currentTimeMillis();
		int stepCount = 0;
		for(int i = 0 ; i < datas.size() - 1;i++){
			for(int k = i + 1;k < datas.size() ;k++){
				stepCount++;
				if(datas.get(k) < datas.get(i)){
					temp = datas.get(i);
					datas.set(i,datas.get(k));
					datas.set(k, temp);
				}
			}
		}
		System.out.println("ѡ������    step = " + stepCount +"   time = " + ( System.currentTimeMillis() - time)  +" ��ȷ �� " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("ѡ��������    result = " + datas.toString());
	}
}
