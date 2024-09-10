/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class SachGK extends sach {
    Scanner sc=new Scanner(System.in);
    protected String loaisach;
    public SachGK()
    {
        super();
        this.loaisach="An";
    }
    public SachGK(String masach, String ngayxb, int dongia, int soluong, String loaisach)
    {
        super(masach, ngayxb, dongia, soluong);
        this.loaisach=masach;
    }
    public void nhapsach()
    {
   
    
}
}
