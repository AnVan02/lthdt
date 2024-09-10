/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtragiuaki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author B402
 */
public class Mainhoadon {
    {
}
    static Scanner sc=new Scanner(System.in);
    static int n;
    static List<hoadon> list= new ArrayList<>();
    static List<hoadontheogio> listgio= new ArrayList<>();
    static List<hoadontheongay> listngay= new ArrayList<>();
    public static void menu()
    {
        System.out.println("1: nhập hóa dơn theo giờ: ");
        System.out.println("2: nhập hóa đơn theo ngày: ");
        System.out.println("3: xuất tất cả hóa dơn: ");
        System.out.println("4: xuất hóa dơn theo giờ: ");
        System.out.println("5: xuất hóa đơn theo giờ: ");
        System.out.println("6: tính tổng số lương cho thuê từng phong");
        System.out.println("7: sap xep giam dan thoe so gio thue phong thoe gio: ");
        System.out.println("8: tinh trung bình thành tiền hóa đơn thuê phòng trong năm 2013");
        System.out.println("9: tìm khách hàng thuê phòng theo ngày có thành tiền lớn thu phí nhưng không phải là khách thường");
        System.out.println("10: thoát ");
    }
    public static void nhaphdgio()
    {
        System.out.println("nhập số giờ ");
        n=sc.nextInt();
        for(int i=0; i<n;i++)
        {
            hoadontheogio gio=new hoadontheogio();
            gio.nhap();
            list.add(gio);
        }
    }
    public static void nhaphdngay()
    {
        System.out.println(" nhập số ngày");
        n=sc.nextInt();
        for(int i=0;i<n;i++);
        {
            hoadontheongay ngay=new hoadontheongay();
            ngay.nhap();
            list.add(ngay);
        }
    }
     public static void xuatfullhd()
     {
        for(hoadon i:list)
        {
            if(i instanceof hoadon)
            {
                i.xuat();
            }
            else
            {
                i.xuat();
            }
        }
        
    }
    public static void xuathdgio()
    {
        for(hoadon i:list)
        {
            if(i instanceof hoadontheogio)
            {
                i.xuat();
            }
            
        }
    }
        public static void xuathdngay(){
        for(hoadon i:list)
        {
            if(i instanceof hoadontheongay)
            {
                i.xuat();
            }
           
        }
        
        
    }
    
    
    public static void main(String []args)
    {
    int chon=0;
    do
    {
        menu();
        System.out.println("mời bạn chọn: ");
        chon=sc.nextInt();
    switch(chon)
    {
        case 1:
            nhaphdgio();
            break;
        case 2:
            nhaphdngay();
            break;
        case 3:
            xuatfullhd();
            break;
        case 4:
            xuathdgio();
            break;
        case 5:
            xuathdngay();
            break;
        case 6:
            break;
        case 7:
            break;
        case 8:
            break;
        case 9:
            break;
                
    }
}
        while(chon!=0);
        }
}

