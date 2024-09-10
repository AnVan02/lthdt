/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B402
 */
public class HopDong extends Nguoi{
   private int tienlaodong;
   private int ngaylam;
   private float sovuotgio;

    public int getTienlaodong() {
        return tienlaodong;
    }

    public void setTienlaodong(int tienlaodong) {
        this.tienlaodong = tienlaodong;
    }

    public int getNgaylam() {
        return ngaylam;
    }

    public void setNgaylam(int ngaylam) {
        this.ngaylam = ngaylam;
    }

    public float getsovuotgio() {
        return sovuotgio;
    }

    public void setsovuotgio(float sovuotgio) {
        this.sovuotgio = sovuotgio;
    }
    public HopDong()
    {
        super();
        this.ngaylam=1;
        this.sovuotgio=2;
        this.tienlaodong=1;
    }
    public HopDong(int maso, String hoten,int ngaylam,float sovuotgio,int tienlaodong)
    {
        super(maso, hoten);
        this.sovuotgio=sovuotgio;
        this.tienlaodong=tienlaodong;
        this.ngaylam=ngaylam;
    }

    /**
     *
     */
   @Override
   public void NhapNguoi()
    {
        super.NhapNguoi();
        System.out.println("Nhập số vượt giờ");
        this.setsovuotgio(input.nextFloat());
        System.out.println("Nhập ngày làm");
        this.setNgaylam(input.nextInt());
        System.out.println("Nhập tiền lao động");
        this.setTienlaodong(input.nextInt());
    }
   @Override
   public void XuatNguoi()
   {
       super.XuatNguoi();
       System.out.println("Xuất hẹ số vượt giờ"+this.getsovuotgio());
       System.out.println("Xuất tiền lao động"+this.getTienlaodong());
       System.out.println("Xuất ngày làm"+this.getNgaylam());
       System.out.println("Tong tien: "+this.tinhLuong());
       
   }
   @Override
   public float tinhLuong()
    {
        return (this.getNgaylam()*this.getTienlaodong())+(this.getsovuotgio()*50000);
    }
   
}
