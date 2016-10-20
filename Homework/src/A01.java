import java.util.*;

class A01{
	public static void main(String[] s){
		new A01().input();
	}

	void input(){
		Scanner s = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int num3 = s.nextInt();

		int max_num = num1;
		int min_num = num1;

		if(max_num < num2) max_num = num2;
		if(max_num < num3) max_num = num3;
		if(min_num > num2) min_num = num2;
		if(min_num > num3) min_num = num3;

		System.out.print("가장큰수는"+max_num+"이고,  가장작은수는"+min_num+"입니다.");
	}
}