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
public class GiaoDichNha extends GiaoDichNhaDat {
      Scanner sc=new Scanner(System.in);
    String loainha,diachi;
    
    public GiaoDichNha() {
        super();
        this.loainha="thường";
        this.diachi="gầm cầu";
    }
    
    public GiaoDichNha(String loainha, String diachi, String mgd, String ngaygd, int dongia, int dientich) {
        super(mgd, ngaygd, dongia, dientich);
        this.loainha=loainha;
        this.diachi=diachi;
    }
    public void nhapnha() {
        super.nhap();
        System.out.println("Nhập loại nhà");
        this.loainha=kiemtra();
        System.out.println("Nhập địa chỉ");
        this.diachi=sc.nextLine();
    }
    public void xuatnha() {
        super.xuat();
        System.out.println("loại nhà"+this.loainha);
        System.out.println("Địa chỉ"+this.diachi);
    }
    public double thanhtiennha() {
        double thanhtiennha=0;
        if(this.loainha.equalsIgnoreCase("thuong"))
        {
            thanhtiennha=super.thanhtien()*0.9;
        }
        else
        {
            thanhtiennha=super.thanhtien();
        }
        return thanhtiennha;
    }
    public String kiemtra() {
        String kt="";
        do{
            kt=sc.nextLine();
            if(!kt.equalsIgnoreCase("cao cap")&&!kt.equalsIgnoreCase("thuong"))
            {
                System.out.println("Đã nhập sai xin nhập lại");
            }
        }while(!kt.equalsIgnoreCase("cao cap")&&!kt.equalsIgnoreCase("thuong"));
        return kt;
    }
}


