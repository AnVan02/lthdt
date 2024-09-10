/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi8;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class khachVN extends khachhang{
        Scanner input=new Scanner(System.in);
    private String doituong;
    private int dinhmuc;

    public String getDoituong() {
        return doituong;
    }

    public void setDoituong(String doituong) {
        this.doituong = doituong;
    }

    public int getDinhmuc() {
        return dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }
    public khachVN(){
        super();
        this.doituong="sinh hoạt";
        this.dinhmuc=20;
    }
    public khachVN(int makh, int soluong, int donggia, String hoten, String ngayhd, String doituong, int dinhmuc)
    {
        super(makh, soluong, donggia, hoten, ngayhd);
        this.doituong=doituong;
        this.dinhmuc=dinhmuc;
    }
    @Override
    public void nhapKH()
    {
        super.nhapKH();
        System.out.println("Nhập đối tượng: sinh hoạt, khinh doanh, sản xuất");
        this.setDoituong(kiemTraDT());
        System.out.println("Nhập định mức:");
        this.setDinhmuc(kiemtraSN());
    }
    public String kiemTraDT()
    {
        String gt=" ";
        do
        {
            gt=input.nextLine();
            if(gt.equalsIgnoreCase("Sinh hoạt")&& gt.equalsIgnoreCase("Kinh doanh")&& gt.equalsIgnoreCase("Sản xuất"))
            {
                System.out.println("Bạn nhập sai đối tượng");
            }
        }while(!gt.equalsIgnoreCase("Kinh doanh")&& !gt.equalsIgnoreCase("Sản xuất")&& !gt.equalsIgnoreCase("Sinh hoạt"));
                return gt;
    }
    public void xuatKH()
    {
        super.xuatkh();
        System.out.println("Đối tượng "+this.getDoituong());
        System.out.println("Định Mức"+this.getDinhmuc());
    }

    @Override
    public double tinhTien() {
        double thanhtien;
        if(this.soluong<=this.getDinhmuc())
        {
            thanhtien=this.soluong*this.dongia;
        }
        else
        {
            thanhtien=this.soluong*this.dongia*this.getDinhmuc()+((this.soluong-this.getDinhmuc())*this.dongia*2.5);
        }
        return thanhtien;
    }

}