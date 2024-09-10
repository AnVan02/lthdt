
package xe;

/**
 *
 * @author ACER
 */
    public class XeNgoaiThanh extends Xe {
            String noiden;
            int songaydi;
            private int SoNgay;
            private String songay;
            public XeNgoaiThanh()
            {
                super ();
                this.noiden="Nha trang";
                this.songaydi=3;

            }


        public XeNgoaiThanh(int masoch,String tentx, int soxe,float doanhthu,String noiden,int songaydi)
        {
            super(masoch, tentx, soxe, doanhthu);
            this.noiden=noiden;
            this.songaydi=songaydi;
         }
            public void XeNgoaiThanh()
         {
                super.nhapXe();
            System.out.println("Nhap noi den: ");
            input.nextLine();
            this.noiden=input.nextLine();
            System.out.println("Nhap so ngay di: ");
            this.songaydi=input.nextInt();
        }
            public void xuatNgT()
         {
                    super.xuatXe();
            System.out.println("Noi den: "+this.noiden);
            System.out.println("So ngay di: "+this.songaydi);
            }

            }
