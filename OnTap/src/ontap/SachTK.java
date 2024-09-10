
package ontap;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class SachTK {
    protected String loaisach;
    float thue;
    Scanner sc=new Scanner(System.in);
    public SachTK()
    {
        super();
        this.loaisach=loaisach;
        this.thue=thue;
    }
public SachTK(String masach, String ngayxb, int dongia, int soluong, String loaisach, float thue)
    {​​​​​​​
        super(masach, ngayxb, dongia, soluong);
        this.loaisach=loaisach;
        this.thue=thue;
    }​​​​​​​
    public void nhapSachTK()
    {​​​​​​​
        super.nhapsach();
        System.out.println("Mời bạn nhập loại sách");
        this.loaisach=sc.nextLine();
        System.out.println("Mời bạn nhập thuế");
        this.thue=sc.nextFloat();
    }​​​​​​​
    public void xuatSachTK()
    {​​​​​​​
        super.xuatsach();
        System.out.println("Loại sách"+this.loaisach);
        System.out.println("Thuế"+this.thue);
    }​​​​​​​
    public float thanhtien()
    {​​​​​​​
        float tongtien=0;
        if(this.loaisach.equalsIgnoreCase("Việt Nam"))
        {​​​​​​​
            tongtien=this.dongia*this.soluong;
        }​​​​​​​
        else
        {​​​​​​​
            tongtien=(this.dongia*this.soluong)+(this.thue*this.dongia);
        }​​​​​​​
        return tongtien;
    }​​​​​​​
}​​​​​​​
 

    
        
    
}
