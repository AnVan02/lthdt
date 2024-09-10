 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buôi5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class MainXe {​​​​​​​
    static Scanner input=new Scanner(System.in);
    static List<Xe> list=new ArrayList<>();
    static int n,m ;
    public static void Menu()
    {​​​​​​​
        System.out.println("1-Nhaap xe ngoai thanh: ");
        System.out.println("2-Nhap xe noi thanh");
        System.out.println("3-Xuat tat ca xe");
        System.out.println("4-Xuat xe ngoai thanh");
        System.out.println("5-Xuat xe noi thanh");
        System.out.println("6-Tinh tong doanh thu cho tung loai xe");
        System.out.println("7-Tim ten tai xe cua xe noi thanh");
        System.out.println("8-Sap xep doanh thu xe ngoai thanh");
        System.out.println("0-Thoát chương trình");
    }​​​​​​​
    public static int nhapGT()
    {​​​​​​​
        int gt;
        gt=input.nextInt();
        return gt;
    }​​​​​​​
    public static void nhapXNTh()
    {​​​​​​​
        for(int i=0;i<n;i++)
        {​​​​​​​
            XeNgoaiThanh th=new XeNgoaiThanh();
            th.nhapNgT();
            list.add(th);
        }​​​​​​​
    }​​​​​​​
    public static void nhapXNoiTh()
    {​​​​​​​
        XeNT nh=new XeNT();
        nh.nhapNT();
        list.add(nh);
    }​​​​​​​
    public static void tatcaxe()
    {​​​​​​​
        for(Xe i:list)
        {​​​​​​​
            i.xuatXe();
        }​​​​​​​
    }​​​​​​​
    public static void xuatXeNTh()
    {​​​​​​​
        for(Xe i:list)
        {​​​​​​​
            if(i instanceof XeNgoaiThanh)
            {​​​​​​​
                ((XeNgoaiThanh) i).xuatNgT();
            }​​​​​​​
        }​​​​​​​
    }​​​​​​​
    public static void xuatXeNT()
    {​​​​​​​
        for(Xe i:list)
        {​​​​​​​
            if(i instanceof XeNT)
            {​​​​​​​
                ((XeNT) i).xuatNT();
            }​​​​​​​
        }​​​​​​​
    }​​​​​​​
    public static void tongDT()
    {​​​​​​​
        float tongnt=0;
        float tongnth=0;
        for(Xe i:list)
        {​​​​​​​
            if(i instanceof XeNT)
            {​​​​​​​
                tongnt=((XeNT) i).doanhthu+tongnt;
            }​​​​​​​
            else
            {​​​​​​​
                tongnth=i.doanhthu;
            }​​​​​​​
        }​​​​​​​
        System.out.println("Tong doanh thu xe noi thanh "+tongnt);
        System.out.println("Tong doanh thu xe ngoai thanh "+tongnth);
    }​​​​​​​
    public static void timtenTX()
            
    {​​​​​​​
        System.out.println("nhap ten tai xe can tim");
        input.nextLine();
        String tenct=input.nextLine();
        boolean kt=false;
        for(Xe i:list)
        {​​​​​​​
            if(i instanceof XeNT && i.tentx.equalsIgnoreCase(tenct))
            {​​​​​​​
                i.xuatXe();
                kt=true;
            }​​​​​​​
        }​​​​​​​
        if(kt=false)
        {​​​​​​​
            System.out.println("khong co ten can tim");
        }​​​​​​​
    }​​​​​​​
    public static void main(String[] args){​​​​​​​
        int chon;
        do
        {​​​​​​​
            Menu();
            System.out.println("Moi ban chon");
            chon=input.nextInt();
            switch(chon)
            {​​​​​​​
                case 1:
                    System.out.println("Nhap xe ngoai thanh");
                    System.out.println("Nhap so luong xe ngoai thanh");
                    n=nhapGT();
                    nhapXNTh();
                    break;
                case 2:
                    System.out.println("Nhap xe noi thanh");
                    System.out.println("Nhap so luong xe noi thanh");
                    m=nhapGT();
                    nhapXNoiTh();
                    break;
                case 3:
                    tatcaxe();
                    break;
                case 4:
                    xuatXeNTh();
                    break;
                case 5:
                    xuatXeNT();
                    break;
                case 6:
                    tongDT();
                    break;
                case 7:
                    timtenTX();
                    break;
                case 8:
                    
                    break;
                    default:
                        System.out.println("Nhap so tu 1-8");
                     break;   
            }​​​​​​​
        }​​​​​​​while(chon!=0);
    }​​​​​​​}​​​​​​​


​[4:55 PM] Nguyen Vo Khanh Duy
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Xe;


/**
 *
 * @author user
 */
public class XeNT extends Xe {​​​​​​​
    String sotuyen;
    float sokm;
    public XeNT()
    {​​​​​​​
        super();
        this.sotuyen="Quan Go Vap- Quan 10";
        this.sokm=1;
    }​​​​​​​
    public XeNT(int masoch, String tentx, int soxe, float doanhthu, String sotuyen, float sokm)
    {​​​​​​​
        super(masoch, tentx, soxe, doanhthu);
        this.sotuyen=sotuyen;
        this.sokm=sokm;
    }​​​​​​​
    public void nhapNT()
    {​​​​​​​
        super.nhapxe();
        System.out.println("Nhap so tuyen");
        input.nextLine();
        this.sotuyen=input.nextLine();
        System.out.println("Nhap so km");
        this.sokm=input.nextFloat();
    }​​​​​​​
    public void xuatNT()
    {​​​​​​​
        super.xuatXe();
        System.out.println("So tuyen "+this.sotuyen);
        System.out.println("So km "+this.sokm);
    }​​​​​​​
    
}​​​​​​​
 



