package ss;
import java.util.*;
public class HangSanhSu extends HangHoa{
	private String nsx,nnk; // nha san xuat, ngay nhap kho
	
	public HangSanhSu()
	{
		super();
		nsx = "AAA";
		nnk = "01-02-2012";
	}
	public HangSanhSu(String maHang, String tenHang, int slTon, double donGia,double Gia, String nsx, String nnk)
	{
		super(maHang, tenHang, slTon, donGia,Gia);
		this.nsx = nsx;
		this.nnk = nnk;
	}
	 public HangSanhSu(HangSanhSu obj)
	 {
		 super(obj.maHang, obj.tenHang, obj.slTon, obj.donGia, obj.Gia);
		 nsx = obj.nsx;
		 nnk = obj.nnk;
	 }
	 public void inPut()
	 {
		Scanner x = new Scanner(System.in);
		super.inPut();
		System.out.printf("Nhap Nha San Xuat :");
		nsx = x.nextLine();
		System.out.printf("\nNhap Ngay Nhap Kho :");
		nnk = x.nextLine();
	 }
	public void outPut()
	{
		super.outPut();
		System.out.printf("\nNHA SAN XUAT :" + nsx + "\tNGAY NHAP KHO :" + nnk + "\tTONG GIA = " + donGia);
	}
	public double TinhGia()
	{
		return donGia = slTon*(Gia + Gia*0.1);
	}
}
