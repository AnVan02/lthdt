/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buôi5;

 

/**
 *
 * @author user
 */
public class XeNgoaiThanh extends Xe{
    String noiden;
    int songaydi;
    public XeNgoaiThanh()
    {
        super();
        this.noiden="Nha Trang";
        this.songaydi=3;
    }
    public XeNgoaiThanh(int masoch, String tentx, int soxe, float doanhthu, String noiden, int songaydi)
    {
        super(masoch, tentx, soxe, doanhthu);
        this.noiden=noiden;
        this.songaydi=songaydi;
    }
    public void nhapNgT()
    {
        super.nhapxe();
        System.out.println("Nhap noi den");
        input.nextLine();
        this.noiden=input.nextLine();
        System.out.println("Nhap so ngay di");
        this.songaydi=input.nextInt();
    }
    public void xuatNgT()
    {
        super.xuatXe();
        System.out.println("Noi den "+this.noiden);
        System.out.println("So ngay di "+this.songaydi);
    }
}
 