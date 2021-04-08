public class NhanVienTest {
    public static void main(String[] args) {
        NhanVienFullTime nv1 = new NhanVienFullTime("Chuong",2,1);
        NhanVienFullTime nv2 = new NhanVienFullTime("chuong",3,2);
        NhanVienPartTime nv3 = new NhanVienPartTime("chuog",100);
        nv1.xuatThongTin();
        nv2.xuatThongTin();
        nv3.xuatThongTin();
    }
}
