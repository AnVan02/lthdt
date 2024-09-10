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
public abstract class khachhang {
    Scanner input=new Scanner(System.in);
    protected int makh,soluong,dongia;
    protected String hoten,ngayhd;
    
    public khachhang()
    {
        this.makh=0;
        this.hoten="duy";
        this.ngayhd="01/01/2002";
        this.soluong=0;
        
    }
    public khachhang(int makh, int soluong, int donggia, String hoten, String ngayhd)
    {
        this.makh=makh;
        this.dongia=donggia;
        this.hoten=hoten;
        this.soluong=soluong;
        this.ngayhd=ngayhd;
    } 
    public void nhapKH()
    {
        System.out.println("Nhập mã số: ");
        this.makh=input.nextInt();
        System.out.println("Nhập họ tên:    ");
        input.nextLine();
        this.hoten=input.nextLine();
        System.out.println("Nhập ngày tháng năm:    ");
        this.ngayhd=input.nextLine();
        
    }
    public int kiemtraSN()
    {
        int n=0;
        boolean isvalue=false;
        while(!isvalue)
        {
            try {
                n=input.nextInt();
                isvalue=true;
            } catch (Exception e) {
                System.out.println("bạn nhập sai, nhập số!!");
                input.nextLine();   
            }
        }
        return n;
    }
    public void xuatkh()
    {
        System.out.println("Mã KH"+this.makh);
        System.out.println("Họ tên"+this.hoten);
        System.out.println("Ngày HD"+this.ngayhd);
        System.out.println("Số Lượng"+this.soluong);
        System.out.println("Đơn Gía"+this.dongia);
    }
    public abstract double tinhTien();

    double tinhtien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


