package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
	private int stepCount = 0;

	/**
	 * �������� err
	 */
	private static List<Integer> data;
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
//		data = (List<Integer>) Arrays.asList(12, 87, 13, 18, 37, 81, 31, 18, 0, 98);
	}
	
	public QuickSort(){
		doSort();
	}
	
	private void doSort(){
		stepCount = 0;
		datas.clear();
		datas.addAll(data);
		long time2 = System.currentTimeMillis();
		sort2(datas,0,datas.size());
		System.out.println("��������    step = " + stepCount +"   time = " + ( System.currentTimeMillis() - time2) +" ��ȷ �� " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("result = " + datas.toString());
	}
	/**
	 * �ɺ���ǰѰ�ҵ�һ��������ʼ�ڵ�������滻��ǰһ������
	 * ����ǰ���Ѱ�ҵ�һ��С����ʼ�ڵ������滻����һ������
	 * ֱ�������α����
	 * ȡ��һ��ֵΪ��׼����֧�ִ�����������
	 * 
	 * @param data
	 * @param left
	 * @param right
	 */
	private void sort(List<Integer> data,int left,int right){
		if(right <= left){
			return;
		}
		int start = left;
		int end = right - 1;
		int temp = data.get(left);
		while(start < end){
			while(end > start && data.get(end) >= temp){
				stepCount++;
				end --;
			}
			if(start < end){
				data.set(start, data.get(end));
			}
			while(start < end && data.get(start) <= temp){
				stepCount++;
				start ++;
			}
			if(start < end){
				data.set(end, data.get(start));
			}
		}
		data.set(start, temp);
		sort(data,left,start);
		sort(data,start + 1,right);
	}
	
	/**
	 * ȡ�����м�ֵΪ��׼��֧�ִ�����������
	 * @param data
	 * @param left
	 * @param right
	 */
	private void sort2(List<Integer> data,int left,int right){
		if(right <= left){
			return;
		}
		int start = left;
		int end = right - 1;
		int position = ( left + right ) / 2;
		int temp = data.get(position);
		while(start < end){
			while(end > position && data.get(end) >= temp){
				stepCount++;
				end --;
			}
			if(start < end){
				data.set(position, data.get(end));
				position = end;
			}
			while(start < position && data.get(start) <= temp){
				stepCount++;
				start ++;
			}
			if(start < end){
				data.set(position, data.get(start));
				position = start;
			}
		}
		data.set(position, temp);
		sort2(data,left,start);
		sort2(data,start + 1,right);
	}
}