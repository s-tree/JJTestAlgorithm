package test;

import java.util.ArrayList;

public class InsertSort {
	/**
	 * ��������
	 */
	private static ArrayList<Integer> data;
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
	}
	
	public InsertSort(){
		doSort();
	}
	
	private void doSort(){
		datas.addAll(data);
		long step = 0;
		int temp = 0;
		long time = System.currentTimeMillis();
		/**
		 * i Ϊ����������һ���ڵ�,��ǰ����
		 */
		for(int i = 1 ; i < datas.size(); i++){
			for(int k = i - 1 ; k >= 0; k--){
				step++;
				if(datas.get(k) > datas.get(k + 1)){
					temp = datas.get(k);
					datas.set(k, datas.get(k + 1));
					datas.set(k + 1, temp);
				}else{
					break;
				}
			}
		}
		System.out.println("��������    step = " + step +"   time = " + ( System.currentTimeMillis() - time)  +" ��ȷ �� " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("����������    result = " + datas.toString());
	}
}
