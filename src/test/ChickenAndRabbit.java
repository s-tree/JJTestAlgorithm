package test;

public class ChickenAndRabbit {
	//ผฆอรอฌมý
	public ChickenAndRabbit(){
		
	}
	
	private void doWork(int headCount,int footCount){
		if(footCount < (headCount * 2)){
			throw new RuntimeException("footCount can not less than headCount * 2");
		}
		int rabbitCount = ( footCount - ( headCount * 2) ) / 2;
		int chickenCount = headCount - rabbitCount;
	}
}
