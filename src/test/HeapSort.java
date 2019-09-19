package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapSort {
	/**
	 * ������
	 * ���Ļ���	�� ������ ���ӽڵ� ����2n + 1;���ӽڵ����� 2n + 2;
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
		 * �Ƚ��������й����ɴ󶥶�
		 */
		for(int i = datas.size() / 2 - 1;i >= 0; i--){
			buildHeap(i,datas.size());
		}
		/**
		 * ÿ�ν����ֵ�ƶ���ĩβ,�����¹����󶥶�
		 */
		for(int i = datas.size() - 1 ; i > 0; i--){
			swip(0, i);
			buildHeap(0, i);
		}
		System.out.println("������  step = " + step +" time = " + (System.currentTimeMillis() - time ) +" ��ȷ �� "+ ValidateTrueUtil.validateTrueList(datas));
	}
	
	private void buildHeap(int start,int end){
		int temp = datas.get(start);
		/**
		 * �赱ǰ�ڵ�Ϊ��ʼ�ڵ�����ӽڵ�
		 */
		for(int i = start * 2 + 1; i < end ; i = i * 2 + 1 ){
			step ++;
			/**
			 * �����ʼ�ڵ�������ӽڵ㣬�����ӽڵ�������ӽڵ�,�򽫵�ǰ�±��Ϊ��ʼ�ڵ�����ӽڵ�
			 */
			if(i + 1 < end && datas.get(i) < datas.get(i + 1)){
				step ++;
				i++;
			}
			/**
			 * ��������ڵ㽻��
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
