
package quantrinhansu;

import java.util.Scanner;



/**
 *
 * @author ACER
 */
public abstract class khachhang {
    Scanner input=new Scanner(System.in);
    protected int makh,soluong,dongia;
    public String hoten,ngayhd;
    //ham tao co doi so
    public khachhang()
    {
        
    }

    public khachhang(int makh, int soluong, int dongia, String hoten, String ngayhd) {
        this.makh = makh;
        this.soluong = soluong;
        this.dongia = dongia;
        this.hoten = hoten;
        this.ngayhd = ngayhd;
    }


        public void nhapKH()
        {
            System.out.println("nhap ma so: ");
            this.makh=input.nextInt();
            System.out.println("nhap ho ten: ");
            input.nextLine();
            this.hoten=input.nextLine();
            System.out.println("nhap ngay thang nam: ");
            this.ngayhd=input.nextLine();
        }
 // viet ham kiem tra so nguyen 
        public int kiemtraSN()
        {
            int n=0;
            boolean isvalue=false;
            while(isvalue)
            {
                try{
                    n=input.nextInt();
                    isvalue=true;
                }catch(Exception e){
                    System.out.println("ban nhap sai,phai nhap so!!");
                    input.nextLine();

            }
               }
               return n;
        }
    
        public void xuatKH()
        {
            System.out.println("Ma kh:"+this.makh);  
            System.out.println("ho ten:"+this.hoten); 
            System.out.println("ngay hoa don:"+this.ngayhd);
            System.out.println("so luong:"+this.soluong);
            System.out.println("Don gia:"+this.dongia);
        }
        public abstract double tinhTien();

    public void xuatkh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double tinhtien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
   }
        
            

