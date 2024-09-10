/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {
    static Scanner sc=new Scanner(System.in);
    static int m,n;
    static List <GiaoDichNhaDat> list =new ArrayList<GiaoDichNhaDat>();
    static List <GiaoDichNha> listsapxep =new ArrayList<GiaoDichNha>();
    // đây là phân manu
    public static void menu() {
        System.out.println("1- Nhập thông tin giao dịch đất");
        System.out.println("2- Nhập thông tin giao dich nha");
        System.out.println("3- Xuất thông tin tất cả giao dịch đất và nhà");
        System.out.println("4- Xuất thông tin giao dịch đất");
        System.out.println("5- Xuất thông tin giao dịch nhà");
    }
    // phần nhập thông tin giao dịch đất
    public static void NhapGiaoDichDat() {
        System.out.println("Nhập số lượng thông tin giao dịch đất");
        m=sc.nextInt();
        for(int i=0;i<m;i++) {
            GiaoDichDat gdd=new GiaoDichDat();
            gdd.nhapdat();
            list.add (gdd);
        }
    }
    
    public static void NhapGiaoDichNha(){
        System.out.println("Nhập số lượng thông tin giao dịch nha");
        n=sc.nextInt();
        for(int i=0;i<n;i++) {
            GiaoDichNha gdn=new GiaoDichNha();
            gdn.nhapnha();
            list.add(gdn);
        }
    }
      public static void xuatatca(){
          for(GiaoDichNhaDat i: list)
          {
              i.xuat();
          }
      }  
      public static void xuatdat() {
       for(GiaoDichNhaDat i: list)
       {
           if(i instanceof GiaoDichDat)
           {
               ((GiaoDichDat) i).xuatdat();
           }
       }
   }
      public static void xuatnha() {
          for(GiaoDichNhaDat i: list)
          {
              if(i instanceof GiaoDichDat)
              {
                  ((GiaoDichNha) i).xuatnha();
              }
          }
      }
      public static void main(String[] args) {
          int chon;
          do{
              menu();
              System.out.println("Mời bạn chon");
              chon=sc.nextInt();
              switch(chon)
              {
                  case 1:
                      NhapGiaoDichNha();
                      break;
                  case 2:
                      NhapGiaoDichNha();
                      break;
                  case 3:
                      xuatatca();
                      break;
                  case 4: 
                      xuatdat();
                      break;
                  case 5:
                      xuatnha();
                      break;
              }
            } while(chon!=0);
          }

   
   

    
    }



