/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.sach;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class BaiSach {
    // thuoc trinh 
    Scanner input=new Scanner(System.in);
    String tieude,tacgia;
    // ham tao 
    // ham tao nao dinh hay ham tao
    void BaiSach()
    {
        this.tieude="lthdt";
        this.tacgia="an";
    }
    // ham tao co doi so
    public BaiSach(String tieude, String tacgia )
    {
        this.tieude=tieude;
        
    }
    // phuong thuc nhap 
    public void Nhapsach()
    {
        System.out.println("Nhap tieu de: ");
        this.tieude=input.nextLine();
        System.out.println("Nhap tac gia: ");
        this.tacgia=input.nextLine();
        
    }
        // phuong thuc xuat 
    public void Xuatsach()
    {
        System.out.println("tieu de: "+this.tieude);
        System.out.println("tac gia: "+this.tacgia);
    }
    // tostring 
    public String toString()
    {
        String xuat="tieu de: "+this.tieude+"/nTac gia: "+this.tacgia;
        return xuat;
        
    }
    // in theo dinh dang format
    public void Insach()
    {
        System.out.printf("%$s $10s/n",this.tieude,this.tacgia);
        
    }
    public class MainSach{

        private static void menu() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        public void Menu()
        {
            System.out.println("1- Nhap thong tin sach: ");
            System.out.println("2- Xuat thong tin sach: ");
            System.out.println("3- Tim kiem thong tin sach: ");
            System.out.println("4- Xoa thong tin sach: ");
            System.out.println("5- Thoat chuong trinh ");
            
        }
                public static void main(String[] args) {
        {
            int chon;
            do 
            {
                 menu();
                    System.out.println("Moi ban chon: ");
                chon=input.nextInt();
                switch(chon)
                {
                    case 1:
                        do{
                       System.out.println("nhap so phan tu cua mang: ");
                     int n = input.nextInt();
                        }while(n>max n<0);
                        for(int i=0;i<n;i++)
                        {
                            s[i]=new sach();
                            s[j].nhapsach();
                        }
                } 
   
            }while (chon!=0);
       
        }
                }
                }
                

    public static void Timkiem()
    {
        System.out.println("Nhap vao tieu de can tim: ");
        input.nextInt();
        String tiendt=input.nextLine();
        int n = 0;
        for(int i=0;i<n;i++)
        {
            if(s[i].tieude.equalsIqnoreCase(tieude))
            {
                s[i].Xuatsach();
                kt=true;
            }
        }
        if(kt=true);
        {
            System.out.println("Khong co ten can tim");
                    }
    }    
    public static void Sapxep()
    {
        for(int i=0;i<n;i++)
        {
            if(s[i].tieude.compareToIgnoreCase(s[i+1].tieude)>0)
            {
                sach temp=s[1];
                s[1]=s[1];
                s[2]=s[2];
            }
            
            }
        }
    }
    public static int VitriCanxoa() 

          

}
            