package test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ui.TreePrinter;


public class TreeInsert {
	/**
	 * 使用树结构插入排序
	 */
	private static List<Integer> data = Arrays.asList(5,48,7,12,0,96,7,3,4,849,2,45,12,897,89,15,12,3,87,7,5,18,489,5,6,849,5,468,
			48,156,84,6,864,486,65,123,186,498,564984,651,84,12,12,3,84,13,8,7,45,6,126,8,51,1,68,7,1245,165,5411,
			41561,15615,1,2,45,12,54,4,12,6,8,7,5,87,41,1,12,12,12,2,3,5,8,78,78,5,85,68,32,0,5,48,7,12,0,96,7,3,4,849,2,45,12,897,89,15,12,3,87,7,5,18,489,5,6,849,5,468,
			48,156,84,6,864,486,65,123,186,498,564984,651,84,12,12,3,84,13,8,7,45,6,126,8,51,1,68,7,1245,165,5411,
			41561,15615,1,2,45,12,54,4,12,6,8,7,5,87,41,1,12,12,12,2,3,5,8,78,78,5,85,68,32,0,5,48,7,12,0,96,7,3,4,849,2,45,12,897,89,15,12,3,87,7,5,18,489,5,6,849,5,468,
			48,156,84,6,864,486,65,123,186,498,564984,651,84,12,12,3,84,13,8,7,45,6,126,8,51,1,68,7,1245,165,5411,
			41561,15615,1,2,45,12,54,4,12,6,8,7,5,87,41,1,12,12,12,2,3,5,8,78,78,5,85,68,32,0);
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
		data = Main.list;
		datas.addAll(data);
	}
	
	public TreeInsert(){
		doInsert();
	}
	
	public void doInsert(){
		long time = System.currentTimeMillis();
		int center = datas.size() / 2;
		Tree treeRoot = new Tree(datas.get(center),true);
		datas.remove(center);
		for(int i = 0 ; i < datas.size(); i++){
			treeRoot.add(datas.get(i));
		}
		treeRoot.putToList();
		System.out.println("二叉树插入排序    step = " + treeRoot.step +"   树的深度为   " + treeRoot.deep()+"   time = " + ( System.currentTimeMillis() - time)  +" 正确 ？ " + ValidateTrueUtil.validateTrueList(treeRoot.datas));
//		System.out.println("最大值  " + treeRoot.getMax());
//		System.out.println("最小值  " + treeRoot.getMin());
//		new TreePrinter().printTree(treeRoot);
//		treeRoot.printData();
//		treeRoot.remove(849);
//		treeRoot.printData();
//		treeRoot.remove(68);
//		treeRoot.printData();
//		treeRoot.printTree();
	}
}
