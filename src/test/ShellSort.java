package test;

import java.util.ArrayList;

public class ShellSort {
	/**
	 * ϣ������
	 */
	private static ArrayList<Integer> data;
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
	}
	
	public ShellSort(){
		doSort();
	}
	
	private void doSort(){
		datas.addAll(data);
		int step = 0;
		long time = System.currentTimeMillis();
		int temp = 0;
//		int grap = datas.size() / 3 + 1;
		int grap = 0;
		while(grap < datas.size()/3) {         //��̬����������
			grap =grap*3+1;
	    }
		/**
		 * ����
		 */
		for(;grap > 0; grap = Math.round(grap/3)){
			/**
			 * ÿ�鲽���ڵĲ�������
			 */
			for(int i = grap ; i < datas.size() ; i += grap){
				/**
				 * i Ϊ����������һ���ڵ㣬֮ǰ��grap��������������
				 */
				for(int j = i - grap ; j >= 0; j -= grap){
					step ++;
					if(datas.get(j) > datas.get(j + grap)){
						temp = datas.get(j + grap);
						datas.set(j + grap, datas.get(j));
						datas.set(j, temp);
					}else{
						break;
					}
				}
			}
		}

		System.out.println("ϣ������    step = " + step +"   time = " + ( System.currentTimeMillis() - time) +" ��ȷ �� " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("ϣ��������    result = " + datas.toString());
	}
}
