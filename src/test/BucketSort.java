package test;

import java.util.ArrayList;

public class BucketSort {
	/**
	 * 桶排序
	 * 将数组分成多个段，每个桶保存一个段数据，在桶内分别排序
	 * 初步可以用数组 + 链表实现
	 */
	private static ArrayList<Integer> data;
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
	}
	
	public BucketSort(){
		doSort();
	}
	
	private void doSort(){
		
	}
}
