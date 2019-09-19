package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapSort {
	/**
	 * 堆排序
	 * 核心基础	： 二叉树 左子节点 坐标2n + 1;右子节点坐标 2n + 2;
	 */
	private static List<Integer> data = Arrays.asList(5,48,7,12,0,96,7,3,4,849,2);
	private ArrayList<Integer> datas = new ArrayList<>();

	public HeapSort(){
//		data = (List<Integer>) Arrays.asList(12, 87, 13, 19, 37, 81, 31, 18, 0, 98);
		data = Main.list;
		datas.addAll(data);
		doSort();
	}
	
	int step = 0;
	public void doSort(){
		step = 0;
		long time = System.currentTimeMillis();
		/**
		 * 先将无序数列构建成大顶堆
		 */
		for(int i = datas.size() / 2 - 1;i >= 0; i--){
			buildHeap(i,datas.size());
		}
		/**
		 * 每次将最大值移动到末尾,并重新构建大顶堆
		 */
		for(int i = datas.size() - 1 ; i > 0; i--){
			swip(0, i);
			buildHeap(0, i);
		}
		System.out.println("堆排序  step = " + step +" time = " + (System.currentTimeMillis() - time ) +" 正确 ？ "+ ValidateTrueUtil.validateTrueList(datas));
	}
	
	private void buildHeap(int start,int end){
		int temp = datas.get(start);
		/**
		 * 设当前节点为起始节点的左子节点
		 */
		for(int i = start * 2 + 1; i < end ; i = i * 2 + 1 ){
			step ++;
			/**
			 * 如果起始节点存在右子节点，且右子节点大于左子节点,则将当前下标改为起始节点的右子节点
			 */
			if(i + 1 < end && datas.get(i) < datas.get(i + 1)){
				step ++;
				i++;
			}
			/**
			 * 将最大数节点交换
			 */
			if(datas.get(i) > temp){
				datas.set(start, datas.get(i));
				start = i;
			}else{
				break;
			}
		}
		datas.set(start, temp);
	}
	
	private void swip(int i ,int k){
		int temp = datas.get(i);
		datas.set(i, datas.get(k));
		datas.set(k, temp);
	}
	
}
