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
public class hoadontheongay extends hoadon 
    {

        public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

    private int songay;
    Scanner sc=new Scanner(System.in);
    public hoadontheongay()
    {
        super();
        this.setSongay(songay);
    } 

    public hoadontheongay(int songay, int mahd, int dongia, String hoten, String doituong, String ngayhd) {
        super();
        this.songay = songay;
    }

    @Override
    public void nhap() 
    {
        super.nhap(); 
        System.out.println("mời bạn nhập số ngày");
        this.setSongay(sc.nextInt());
    }

    @Override
    public void xuat() 
    {
        super.xuat(); 
        System.out.println(" số ngày là"+this.getSongay());
    }

    @Override
    public float thanhtien() 
    {
       float thanhtien;
       if(this.getSongay()<=7)
       {
           return thanhtien=this.getSongay()*this.dongia;
       }
       else
               {
                   return thanhtien=(float)(7*this.dongia+(this.getSongay()-7)*(this.dongia*0.2));
               }
    }
}
    

