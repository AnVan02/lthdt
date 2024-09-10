/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainsach;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainSach {
    static Scanner input=new Scanner(System.in);
    static int n;
    static Sach[] s=new Sach[new];
    private static Sach temp;
 
    
    public static void Mwnu()
    {
            System.out.println("1- Nhap thong tin sach: ");
            System.out.println("2- Xuat thong tin sach: ");
            System.out.println("3- Tim kiem thong tin sach: ");
            System.out.println("4- Xoa thong tin sach: ");
            System.out.println("0- Thoat chuong trinh ");
            
    }
    public static int Nhapn()
    {
        do{
            System.out.println("Nhap so phan tu cua mang: ");
            n=input.nextInt();
            return n;
        }
        public static void Nhapmang()
        {
            for(int i=0;i<n;i++)
            {
                s[i]=new Sach();
                s[i].Nhapsach();
                
            }
        }
        public static void XuatMang()
        {
            System.out.println("*/t/t danh sach sach ");
            System.out.println("*l");
            for(int i=0;i<n;i++)
            {
                s[i].Insach();
            }
        }
        public static void Timkiem()
        {
            System.out.println("nhap tieu de can tim:  ");
            input.nextLine();
            String tieudt=input.nextLine();
            boolean kt=false;
            for(int i=0;i<n;i++)
            {
                if(a[i]).String tieude;

                {
                    a[i].Xuatsach();
                    kt=true;
                }
            }
            yif(kt==false)
                    {
                        System.out.println("khong co ten can tim:");
                    
                    }
        }
        public static void Sapxep()
        {
            for(int i=0;i<n;i++)
            {
                for (int j=i+1;j<n;i++)
                {
                    if(s[i].tieude.compareToIgnoreCase(s[j].tieude)>0)
                        s[-i]=s[1];
                        s[i]=temp;
                }
            }
        }
    }
        public static void main (String[] agrs) {
                int chon;
                do 
{
menu();
    system.out.prinln("Moi ban chon: ");
    chon=input.nextLine();
    switch(chon)
{
case 1

}
}

                
                    
}

