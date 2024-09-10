
import java.util.ArrayList;
import java.util.List;
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
public class MainNguoi {
    static Scanner input=new Scanner(System.in);
    static int b;
    static List<Nguoi> list=new ArrayList<Nguoi>();
    static List<BienChe> listbienche=new ArrayList<>();
    static List<HopDong> listhopdong=new ArrayList<>();
    public static void menu()
    {
        System.out.println("1- Nhập biên chế:");
        System.out.println("2- Nhập hợp đồng:");
        System.out.println("3- Xuất biên chế:");
        System.out.println("4- Xuất hợp đồng:");
        System.out.println("5- Tìm Nhân viên có biên chế cao nhất: ");
        System.out.println("6- Tìm nhân vien có hợp đồng lương cao nhất: ");
        System.out.println("7- Sắp xếp nhân viên có tiền lương giảm dần");
        System.out.println("8- Xóa nhân viên khi biết tên:");
        System.out.println("9_ Tính trung bình thành tiền cho tất cả nhân viên biên chế và hợp đồng:");
        System.out.println("1- Xuất ra nhân viên có tổng lương trên 5 triệu:");
        System.out.println("0- Thoát:");
    }
    public static void NhapBienChe()
    {
        System.out.println("Nhập biên chế ");
        System.out.println("Nhập số biên chế: ");
        b=input.nextInt();
        for(int i=0;i< b;i++)
        {
            BienChe bc=new BienChe();
            bc.NhapNguoi();
            list.add(bc);
            }
    }
    public static void NhapHopDong()
    {
        System.out.println("Nhập hợp đồng ");
        System.out.println("Nhập số hợp đồng: ");
        b=input.nextInt();
        for(int i=0;i< b;i++)
        {
            HopDong hd=new HopDong();
            hd.NhapNguoi();
            list.add(hd);
            }
    }
    public static void XuatBienChe()
    {
        for(Nguoi i:list)
        {
            if  (i instanceof BienChe)
            {
                ((BienChe)i).XuatNguoi();
            }
        }
    }
    public static void XuatHopDong()
    {
        for(Nguoi i:list)
        {
            if  (i instanceof HopDong)
            {
                ((HopDong)i).XuatNguoi();
            }
        }
    }
    public static void luongBCmax()
    {
        for(Nguoi i:list)
        {
            if(i instanceof BienChe)
            {
                listbienche.add((BienChe)i);
            }
        }
        for(int j=0;j<listbienche.size();j++)
        {
            float max=listbienche.get(0).tinhLuong();
            if(listbienche.get(j).tinhLuong()>max)
            {
                max=listbienche.get(j).tinhLuong();
            }
            if(listbienche.get(j).tinhLuong()==max)
            {
                listbienche.get(j).XuatNguoi();
            }
        }
    }
    public static void luongHDmax()
    {
        for(Nguoi i:list)
        {
            if(i instanceof HopDong)
            {
                listhopdong.add((HopDong)i);
            }
        }
        for(int j=0;j<listhopdong.size();j++)
        {
            float max=listhopdong.get(0).tinhLuong();
            if(listhopdong.get(j).tinhLuong()>max)
            {
                max=listhopdong.get(j).tinhLuong();
            }
            if(listhopdong.get(j).tinhLuong()==max)
            {
                listhopdong.get(j).XuatNguoi();
            }
        }
    }
    
    public static void main(String[]args)
    { int chon;
        do
        {
            menu();
            System.out.println("Mời bạn chọn: ");
            chon=input.nextInt();
            switch(chon)
            {
                case 1 :
                    NhapBienChe();
                    break;
                case 2 :
                    NhapHopDong();
                    break;
                case 3 :
                    XuatBienChe();
                    break;
                case 4 :
                    XuatHopDong();
                    break;
                case 5 :
                    luongBCmax();
                            break;
                case 6 :
                    luongHDmax();
                    break;
                case 7 :
                    
                case 8 :
                    
                    break;
            }
        }while(chon!=0);
    }
    
}
