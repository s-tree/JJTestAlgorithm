package test;

import java.util.ArrayList;

public class SleepSort {
	/**
	 * ц╟ещеепР
	 */
	private static ArrayList<Integer> data;
	private static ArrayList<Integer> datas = new ArrayList<>();
	static{
//		Collections.sort(data);
//		datas.addAll(data);
		data = Main.list;
	}
	
	public SleepSort(){
		doSort();
	}
	
	private void doSort(){
		for(int i = 0 ; i < data.size() - 1; i++){
			new SortThread(data.get(i)).start();
		}
	}
	
	private synchronized static int addInteger(int k){
		datas.add(k);
		return datas.size();
	}
	
	static class SortThread extends Thread{
		
		int d;
		public SortThread(int data){
			this.d = data;
		}
		
		@Override
		public void run(){
			try {
				Thread.sleep(d);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int size = addInteger(d);
			System.out.println("data.size = " +data.size() +" datas.size = " + size);
			if(size == data.size() - 1){
				System.out.println("sort ok");
				for(int i = 0 ; i < data.size(); i++){
					System.out.print(data.get(i) + ",");
					if(i % 30 == 29){
						System.out.println();
					}
				}
			}
		}
		
	}
}