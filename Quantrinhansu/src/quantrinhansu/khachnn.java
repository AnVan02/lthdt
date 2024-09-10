/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class khachnn extends khachhang {
    Scanner input=new Scanner(System.in);
    private int makh, soluong, dongia;
    private String hoten, ngayhd, quoctich;

 

    public int getMakh() {
        return makh;
    }

 

    public void setMakh(int makh) {
        this.makh = makh;
    }

 

    public int getSoluong() {
        return soluong;
    }

 

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

 

    public int getDongia() {
        return dongia;
    }

 

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

 

    public String getHoten() {
        return hoten;
    }

 

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

 

    public String getNgayhd() {
        return ngayhd;
    }

 

    public void setNgayhd(String ngayhd) {
        this.ngayhd = ngayhd;
    }

 

    public String getQuoctich() {
        return quoctich;
    }

 

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }
    public khachnn()
    {
        super();
        this.quoctich="Hàn Quốc";
    }
    public khachnn(int makh, int soluong, int donggia, String hoten, String ngayhd, String quoctich)
    {
        super(makh,soluong,donggia,hoten,ngayhd,quoctich)
        this.quoctich=quoctich;
    }

    /**
     *
     */
    public void NhapKH()
    {
        super.nhapKH();           
        System.out.println("Nhap quốc tịch:   ");
        this.setQuoctich(kiemtra());
    }
    public String kiemtra()
    {
        String gt=" ";
        do
        {
            gt=input.nextLine();
            if(gt.equalsIgnoreCase("Quốc Tịch"));
            {
                System.out.println("Bạn nhập sai quốc tịch!!");
            }
        }while(gt.equalsIgnoreCase("Quốc Tịch"));
        return gt;
    }
        public void xuatKH()
    {
        super.xuatKH();
        System.out.println("Quốc Tịch"+this.getQuoctich());
    }

    public double tinhTien() {
        double thanhtien;
        thanhtien=this.soluong*this.dongia;
        return thanhtien;
    }
}