package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class HalfInsert {
	/**
	 * 二分插入以及二分插入排序
	 */
	//二分法插入
	private static List<Integer> data = Arrays.asList(5,48,7,12,0,96,7,3,4,849,2,45,12,897,89,15,12,3,87,7,5,18,489,5,6,849,5,468,
			48,156,84,6,864,486,65,123,186,498,564984,651,84,12,12,3,84,13,8,7,45,6,126,8,51,1,68,7,1245,165,5411,
			41561,15615,1,2,45,12,54,4,12,6,8,7,5,87,41,1,12,12,12,2,3,5,8,78,78,5,85,68,32,0,5,48,7,12,0,96,7,3,4,849,2,45,12,897,89,15,12,3,87,7,5,18,489,5,6,849,5,468,
			48,156,84,6,864,486,65,123,186,498,564984,651,84,12,12,3,84,13,8,7,45,6,126,8,51,1,68,7,1245,165,5411,
			41561,15615,1,2,45,12,54,4,12,6,8,7,5,87,41,1,12,12,12,2,3,5,8,78,78,5,85,68,32,0,5,48,7,12,0,96,7,3,4,849,2,45,12,897,89,15,12,3,87,7,5,18,489,5,6,849,5,468,
			48,156,84,6,864,486,65,123,186,498,564984,651,84,12,12,3,84,13,8,7,45,6,126,8,51,1,68,7,1245,165,5411,
			41561,15615,1,2,45,12,54,4,12,6,8,7,5,87,41,1,12,12,12,2,3,5,8,78,78,5,85,68,32,0);
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
	}
	
	public HalfInsert(){
		doSort();
	}
	
	public int doInsert(int key){
		int step = 1;
		if(datas.size() == 0){
			datas.add(key);
		}else{
			int startIndex = 0;
			int endIndex = datas.size() - 1;
			if(key <= datas.get(startIndex)){
				datas.add(startIndex,key);
			}else if(key >= datas.get(endIndex)){
				datas.add(key);
			}else{
				while(endIndex - startIndex > 1){
					step++;
					int half = (endIndex + startIndex)/ 2;
					int value = (int) datas.get(half);
					if(key > value){
						startIndex = half;
					}else if(key == value){
						startIndex = half;
						endIndex = half;
					}
					else{
						endIndex = half;
					}
				}
				step++;
				datas.add(endIndex,key);
			}
		}
		return step;
	}
	
	public void doSort(){
		datas.clear();
		datas.add(data.get(0));
		long time = System.currentTimeMillis();
		int stepCount = 0;
		for(int i = 1 ; i < data.size(); i++){
			stepCount += doInsert(data.get(i));
		}
		System.out.println("二分法排序    step = " + stepCount +"   time = " + ( System.currentTimeMillis() - time)  +" 正确 ？ " + ValidateTrueUtil.validateTrueList(datas));
//		System.out.println("二分法结果    result = " + datas.toString());
	}
}
