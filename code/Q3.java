import java.util.Random;
import java.util.Arrays;

public class Q3{
	public static void main(String[] args){
		int[] red = new int[6];
		int blue;

		Random r = new Random();
		for(int i = 0; i < 6; i++){
			red[i] = r.nextInt(32)+1;
		}

		blue = r.nextInt(15)+1;

		System.out.println("双色球中奖号码为：");
		System.out.println("红球号码：" + Arrays.toString(red));
		System.out.println("蓝球号码：" + blue);

	}
}