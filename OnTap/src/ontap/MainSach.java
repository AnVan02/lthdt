/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainSach {
  static Scanner sc=new Scanner(System.in);
  static int n;
  static List<sach> list= new ArrayList<>();
 
    private static int chon;
  public static void menu()
  {
      System.out.println("1-Moi ban nhap thong tin sach giao khoa: ");
      System.out.println("2-Moi ban nhap thong tin sach tham khao: ");
      System.out.println("3-Xuat tat ca thong tin sach");
      System.out.println("4-Xuat thon tin sach giao khoa: ");
      System.out.println("5-Xuat thong tin sach tham khao: ");
      System.out.println("0-Thoat chuong trinh: ");
  }
    public static int nhap()
    {
        System.out.println("Moi ban chon: ");
        chon=sc.nextInt();
        while(chon!=0);
        switch(chon)
        {
         case 1:
           System.out.println("chuong trinh ket thuc");
            break;
        case 2:
            System.out.println("Moi nhap sach GK");
            break;
        case 3:
            System.out.println("moi ban nhap sach TK");
            break;
        case 4:
            
            break;
        }
        while (chon!=0);
      return 0;
      
    }

   

}

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            
            

    
     

