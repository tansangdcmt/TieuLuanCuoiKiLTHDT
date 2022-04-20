package ss;
import java.util.*;
public class HangThucPham extends HangHoa{
	private String nsx, nhh, ncc; // Ngay san xuat , ngay het han , nha cung cap
	
	public HangThucPham()
	{
		super();
		nsx = "01-01-2000";
		nhh = "01-01-2010";
		ncc = "ABS";
	}
	public HangThucPham(String maHang, String tenHang, int slTon, double donGia,double Gia, String nsx, String nhh, String ncc)
	{
		super(maHang, tenHang, slTon, donGia, Gia);
		this.nsx = nsx;
		this.nhh = nhh;
		this.ncc = ncc;
	}
	public HangThucPham(HangThucPham obj)
	{
		super(obj.maHang, obj.tenHang, obj.slTon, obj.donGia, obj.Gia);
		nsx = obj.nsx;
		nhh = obj.nhh;
		ncc = obj.ncc;
	}
	public void inPut()
	{
		Scanner x = new Scanner(System.in);
		super.inPut();
		System.out.printf("Nhap Ngay San Xuat :");
		nsx = x.nextLine();
		System.out.printf("\nNhap Ngay Het Han :");
		nhh = x.nextLine();
		System.out.printf("\nNhap Nha Cung Cap :");
		ncc = x.nextLine();
	}
	public void outPut()
	{
		super.outPut();
		System.out.printf("\nNGAY SAN XUAT :" + nsx + "\tNGAY HET HAN :" + nhh + "\t NHA CUNG CAP :" + ncc + "\tTONG GIA = " + donGia);
		if(slTon > 0 && nsx == nhh)
		{
			System.out.printf("\nKho Ban !!");
		}
	}
	public double TinhGia()
	{
		return donGia = slTon*(Gia + Gia*0.05);
	}
}