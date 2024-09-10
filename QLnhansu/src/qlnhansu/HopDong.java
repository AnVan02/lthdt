/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhansu;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class HopDong extends Nguoi {
    Scanner input=new Scanner(System.in);
    private float TienCongLD;
    private float SoNgayLV;
    private float HeSoVuotGio;
    private String Tinh;

    public float getTienCongLD() {
        return TienCongLD;
    }

    public void setTienCongLD(float TienCongLD) {
        this.TienCongLD = TienCongLD;
    }

    public float getSoNgayLV() {
        return SoNgayLV;
    }

    public void setSoNgayLV(float SoNgayLV) {
        this.SoNgayLV = SoNgayLV;
    }

    public float getHeSoVuotGio() {
        return HeSoVuotGio;
    }

    public void setHeSoVuotGio(float HeSoVuotGio) {
        this.HeSoVuotGio = HeSoVuotGio;
    }
    public HopDong()
    {
        this.getTienCongLD();
            this.getSoNgayLV();
            this.getHeSoVuotGio();
            
    }
    public HopDong(String HoTen, int MaSo, float TienCongLD, float SoNgayLV, float HeSoVuotGio)
    {
        super(HoTen, MaSo);
        this.HeSoVuotGio=HeSoVuotGio;
        this.SoNgayLV=SoNgayLV;
        this.TienCongLD=TienCongLD;
    }
    public void NhapNguoi()
    {
        super.NhapNguoi();
        System.out.println("Nhap Tien CongLD:  ");
        this.setTienCongLD(input.nextFloat());
        System.err.println("So Ngay Lam Viet: ");
        this.setSoNgayLV(input.nextFloat());
        System.err.println("He So Vuot Gio:  ");
        this.setHeSoVuotGio(input.nextFloat());
                
        
    }
    public void XuatNguoi()
    {
        System.out.println("TienCong"+this.TienCongLD);
        System.out.println("So Ngay Lam Viec"+this.SoNgayLV);
        System.out.println("He So Vuot Gio"+this.HeSoVuotGio);
        System.out.println("Tinh Luong"+this.TinhLuong());
        
    }
    public float TinhLuong()
    {
        return(this.getHeSoVuotGio()+this.getSoNgayLV()+this.getTienCongLD());
    }

    
    }
