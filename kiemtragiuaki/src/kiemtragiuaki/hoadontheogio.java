/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtragiuaki;

import java.util.Scanner;

/**
 *
 * @author B402
 */
public class hoadontheogio extends hoadon {
    private int sogio ;
    public int getSogio() {
        return sogio;
    }

    public void setSogio(int sogio) {
        this.sogio = sogio;
    }
    public hoadontheogio()
    {
        super();
        this.setSogio(sogio);
    }   
    Scanner sc= new Scanner(System.in);

    public hoadontheogio(int sogio, int mahd, int dongia, String hoten, String doituong, String ngayhd) {
        super();
        this.sogio = sogio;
    }

    @Override
    public void nhap() 
    {
        super.nhap();
        System.out.println("mời bạn nhập số giờ");
        this.setSogio(sc.nextInt());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("số giờ là"+this.getSogio());
        
    }

    @Override
    public float thanhtien() 
    {
        float thanhtien;
        if(this.getSogio()<=24)
        {
            return thanhtien=this.getSogio()*this.dongia;
        }
        else if(this.getSogio()>24 && this.getSogio()<30)
        {
            return thanhtien=this.getSogio()*24;
        }
        return thanhtien();
    }

    
    
    
}
