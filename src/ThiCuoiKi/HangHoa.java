package ss;
import java.util.*;
abstract public class HangHoa {
	protected String maHang,tenHang;
	protected int slTon;
	protected double donGia,Gia;
	
	public HangHoa()
	{
		maHang = "a01";
		tenHang = "A";
		slTon = 10;
		donGia = 5000;
		Gia = 4900;
	}
	public HangHoa(String maHang, String tenHang, int slTon, double donGia, double Gia)
	{
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.slTon = slTon;
		this.donGia = donGia;
		this.Gia = Gia;
	}
	public HangHoa(HangHoa obj)
	{
		maHang = obj.maHang;
		tenHang = obj.tenHang;
		slTon = obj.slTon;
		donGia = obj.donGia;
		Gia = obj.Gia;
	}
	public void inPut()
	{
		Scanner x = new Scanner(System.in);
		
		System.out.printf("Nhap Ma Hang :");
		maHang = x.nextLine();
		System.out.printf("\nNhap Ten Hang :");
		tenHang = x.nextLine();
		System.out.printf("\nNhap So Luong Ton :");
		slTon = x.nextInt();
		System.out.printf("\nNhap Gia :");
		Gia = x.nextDouble();
	}
	public void outPut()
	{
		System.out.printf("\nMA HANG :" + maHang + "\tTEN HANG :" + tenHang + "\t SO LUONG TON :" + slTon + "\tGIA :" + Gia);
	}
	abstract double TinhGia();
}
