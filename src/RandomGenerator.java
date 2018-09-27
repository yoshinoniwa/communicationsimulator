import java.text.ParseException;
import java.util.Random;

public class RandomGenerator {
//	private double nextNextGaussian;
//	private boolean haveNextNextGaussian = false;
//	
	//mainメソッド
	public static void main(String args[]) throws ParseException{
		Random r = new Random();
		int num=300;//
		double time_ave=1.9074074074074074; //タイミングの平均値
		double time_var=3.213414648884165; //タイミングの標準偏差
		double data_ave=80; //データ量の秒平均
		double data_var=2249.1389590558556; //データ量の標準偏差
		int[] time_rundom_num = new int[num];
		double[] data_random_num = new double[num];
		System.out.print("タイミング");
		for(int i=0;i<num;num++){
			time_rundom_num[i] = (int)(r.nextGaussian()*time_var+time_ave); //タイミングの乱数
			System.out.println(Math.abs(time_rundom_num[i]));
		}
		System.out.println("データ量");
		for(int i=0;i<num;num++){
			data_random_num[i] = (r.nextGaussian()*data_var+data_ave); //データ量の乱数
			System.out.println(Math.abs(data_random_num[i]));
		}
		
	}
	
	
}
