/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tieuluan;

/**
 *
 * @author ACER
 */
public class giaodichdat {

    double getDienTich() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class GiaoDich {

        public GiaoDich() {
        }

        private void nhap() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class scanner {

        private static String nextLine() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public scanner() {
        }
    }
   public class GiaoDichDat extends GiaoDich {
    private String loaiDat;
 
    public GiaoDichDat() {
        super();
    }
 
    public GiaoDichDat(String loaiDat) {
        super();
        this.loaiDat = loaiDat;
    }
 
    public String getLoaiDat() {
        return loaiDat;
    }
 
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
     
    public void nhap() {
        super.nhap();
        System.out.print("Nhập loại đất : ");
        loaiDat = scanner.nextLine();
    }
 
    @Override
    public String toString() {
        return super.toString() + ", loại đất: " + this.loaiDat;
    }
} 
}
