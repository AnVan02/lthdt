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
public class GiaoDichDat extends GiaoDichNhaDat {
    Scanner sc=new Scanner(System.in);
    String loaidat;
    public  GiaoDichDat() {
        super();
        this.loaidat="loại đi mượn";
    }
    
    public  GiaoDichDat(String loaidat, String mgd, String ngaygd, int dongia, int dientich) {
        super(mgd, ngaygd, dongia, dientich);
        this.loaidat=loaidat;
    }
    public void nhapdat() {
        super.nhap();
        System.out.println("Nhập loại đất");
        this.loaidat=sc.nextLine();
    }
    public void xuatdat() {
        super.xuat();
        System.out.println("Loại đất"+this.loaidat);
    }
    
    public float thanhtiendat() {
        return super.thanhtien();
    }
}