import java.util.*;

class A02{
        void input(){
                Scanner s = new Scanner(System.in);
                System.out.print(" ����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�. : ");
                double m2_area = s.nextDouble();
                double pyung_area = m2_area / 3.305;
                String area = "";
                
                if(pyung_area<15)
                	area = "����";
                else if(pyung_area>=15 && pyung_area<30)
                	area = "�߼���";
                else if(pyung_area>=30 && pyung_area<50)
                	area = "����";
                else if(pyung_area>=50)
                	area = "����";
                System.out.printf(area + " ����Ʈ�Դϴ�.");
        	}
        public static void main(String[] args){
                new A02().input();
        }
}