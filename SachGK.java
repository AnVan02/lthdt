/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SachGK extends Sach{

    public String getLoaisach() {
        return loaisach;
    }

    public void setLoaisach(String loaisach) {
        this.loaisach = loaisach;
    }
    private String loaisach;

    public SachGK() {
        super();
        this.setLoaisach("PVH");
    }

    public SachGK(String loaisach, String masach, String ngayxb, int dongia, int soluong) {
        super(masach, ngayxb, dongia, soluong);
        this.setLoaisach(loaisach);
    }
    @Override
    public void nhap()
    {
        super.nhap();
        System.out.println("loai sach: ");
        sc.nextLine();
        this.setLoaisach(sc.nextLine());
    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("loai sach: "+this.getLoaisach());
    }
    @Override
    public float tien()
    {
        float tien;
        return tien=this.soluong*this.dongia;
    }

    
}
