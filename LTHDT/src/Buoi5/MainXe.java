package Buoi5;
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
public class MainXe {
   static Scanner input=new Scanner(System.in);
   static int n;
   static int max=1000;
   static Xe[]x=new Xe[max];
    public static void Menu()
    {
        System.out.println("1- Nhap thong tin xe: ");
        System.out.println("2- Xuat thong xe: ");
        System.out.println("3- Tim kiem thong tin xe: ");
        System.out.println("4- Sap xep thong tin xe: ");
        System.out.println("5- Xoa xy lanh xe: ");
        System.out.println("6- Xuat ra gia tri lon nhat: ");
        System.out.println("7- Xuat ra gia tri nho nhat: ");
    }
    // phuong thuc nhap n
    //phuong thuc nhap mang
    //phuong thuc xuat mang
    public static int Nhapn()
    {
         do{
            System.out.println("Nhap so luong xe: ");
            n=input.nextInt();
        }while(n>max||n<=0);
        return n;
    }
    public static void NhapMang()
    {
        for(int i=0;i<n;i++)
        {
            x[i]=new Xe();
            x[i].Nhap();
        }
    }
    public static void XuatMang()
    {
        System.out.println("\t\tDANH SACH XE");
        System.out.printf("%6s %10s\n","Don gia","Xy lanh");
        for(int i=0;i<n;i++)
        {
            x[i].InDanhSX();
        }
    }
     public static void TimKiem()
    {
        System.out.println("Nhap gia xe can tim: ");
        float gia=input.nextFloat();
        boolean kt=false;
        for(int i=0;i<n;i++)
        {
            if(x[i].getDongia()==gia)
            {
                x[i].Xuat();
                kt=true;
            }
        }
        if(kt==false)
        {
            System.out.println("Khong co ten can tim");
        }
    }
    public static void SapXep()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(x[i].tinhThue()>x[j].tinhThue())
                {
                    Xe tmp=x[i];
                    x[i]=x[j];
                    x[i]=tmp;
                }
            }
        }
    }
    public static double TimGTLN()
    {
        double max=x[0].tinhThue();
        for(int i=0;i<n;i++)
        {
            if(x[i].tinhThue()>max)
            {
                max=x[i].tinhThue();
            }
        }
        return max;
    }
    public static void TimMax(double timmax)
    {
        for(int i=0;i<n;i++)
        {
            if(x[i].tinhThue()==timmax)
            {
                x[i].Xuat();
            }
        }
    }
    public static double TimGTNN()
    {
        double min=x[0].tinhThue();
        for(int i=0;i<n;i++)
        {
            if(x[i].tinhThue()<min)
            {
                min=x[i].tinhThue();
            }
        }
        return min;
    }
    public static void TimMin(double timmin)
    {
        for(int i=0;i<n;i++)
        {
            if(x[i].tinhThue()==timmin)
            {
                x[i].Xuat();
            }
        }
    }
    public static int ViTriXoa()
    {
        System.out.println("Nhap xy lanh xe: ");
        float xylanh=input.nextFloat();
        int vitri=-1;
        for(int i=0;i<n;i++)
        {
            if(x[i].getXylanh()==xylanh)
            {
                vitri=i;
            }
        }
        return vitri;
    }
    public static Xe[] XoaXyLanh(int vitrixoa)
    {
        Xe[] tmp=new Xe[n-1];
        int index=0;
        for(int j=0;j<n;j++)
        {
            if(j!=vitrixoa)
            {
                tmp[index]=x[j];
                index++;
            }
        }
        return tmp;
    }
    public static void main(String[] args)
    {
        int chon;
        do
        {
            Menu();
            System.out.println("Moi ban chon");
            chon=input.nextInt();
            switch(chon)
            {
                case 1:
                    n=Nhapn();
                    NhapMang();
                    break;
                case 2:
                    XuatMang();
                    break;
                case 3:
                    TimKiem();
                    break;
                case 4:
                    SapXep();
                    XuatMang();
                    break;
                case 5:
                    int indexxoa=ViTriXoa();
                    if(indexxoa!=-1)
                    {
                        x=XoaXyLanh(indexxoa);
                        n--;
                    }
                    XuatMang();
                    break;
                case 6:
                    double maxxe=TimGTLN();
                    TimMax(maxxe);
                    break;
                case 7:
                    double minxe=TimGTNN();
                    TimMin(minxe);
                    break;
                    
                
            }
            
        }while(chon!=0);
       
               
    }
}