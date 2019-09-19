package test;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	private int stepCount = 0;

	/**
	 * �鲢���� err
	 */
	private static ArrayList<Integer> data;
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
	}
	
	public MergeSort(){
		doSort();
	}
	
	/**
	 * �������򣬽���������ͷ���Ƚϣ�ȡ��Сֵ�����¼��ϣ��Դ����ƣ�������2 һֱ��  < size * 2
	 */
	private void doSort(){
		datas.addAll(data);
		stepCount = 0;
		ArrayList<Integer> tempList = new ArrayList<>();
		long time = System.currentTimeMillis();
		int step = 2;
		for(; step < datas.size() * 2; step *= 2){
			for(int i = 0 ; i < datas.size();i += step){
				int end = ( i + step ) > datas.size() ? datas.size() : ( i + step );
				int middle = i + (step / 2) ;
				doSort(datas,tempList,i,end,middle);
			}
		}
		
		System.out.println("�鲢����    step = " + stepCount +"   time = " + ( System.currentTimeMillis() - time) +" ��ȷ �� " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("�鲢������    result = " + datas.toString());
	}
	
	private void doSort(List<Integer> mData,List<Integer> tempData,int start,int end,int middle){
		if(mData.size() == 1){
			return;
		}
		tempData.clear();
		int left,right;
		left = start;
		right = middle;
		for(int i = start; i < end ;i++){
			stepCount++;
			if(right >= end){
				tempData.add(mData.get(left));
				left ++;
				continue;
			}
			if(left >= middle){
				tempData.add(mData.get(right));
				right ++;
				continue;
			}
			if( mData.get(left) <= mData.get(right)){
				tempData.add(mData.get(left));
				left ++;
			}
			else if(mData.get(right) < mData.get(left)){
				tempData.add(mData.get(right));
				right ++;
			}
		}
		for(int i = 0 ; i < tempData.size();i++){
			mData.set(start++, tempData.get(i));
		}
	}
}
