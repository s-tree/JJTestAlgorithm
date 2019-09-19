package test;
import java.lang.Integer;
import java.util.ArrayList;

public class Tree{
//±ê×¼¶þ²æÊ÷

	public static StringBuilder builder = new StringBuilder();
	public static ArrayList<Integer> datas = new ArrayList<>();
	public static int step = 0;
	public int data;
	public boolean canDraw = true;
	
	public Tree(Integer data){
		this(data,false);
	}
	
	public Tree(Integer data,boolean isRoot){
		this.data = data;
		this.isRoot = isRoot;
	}
	
	public boolean isRoot = false;
	
	public Tree left;
	
	public Tree right;
	
	public Tree parent;
	
	public void add(int t){
		step ++;
		if(t <= data){
			if(left == null){
				left = new Tree(t);
				left.parent = this;
			}else{
				left.add(t);
			}
		}
		else if(t > data){
			if(right == null){
				right = new Tree(t);
				right.parent = this;
			}else{
				right.add(t);
			}
		}
	}
	
	public boolean remove(int t){
		if(left != null && left.remove(t)){
			return true;
		}
		if(data == t){
			if(left != null){
				Tree leftMax = left.getMaxTree();
				if(leftMax.left != null){
					leftMax.parent.right = leftMax.left;
				}else{
					leftMax.parent.right = null;
				}
				this.data = leftMax.data;
			}
			else if(right != null){
				Tree rightMin = right.getMinTree();
				if(rightMin.right != null){
					rightMin.parent.left = rightMin.right;
				}else{
					rightMin.parent.left = null;
				}
				this.data = rightMin.data;
			}else{
				if(parent.left == this){
					parent.left = null;
				}else if(parent.right == this){
					parent.right = null;
				}
			}
			return true;
		}
		if(right != null && right.remove(t)){
			return true;
		}
		return false;
	}
	
	public int deep(){
		int leftDeep = 0;
		int rightDeep = 0;
		if(left != null){
			leftDeep = left.deep();
		}
		if(right != null){
			rightDeep = right.deep();
		}
		return Math.max(leftDeep,rightDeep) + 1;
	}
	
	public void printData(){
		if(isRoot){
			builder.delete(0, builder.length());
			builder.append("[");
		}
		if(left != null){
			left.printData();
		}
		builder.append(String.valueOf(data));
		builder.append(" ,");
		if(right != null){
			right.printData();
		}
		if(isRoot){
			builder.append("]");
			System.out.println(builder.toString());
		}
	}
	
	public void putToList(){
		if(isRoot){
			datas.clear();
		}
		if(left != null){
			left.putToList();
		}
		datas.add(data);
		if(right != null){
			right.putToList();
		}
	}
	
	public void printTree(){
		if(left != null){
			left.printTree();
			System.out.println();
		}
		int deep = deep();
		for (int i = 0 ; i < deep ; i++){
			System.out.print("\t");
		}
		System.out.println(String.valueOf(data));
		if(right != null){
			right.printTree();
		}
	}
	
	public int getMax(){
		if(right != null){
			return right.getMax();
		}
		return data;
	}
	
	public int getMin(){
		if(left != null){
			return left.getMin();
		}
		return data;
	}

	public Tree getMaxTree(){
		if(right != null){
			return right.getMaxTree();
		}
		return this;
	}
	
	public Tree getMinTree(){
		if(left != null){
			return left.getMinTree();
		}
		return this;
	}
}
