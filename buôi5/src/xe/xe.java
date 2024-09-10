
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xe;





import java.util.Scanner;





/**
 *
 * @author B402
 */
public class Xe {​​​​​​​
    Scanner input=new Scanner(System.in);
    int masoch;
    String tentx;
    int soxe;
    float doanhthu;
    public Xe()
    {​​​​​​​
        this.masoch=1;
        this.tentx="A";
        this.soxe=123;
        this.doanhthu=1;
    }​​​​​​​
    public Xe(int masoch, String tentx, int soxe, float doanhthu)
    {​​​​​​​
        this.masoch=masoch;
        this.tentx=tentx;
        this.soxe=soxe;
        this.doanhthu=doanhthu;
    }​​​​​​​
    public void nhapxe()
    {​​​​​​​
        System.out.println("Nhap ma so xe");
        this.masoch=input.nextInt();
        System.out.println("Nhap ho ten tai xe");
        input.nextLine();
        this.tentx=input.nextLine();
        System.out.println("nhap so xe");
        this.soxe=input.nextInt();
        System.out.println("nhap doanh thu");
        this.doanhthu=input.nextFloat();
    }​​​​​​​
    public void xuatXe()
    {​​​​​​​
        System.out.println("ma so xe:"+this.masoch);
        System.out.println("ten tai xe: "+this.tentx);
        System.out.println("so xe: "+this.soxe);
        System.out.println("doanh thu: "+this.doanhthu);
    }​​​​​​​
    
}​​​​​​​






