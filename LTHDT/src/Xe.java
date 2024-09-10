
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public final class Xe {
    Scanner input=new Scanner (System.in);
private float donggia;
private int xylanh;

    public float getDonggia() {
        return donggia;
    }

    public void setDonggia(float donggia) {
        this.donggia = donggia;
    }

    public int getXylanh() {
        return xylanh;
    }

    public void setXylanh(int xylanh) {
        this.xylanh = xylanh;
    }
    private int Xylanh;
    // ham tao
public Xe()
{
    this.setDonggia(0);
    this.setXylanh(100);
    
}
public Xe(float Dongia, int xylanh)
{
    this.setDonggia(donggia);
    this.setXylanh(xylanh);
}
public void Nhap()
{
    System.out.println("Nhap don gia: ");
    this.setDonggia(input.nextFloat());
    System.out.println("Nhap Xylanh: ");
    this.setXylanh(input.nextByte());
    
}
public void Xuat ()
{
    System.out.println("Don gia:"+this.getDonggia());
    System.out.println("Xylanh:"+this.getXylanh());
    System.out.println("Tong tien thue: "+this.tinhthue());
}
public double tinhthue()
{
    double  tongtien;
    if(this.getXylanh()<100)
    {
       tongtien= this.getDonggia()+this.getDonggia()*0.01;
    }
    else if(this.getXylanh()>=100|| this.getXylanh()<200)
    {
       tongtien= this.getDonggia()+this.getDonggia()*0.03;
    }
    else
    {
        tongtien= this.getDonggia()+this.getDonggia()*0.05;
    }
    return tongtien;
    
   
} 

    void InDanhSX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

