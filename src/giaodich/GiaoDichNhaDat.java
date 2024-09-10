/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodich;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class GiaoDichNhaDat {
    Scanner sc=new Scanner(System.in);
    String mgd,ngaygd;
    int dongia,dientich;
    
    public GiaoDichNhaDat() {
        this.mgd="2";
        this.ngaygd="02/10/2020";
        this.dongia=0;
        this.dientich=0;
    }
    
    public GiaoDichNhaDat(String mgd, String ngaygd, int dongia, int dientich) {
        this.mgd=mgd;
        this.ngaygd=ngaygd;
        this.dongia=dongia;
        this.dientich=dientich;
    }
    
    public void nhap()
    {
        System.out.println("Nhập mã giao dịch");
        this.mgd=sc.nextLine();
        System.out.println("Nhập ngày giao dịch");
        this.ngaygd=sc.nextLine();
        System.out.println("Nhập đơn giá");
        this.dongia=sc.nextInt();
        System.out.println("Nhập diện tích");
        this.dientich=sc.nextInt();
    }
    public void xuat()
    {
        System.out.println("Mã giao dịch"+this.mgd);
        System.out.println("Ngày giao dịch"+this.ngaygd);
        System.out.println("Đơn giá"+this.dongia);
        System.out.println("Diện tích"+this.dientich);
    }
    public float thanhtien() {
        float thanhtien=0;
        return thanhtien=this.dientich*this.dongia;
    }
}
