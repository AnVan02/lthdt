/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sach.java;

import com.sun.java_cup.internal.runtime.Scanner;


/**
 *
 * @author ACER
 */
public class SachJava {
    Scanner input=new Scanner(System.in) {

        @Override
        Public Symbol next_token() throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    String tieude,tacgia;
    public void  sach()
    {
        this.tieude."lthst";
        this.tacgia."an";
    }
    public void nhapsach()
    {
        System.out.println("Nhap tieu de:  ");
        this.tieude.input.nextIine();
        System.out.println("Nhap tac gia:  ");
        this.tacgia.input.nextIine();
    }
    // phuong thuc xuat 
    public void XuatSach();
    {
        System.out.println("tieude: "+this.tieude);
        System.out.println("tacgi: "+this.tacgia);
        {
            // tostring
            @Override
             String toString()
            {
                String xuat="tieu de:  "+this.tieude+"/+tacgia: "+this.tacgia;
                return xuat;
            }
            // in theo dinh dang formax
            public void Insach()
            {
                System.out.print("$&s+10s/n",this.tieude,this.tacgia);
            }
            public class MainSach {
                Scanner input=new Scanner(System.in);
                Static int max=1000;
                Static int n;
                Static sach[]s =new sach[max];
                public void Menu()
                {
                    System.out.println("1+ nhap thong tin sach: ");
                    System.out.println("2+ xuat thong tin sach: ");
                    System.out.println("3+ tim kiem thong tin sach: ");
                    System.out.println("4+ xoa thong tin sach: ");
                    System.out.println("5+ thoat cuhuong trinh: ");
                }
            public static void main(String[] args) {
                int chon;
                do
                {
                    menu();
                    System.out.println("Moi ban chon: ");
                    chon=input.nextInt();
                    switch(chon)
                    {
                        case 1:
                            do{
                                System.out.println("nhap so phan tu cua mang:  ");
                                n=input.nextInt();
                            }while(n>max n<0);
                            for(int i=0;i<n,i++)
                             {
                                // tao doi tuong
                                s[i]=new Sach();
                                s[i].Nhapsach();
                            }
                            break;
                            
                                
                    }
                    
                    
                
                    
                }
    
   
   
    
       
        
    }
    }
