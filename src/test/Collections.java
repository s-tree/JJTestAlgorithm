package test;

import java.util.ArrayList;

public class Collections {
	/**
	 * ð������
	 */
	private static ArrayList<Integer> data;
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
	}
	
	public Collections(){
		doSort();
	}
	
	private void doSort(){
		datas.addAll(data);
		long time = System.currentTimeMillis();
		java.util.Collections.sort(datas);
		System.out.println("Collections����  time = " + ( System.currentTimeMillis() - time) +" ��ȷ �� " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("ð��������    result = " + datas.toString());
	}
	
}
