/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class sach {
    String masach,ngay;
    int dongia , soluong;
    Scanner sc=new Scanner(System.in);
    public sach(){
        this.dongia=6;
        this.ngay="2/10/2002";
        this.soluong=10;
        this.masach="An";
    }
    public sach(String  masach, String ngay, int dongia,int soluong){
        System.out.println("Moi ban nhap ma sach");
        this.dongia=dongia;
        this.ngay=ngay;
        this.masach=masach;
        this.soluong=soluong;
    }

   
    public void nhapsach() 
    {
        System.out.println("Moi ban nhap ma sach");
        this.masach=nextInt();
        System.out.println("Moi ban nhap ngay xuat ban");
        this.ngay=nextInt();
        System.out.println("Moi ban nhap don gia");
        this.dongia = sc.nextInt();
        System.out.println("Moi ban nhap so luong");
        this.soluong=sc.nextInt();
    }
    public void xuatsach()
    {
        System.out.println("Masach"+this.masach);
        System.out.println("Xuatban"+this.ngay);
        System.out.println("dongia"+this.dongia);
        System.out.println("soluong"+this.soluong);
    }

    private String nextInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            

    

}

    

