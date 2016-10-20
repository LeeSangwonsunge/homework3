import java.util.*;

class A02{
        void input(){
                Scanner s = new Scanner(System.in);
                System.out.print(" 아파트의 분양 면적(제곱미터)을 입력하시오. : ");
                double m2_area = s.nextDouble();
                double pyung_area = m2_area / 3.305;
                String area = "";
                
                if(pyung_area<15)
                	area = "소형";
                else if(pyung_area>=15 && pyung_area<30)
                	area = "중소형";
                else if(pyung_area>=30 && pyung_area<50)
                	area = "중형";
                else if(pyung_area>=50)
                	area = "대형";
                System.out.printf(area + " 아파트입니다.");
        	}
        public static void main(String[] args){
                new A02().input();
        }
}