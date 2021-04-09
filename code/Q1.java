import java.util.Scanner;

public class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		System.out.println("请输入日期：");
		int day = sc.nextInt();

		boolean isLeapYear;
		if (year%4 == 0){
			if (year%100 == 0 && year%400 != 0){
				isLeapYear = false;
			}
			else{
				isLeapYear = true;
			}
		}
		else{
			isLeapYear = false;
		}
		
		int resultDay = 0;
		int[] dayInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i = 0; i < month-1; i++){
			resultDay += dayInMonth[i];
		}

		if (isLeapYear && month > 2) {
			resultDay += day+1;
		}
		else{
			resultDay += day;
		}

		System.out.println("这是" + year + "年的第" + resultDay + "天");
	}
}
