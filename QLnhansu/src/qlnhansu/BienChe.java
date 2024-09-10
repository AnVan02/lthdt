/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhansu;

/**
 *
 * @author ACER
 */
public class BienChe extends Nguoi{
    int HeSoLuong;
    float TienPhuCapCV;
    float Luong;
    private float luong;
    private String TinhLuong;

    public int getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(int HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public float getTienPhuCapCV() {
        return TienPhuCapCV;
    }

    public void setTienPhuCapCV(float TienPhuCapCV) {
        this.TienPhuCapCV = TienPhuCapCV;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }
   public BienChe()
   {
       
       this.getHeSoLuong();
       this.getTienPhuCapCV();
       this.getLuong();
   }
   public BienChe(String HoTen, int MaSo, int HeSoLuong, float TienPhuCapCV, float Luong)
   {
       super(HoTen, MaSo);
       this.HeSoLuong=HeSoLuong;
       this.TienPhuCapCV=TienPhuCapCV;
       this.Luong=luong;
   }
   
   public void NhapNguoi()
   {
       System.out.println("He So Luong");
       this.setHeSoLuong(HeSoLuong);
       System.out.println("Tien Phu Cap");
       this.setTienPhuCapCV(TienPhuCapCV);
       System.out.println("Luong");
       this.setLuong(Luong);
       
   }
   public void XuatNguoi()
   {
       System.out.println("He So Luong"+this+ HeSoLuong);
       System.out.println("Tien Phu Cap Chuc Vu"+this+TienPhuCapCV);
       System.out.println("Luong"+this+Luong);
       System.out.println("Tinh luong"+this+TinhLuong);
       
   }
   public float TinhLuong()
    {
       return(this.getLuong()*this.getHeSoLuong()+this.getTienPhuCapCV()); 
    }

 

    void NhapBienChe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
  
}
    
