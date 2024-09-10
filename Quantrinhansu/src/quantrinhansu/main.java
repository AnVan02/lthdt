

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import quantrinhansu.khachhang;
/**
 *
 * @author user
 */
 public class main {
    static Scanner input=new Scanner(System.in);
    static int n,m;
    static List<khachhang> list=new ArrayList<>();
    static List<khachVN> listbienche=new ArrayList<>();
    static List<khachnn> listhopdong=new ArrayList<>();
  public static void menu()
{
    System.out.println("1- Nhập danh sách các hóa đơn khách hàng");
    System.out.println("2- Tính tổng số lượng cho từng loại khách hàng");
    System.out.println("3- Tính trung bình thành tiền của kahch hàng NN");
    System.out.println("4- Xuất ra các hóa đơn trong tháng 09/2013");
    System.out.println("5- Xóa khách hàng khỏi danh sách");
    System.out.println("0- Thoát chương trình");
}
public static void nhapkhachVN()
{
    System.out.println("Mời bạn nhập số lượng khách VN");
    n=input.nextInt();
    for(int i=0;i<n;i++)
    {
        khachVN VN=new khachVN();
        VN.nhapKH();
        list.add(VN);
    }
}
public static void nhapkhachNN()
{
    System.out.println("Mời bạn nhập số lượng khách NN");
    m=input.nextInt();
    for(int i=0;i<m;i++)
    {
        khachNN NN=new khachNN();
        NN.NhapKH();
        list.add(NN);
    }
}
public static void xuatkhachhang()
{
    for(khachhang i:list)
    {
        if(i instanceof khachVN)
        {
            ((khachVN) i).xuatKH();
        }
    }
    for(khachhang i:list)
    {
        if(i instanceof khachnn)
        {
            ((khachnn) i).xuatKH();
        }
    }
}
public static void tongs1()
{
    float tongvn=0;
    float tongnn=0;
    float tong=0;
    for(khachhang i:list)
    {
        if(i instanceof khachVN)
        {
            tongvn=tongvn+((khachVN) i).soluong;
        }
    }
    for(khachhang i:list)
    {
        if(i instanceof khachNN)
        {
            tongnn=tongnn+((khachNN) i).soluong;
        }
    }
    tong=tongvn+tongnn;
    System.out.println("Tổng số lượng khách hàng VN"+tongvn);
    System.out.println("Tổng số lượng khách hàng NN"+tongnn);
    System.out.println("Tổng số lượng khach hàng"+tong);
}
public static void ttbkhnn()
{
    double tong=0;
    int count=0;
    for(khachhang a:list)
    {
        if(!(a instanceof khachnn))
        {
        } else {
            tong=tong+a.tinhtien();
        }
    }
    double tb=tong/count;
}
public static void xuathoadon()
{
    final String ngay="09/2013";
    for(khachhang i:list)
    {
        if(i.ngayhd.equalsIgnoreCase(ngay))
        {
            i.xuatkh();
        }
    }
}
public static void xoa()
{
    System.out.println("Khách hàng cần xóa ");
    input.nextLine();
    String tenct=input.nextLine();
    for(khachhang i:list)
    {
        if(i instanceof khachVN &&i.hoten.equalsIgnoreCase(tenct))
        {
            list.add(i);
        }
        else
        {
            list.add(i);
        }
        list.removeAll(list);
    }
    for(khachhang i: list)
    {
        i.xuatkh();
    }
}
public static void main(String[] args) {
    int chon = 0;
    do
    {
        menu();
        System.out.println("Mời bạn chọn");
        n=input.nextInt();
        switch(chon)
        {
            case 1:
                nhapkhachVN();
                break;
            case 2:
                nhapkhachNN();
                break;
            case 3:
                xuatkhachhang();
                break;
            case 4:
                tongs1();
                break;
            case 5:
                ttbkhnn();
                break;
            case 6:
                xuathoadon();
                break;
            case 7:
                xoa();
                break;
            default:
                System.out.println("Số  không có trong danh sách chọn");
                break;
        }
    }while(chon!=0);
}
}