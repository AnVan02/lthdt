/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhansu;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Nguoi {
    Scanner input=new Scanner (System.in);
    String Hoten;
    int MaSo;
  public Nguoi()
   {
        
      this.Hoten="AN";
      this.MaSo=0;
      
   }
  public Nguoi(String HoTen, int MaSo)
  {
      this.Hoten=HoTen;
      this.MaSo=MaSo;
  }

  
    public void NhapNguoi ()
   {
       
       System.out.println("Nhap ho ten: ");
       this.Hoten=input.nextLine();
       System.out.println("Nhap ma so: ");
       this.MaSo=input.nextInt();
   
   }
     public void XuatNguoi()
     {
         System.out.println("Nhap ho ten"+this.Hoten);
         System.out.println("Nhap ma so"+this.MaSo);
     }
  
    }




