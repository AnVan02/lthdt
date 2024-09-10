/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xe;

/**
 *
 * @author ACER
 */
         public class XeNT extends Xe{
            String sotuyen;
            float sokm;
            public XeNT()
        {
                super();
            this.sotuyen="Quan 3- Quan 7";
            this.sokm=1;
        }
        public XeNT(int masoch,String tentx, int soxe,float doanhthu,String sotuyen,float sokm)
        {
            super(masoch, tentx, soxe, doanhthu);
            this.sotuyen=sotuyen;
            this.sokm=sokm;
        }
            public void nhapNT()
        {
            super.nhapXe();
        System.out.println("Nhap so tuyen: ");
        input.nextLine();
        this.sotuyen=input.nextLine();
        System.out.println("Nhap so km: ");
        this.sokm=input.nextFloat();
    }
        public void xuatNT()
    {
        super.xuatXe();
        System.out.println("So tuyen: "+this.sotuyen);
        System.out.println("So km: "+ this.sokm);
        }
        }