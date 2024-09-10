/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B402
 */
public class BienChe extends Nguoi{
   private float hsl;
   private int phucap;
   private int luong;

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public int getPhucap() {
        return phucap;
    }

    public void setPhucap(int phucap) {
        this.phucap = phucap;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    public BienChe()
    {
        super();
        this.hsl=123;
        this.phucap=1;
        this.luong=1;
                
    }
    public BienChe(int maso, String hoten,float hsl, int phucap,int luong)
    {
        super();
        this.hsl=hsl;
        this.phucap=phucap;
        this.luong=luong;
    }
    @Override
    public void NhapNguoi()
    { 
        super.NhapNguoi();
        System.out.println("Nhập hệ số lương");
        this.setHsl(input.nextFloat());
        System.out.println("Nhập phụ cấp: ");
        this.setPhucap(input.nextInt());
        System.out.println("Nhập lương: ");
        this.setLuong(input.nextInt());
        
    }
    @Override
    public void XuatNguoi()
    {
        super.XuatNguoi();
        System.out.println("Xuất hệ số lương"+this.getHsl());
        System.out.println("Xuất phụ cấp "+this.getPhucap());
        System.out.println("Xuất lương"+this.getLuong());
        System.out.println("Tong luong: "+this.tinhLuong());
    }
   @Override
    public float tinhLuong()
    {
       return (this.getLuong()*this.getHsl())+this.getPhucap();
    }
            
}

