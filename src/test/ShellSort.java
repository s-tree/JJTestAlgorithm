package test;

import java.util.ArrayList;

public class ShellSort {
	/**
	 * 希尔排序
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
		while(grap < datas.size()/3) {         //动态定义间隔序列
			grap =grap*3+1;
	    }
		/**
		 * 步长
		 */
		for(;grap > 0; grap = Math.round(grap/3)){
			/**
			 * 每组步长内的插入排序
			 */
			for(int i = grap ; i < datas.size() ; i += grap){
				/**
				 * i 为待排序的最后一个节点，之前以grap作步长插入排序
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

		System.out.println("希尔排序    step = " + step +"   time = " + ( System.currentTimeMillis() - time) +" 正确 ？ " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("希尔排序结果    result = " + datas.toString());
	}
}
