/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtragiuaki;

 

import java.util.Scanner;
/**
 *
 * 
 */
public abstract class hoadon {
    Scanner sc=new Scanner(System.in);
    protected int mahd;
    protected String ngayhd;
    protected String tenkh;
    protected int maphong;
    protected float dongia;
    protected String doituong;
    public hoadon()
    {
        this.mahd=0;
        this.ngayhd="2/10/2002";
        this.tenkh="HoaiAn";
        this.maphong=0;
        this.dongia=120;
        this.doituong="Khach Vip";
    }

 

    public hoadon(int mahd, String ngayhd, String tenkh, int maphong, float dongia, String doituong) {
        this.mahd = mahd;
        this.ngayhd = ngayhd;
        this.tenkh = tenkh;
        this.maphong = maphong;
        this.dongia = dongia;
        this.doituong = doituong;
    }
    public void nhap()
    {
        System.out.println("ma hd: ");
        this.mahd=sc.nextInt();
        System.out.println("ngay hd: ");
        sc.nextLine();
        this.ngayhd=sc.nextLine();
        System.out.println("ten kh: ");
        this.tenkh=sc.nextLine();
        System.out.println("ma phong: ");
        this.maphong=sc.nextInt();
        System.out.println("don gia: ");
        this.dongia=sc.nextFloat();
        System.out.println("doi tuong: ");
        sc.nextLine();
        this.doituong=sc.nextLine();
    }
    public void xuat()
    {
        System.out.println("ma hd: "+this.mahd);
        System.out.println("ngay hd: "+this.ngayhd);
        System.out.println("ten kh: "+this.tenkh);
        System.out.println("ma phong: "+this.maphong);
        System.out.println("don gia: "+this.dongia);
        System.out.println("doi tuong: "+this.doituong);
    }

    public  float thanhtien(){
    
    return 0;

    
    }

}