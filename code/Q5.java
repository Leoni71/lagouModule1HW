public class Q5{
	public static void main(String[] args){
		//打印第一行
		System.out.print(" ");
		for(int i = 0; i < 16; i++){
			if(i<10){
				System.out.print(" " + i);
			}
			else{
				System.out.print(" " + (char)(87+i));
			}
		}
		System.out.print("\n");

		//打印其他行
		for(int i = 0; i < 16; i++){
			if(i < 10){
				System.out.print(i);
			}
			else{
				System.out.print((char)(87+i));
			}
			for(int j = 0; j < 16; j++){
				System.out.print(" +");
			}
			System.out.print("\n");
		}
	}
}