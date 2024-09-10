/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SachTK extends Sach{

    public float getThue() {
        return thue;
    }

    public void setThue(float thue) {
        this.thue = thue;
    }

    public String getLoaisach() {
        return loaisach;
    }

    public void setLoaisach(String loaisach) {
        this.loaisach = loaisach;
    }
    private float thue;
    private String loaisach;

    public SachTK() {
        super();
        this.setThue(0);
        this.setLoaisach("VN");
    }

    public SachTK(float thue, String loaisach, String masach, String ngayxb, int dongia, int soluong) {
        super(masach, ngayxb, dongia, soluong);
        this.setThue(thue);
        this.setLoaisach(loaisach);
    }
    @Override
    public void nhap()
    {
        super.nhap();
        System.out.println("thue: ");
        this.setThue(sc.nextInt());
        System.out.println("loai sach: ");
        sc.nextLine();
        this.setLoaisach(sc.nextLine());
    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("thue: "+this.getThue());
        System.out.println("loai sach: "+this.getLoaisach());
    }
    @Override
    public float tien()
    {
        float tien;
        if(this.getLoaisach().equalsIgnoreCase("VN"))
        {
            return tien=this.soluong*this.dongia;
        }
        else
        {
            return tien=this.soluong*this.dongia+this.getThue()*this.dongia;
        }
    }

  
    
    
    
}
