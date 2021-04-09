import java.util.Scanner;
import java.util.Arrays;

public class Q4{
	public static void main(String[] args){
		int[] arr = new int[10];
		int[] temp;
		Scanner sc = new Scanner(System.in);
		int i = 0;

		System.out.println("请输入要添加的元素数值：");
		int num = sc.nextInt();

		while (num != -1){
			//赋值
			arr[i] = num;
			//扩容
			if( (i+1) >= 0.8*arr.length){
				temp = new int[(int)(1.5*arr.length)];
				System.arraycopy(arr, 0, temp, 0, i+1);
				arr = temp;
			}
			
			System.out.println("当前容量为 " + arr.length + " 的数组：");
			System.out.println(Arrays.toString(arr));
			System.out.println("请输入要添加的元素数值：");
			num = sc.nextInt();
			i++;
		}
	}
}