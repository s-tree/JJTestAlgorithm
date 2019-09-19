package test;

import java.util.ArrayList;

public class Collections {
	/**
	 * √∞≈›≈≈–Ú
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
		System.out.println("Collections≈≈–Ú  time = " + ( System.currentTimeMillis() - time) +" ’˝»∑ £ø " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("√∞≈›≈≈–ÚΩ·π˚    result = " + datas.toString());
	}
	
}
