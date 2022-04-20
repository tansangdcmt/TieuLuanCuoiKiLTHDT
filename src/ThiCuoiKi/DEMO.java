package ss;
import java.util.Scanner;
public class DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("--------------- Hang Thuc Pham---------------\n");
		HangThucPham a1 = new HangThucPham("a01", "A1", 7, 3000, 2500, "10-01-2000", "10-01-2002", "Cong Ty A1");
		a1.outPut();
		HangThucPham a2 = new HangThucPham("a02", "A2", 4, 1000, 500, "15-01-2000", "15-01-2002", "Cong Ty A2");
		a2.outPut();
		HangThucPham a3 = new HangThucPham("a03", "A3", 5, 1500, 1000, "05-05-2000", "05-05-2002", "Cong Ty A3");
		a3.outPut();
		System.out.printf("\n--------------- Hang Dien May---------------\n");
		HangDienMay b1 = new HangDienMay("b01", "B1", 5, 10500, 10000, "2 nam", "50kw");
		b1.outPut();
		HangDienMay b2 = new HangDienMay("b02", "B2", 8, 12500, 11000, "2 nam", "60kw");
		b2.outPut();
		HangDienMay b3 = new HangDienMay("b03", "B3", 3, 3500, 1000, "2 nam", "30kw");
		b3.outPut();
		System.out.printf("\n--------------- Hang Sanh Su---------------\n");
		HangSanhSu c1 = new HangSanhSu("c01", "C1", 9, 5300, 900, "19-01-2005", "20-05-2005");
		c1.outPut();
		HangSanhSu c2 = new HangSanhSu("c02", "C2", 2, 500, 90, "19-11-2001", "25-05-2005");
		c2.outPut();
		HangSanhSu c3 = new HangSanhSu("c03", "C3", 6,3200 , 500, "30-12-2009", "10-05-2010");
		c3.outPut();
		HangSanhSu c4 = new HangSanhSu("c04", "C4", 4, 4300, 400, "14-04-2004", "24-05-2005");
		c4.outPut();
		
		DS a = new DS ();
		HangHoa hh;
		int chon;
		Scanner v = new Scanner(System.in);
		do {
			 System.out.println("\t1. Them 1 Hang Hoa Vao DS."); 
			 System.out.println("\t2. Xoa, Suu Hang Hoa.");
	         System.out.println("\t3. In Toan Bo DS Cac Hang Hoa.");
	         System.out.println("\t4. Tim Kiem Hang Hoa Theo Ma.");
	         System.out.println("\t0. Thoat.");
	         System.out.printf("Nhap lua chon: ");
	         chon = v.nextInt();     
	        switch(chon) {
	        	case 1:
	        		System.out.printf("\nChon Hang Hoa Can Them ( Nhap 1: Hang Thuc Pham , 2: Hang Dien May , 3: Hang Sanh Su )");
	        		int x = v.nextInt();
	        		a.inPutDS(x);
	        		a.adds(null);
	        	break;
	        	case 2 :
	        		
	        		break ;
	        	case 3 : 

	        		break;
	        	case 4 :

	        		break;
	        	case 5 :

	        		break ;
	        	case 6:

	        		break;
	        }
		}while (chon != 0);
		
//		int x = v.nextInt();
//		DS a = new DS();
//		a.inPutDS(x);
		}
	}
