/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.buoi4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class mainsach {
    static Scanner sc=new Scanner(System.in);
    static int max=1000;
    static int n;
    static sach[] s=new sach[max];
    public static void menu()
    {
        System.out.println("1-nhap thong tin sach");
        System.out.println("2-xuat thong tin sach");
        System.out.println("3-tim kiem thong tin sach");
        System.out.println("4-sap xep danh sach");
        System.out.println("5-xoa thong tin");
        System.out.println("0-thoat chuong trinh");
    }
    public static int nhapn()
    {
        do{
            System.out.println("moi ban nhap phan tu cua mang");
            n=sc.nextInt();
        }while(n>max||n<0);
        return n;
    }
    public static void nhaptt()
    {
         for(int i=0;i<n;i++)
          {
            s[i]=new sach();
            s[i].nhap();
          }
    }
    public static void xuatmang()
    {
        System.out.println("\t\tdanh sach sach");
                    for(int i=0;i<n;i++)
                    {
                        s[i].Insach();
                    }
    }
    public static void timkiem()
    {
        System.out.println("nhap vao ten can tim");
        sc.nextLine();
        String tendt=sc.nextLine();
        for(int i=0;i<n;i++)
        {
            if(s[i].tieude.equalsIgnoreCase(tendt))
            {
                s[i].xuat();
            }
        }
    }
    public static void sapxep()
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s[i].tieude.compareToIgnoreCase(s[j].tieude)>0)
                {
                    sach temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
    }
    public static int vitricanxoa()
    {
         System.out.println("nhap vao tieu de can xoa");
         sc.nextLine();
         String tenxoa=sc.nextLine();
         int vitri=-1;
         for(int i=0;i<n;i++)
         {
             if(s[i].tieude.equalsIgnoreCase(tenxoa))
             {
                 vitri=i;
             }
         }return vitri;
    }
    public static sach[] xoatieude(int vitricanxoa)
    {
        sach[] tmp=new sach[n-1];
        int index=0;
        for(int j=0;j<n;j++)
        {
            if(j!=vitricanxoa)
            {
                tmp[index]=s[j];
            }
        }
        return tmp;
    }
    public static void main(String[] args) {
        int chon;
        do
        {
            menu();
            System.out.println("moi ban chon");
            chon=sc.nextInt();
            
            switch(chon)
            {
                case 1:
                   n=nhapn();
                   nhaptt();
                   break;
                case 2:
                    xuatmang();
                    break;
                case 3:
                    timkiem();
                    break;
                case 4:
                    sapxep();
                    xuatmang();
                    break;
                case 5:
                    int indexxoa=vitricanxoa();
                    if(indexxoa!=-1)
                    {
                        s=xoatieude(indexxoa);
                    }
                    xuatmang();
                    break;
            }
            
        }while(chon!=0);
    }
}
