/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xe;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Xe {
    Scanner input=new Scanner(System.in);
    int masoch;
    String tentx;
    int soxe;
    float doanhthu;
    /// ham tao
    public Xe()
    {
        this.masoch=1;
        this.tentx="A";
        this.soxe=123;
        this.doanhthu=0;
    }
     public Xe(int masoch, String tentx, int soxe, float doanhthu)
     {
         this.masoch=masoch;
         this.tentx=tentx;
         this.soxe=soxe;
         this.doanhthu=doanhthu;
     }
     public void nhapXe()
     {
         System.out.println("Nhap ma so xe: ");
         this.masoch=input.nextInt();
         System.out.println("Nhap ho ten tai xe: ");
         input.nextLine();
         this.tentx=input.nextLine();
         System.out.println("nhap so xe: ");
         this.soxe=input.nextInt();
         System.out.println("nhap doanh thu: ");
         this.doanhthu=input.nextFloat();
         
     }
     public void xuatXe()
     {
         System.out.println("Ma so xe: "+this.masoch);
         System.out.println("Ten tai xe: "+this.tentx);
         System.out.println("So xe: "+this.soxe);
         System.out.println("Doanh thu: "+this.doanhthu);
         
     }
    }
    

