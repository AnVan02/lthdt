
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B402
 */
public  class Nguoi {
    Scanner input=new Scanner(System.in);
    int maso;
    String hoten;

    //ham tao ko doi so
    public Nguoi() {
        this.maso=1;
        this.hoten="ABC";
             
    }
    //ham tao co doi so
    public Nguoi(int maso, String hoten)
    {
   this.maso=maso;
   this.hoten=hoten;
  
    }
    public void NhapNguoi()
    {
        System.out.println("Nhập mã số: ");
        this.maso=input.nextInt();
        System.out.println("Nhập tên");
        this.hoten=input.nextLine();
      
    }
    public void XuatNguoi()
    {
        System.out.println("Xuất mã số"+this.maso);
        System.out.println("Xuất tên"+this.hoten);
       
    }
    public float tinhLuong()
    {
        return 0;
    }
    
}
