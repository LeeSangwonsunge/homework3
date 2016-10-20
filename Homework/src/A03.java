import java.util.*;

class A03{
        void input(){
                Scanner s = new Scanner(System.in);
                System.out.print("월을 입력하시오. : ");
                int month = s.nextInt();
                System.out.print("일을 입력하시오. : ");
                int day = s.nextInt();
                int day_count = 0;
                
		switch(month){
			case 1 : day_count = day;
				break;
			case 2 : day_count = 31 + day;
				break;
			case 3 : day_count = 59 + day;
				break;
			case 4 : day_count = 90 + day;
				break;
			case 5 : day_count = 120 + day;
				break;
			case 6 : day_count = 151 + day;
				break;
			case 7 : day_count = 181 + day;
				break;
			case 8 : day_count = 212 + day;
				break;
			case 9 : day_count = 242 + day;
				break;
			case 10 : day_count = 273 + day;
				break;
			case 11 : day_count = 303 + day;
				break;
			case 12 : day_count = 334 + day;
				break;
		}
                System.out.printf("이 날짜는 1년 중 " + day_count + "번째 날입니다.");
        	}
        public static void main(String[] args){
                new A03().input();
        }
}