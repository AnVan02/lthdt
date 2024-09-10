package QLNhansu
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class Main {
static Scanner input=new Scanner(System.in);
static int n,m;
static List<Nguoi> list=new ArrayList<Nguoi>();
static List<BienChe> listbienche=new ArrayList<>();
static List<HopDong> listhopdong=new ArrayList<>();
public static void Menu()
{
    System.out.println("1- Nhập danh sách nhân viên biên chế");
    System.out.println("2- Nhập danh sách nhân viên họp đồng");
    System.out.println("3- Xuất danh sách nhân viên biên chế");
    System.out.println("4- Xuất danh sách nhân viên họp đồng");
    System.out.println("5- Tìm nhân viên biên chế có lương cao nhất");
    System.out.println("6- Tìm nhân viên họp đồng có lương cao nhất");
    System.out.println("7- Sắp xếp nhân viên có lương giảm dần");
    System.out.println("8- Xóa nhân viên biên chế");
    System.out.println("9- Tính trung bình thành tiền cho tất cả nhân viên biên chế và họp đồng");
    System.out.println("10-Xuất ra nhân viên có tổng lương trên 5tr");
    System.out.println("0- Thoát chương trình");
}
public static void NhapBienChe() {
 System.out.println("Nhập biên chế ");
        System.out.println("Nhập số biên chế: ");
        m=input.nextInt();
        for(int i=0;i< m;i++)
        {
            BienChe bc=new BienChe();
            bc.nhapNguoi();
            list.add(bc);
            }
}
public static void XuatBienChe() {
 for(Nguoi i:list)
        {
            if  (i instanceof BienChe)
            {
                ((BienChe)i).XuatNguoi();
            }
        }
}
public static void NhapHopDong() {
System.out.println("Nhập hợp đồng ");
        System.out.println("Nhập số hợp đồng: ");
        n=input.nextInt();
        for(int i=0;i< n;i++)
        {
            HopDong hd=new HopDong();
            hd.nhapNguoi();
            list.add(hd);
            }
}
public static void XuatHopDong() {
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
            float max;
            max = listbienche.get(0).tinhLuong();
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
public static void XoaTen()
{
    System.out.println("Xóa tên nhân viên: ");
    input.nextLine();
    String ten=input.nextLine();
    for(Nguoi i : list)
    {
        
    }
}
public static void main(String[] args) {
    int chon;
    do{
       Menu();
        System.out.println("Mời bạn chọn: ");
        chon=input.nextInt();
        switch(chon) {
            case 1:
                NhapBienChe();
                break;
            case 2:
                NhapHopDong();
                break;
            case 3:
                XuatBienChe();
                break;
            case 4:
                XuatHopDong();
                break;
            case 5:
                luongBCmax();
                break;
            case 6:
                luongHDmax();
                break;
            case 7:
                
            case 8:
                
                break;
        }
    }while(chon!=0);
}
    
}
Bạn đã gửi Hôm nay lúc 22:50
