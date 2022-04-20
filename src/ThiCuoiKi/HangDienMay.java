package ss;
import java.util.*;
public class HangDienMay extends HangHoa{
	private String tgbh, cs; // thoi gian bao hanh, cong suat
	
	public HangDienMay()
	{
		super();
		tgbh = "2 nam";
		cs = "5kw";
	}
	public HangDienMay(String maHang, String tenHang, int slTon, double donGia,double Gia, String tgbh, String cs)
	{
		super(maHang, tenHang, slTon, donGia, Gia);
		this.tgbh = tgbh;
		this.cs = cs;
	}
	public HangDienMay(HangDienMay obj)
	{
		super(obj.maHang, obj.tenHang, obj.slTon, obj.donGia, obj.Gia);
		tgbh = obj.tgbh;
		cs = obj.cs;
	}
	public void inPut()
	{
		Scanner x = new Scanner(System.in);
		super.inPut();
		System.out.printf("Nhap Thoi Gian Bao Hanh :");
		tgbh = x.nextLine();
		System.out.printf("\nNhap Cong Suat :");
		cs = x.nextLine();
	}
	public void outPut()
	{
		super.outPut();
		System.out.printf("\nTHOI GIAN BAO HANH :" + tgbh + "\tCONG SUAT :" + cs + "\tTONG GIA = " + donGia);
		if(slTon < 3)
		{
			System.out.printf("\nBan Duoc !!");
		}
	}
	public double TinhGia()
	{
		return donGia = slTon*(Gia + Gia*0.1);
	}
}
