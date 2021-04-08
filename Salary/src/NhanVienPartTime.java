public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;

    public NhanVienPartTime(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public NhanVienPartTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    public int getGioLamViec() {
        return gioLamViec;
    }

    public void setGioLamViec(int gioLamViec) {
        this.gioLamViec = gioLamViec;
    }

    public NhanVienPartTime(String ten) {
        super(ten);
    }

    @Override
    protected String loaiNhanVien() {
        return "Part time";
    }

    @Override
    public void tinhLuong() {

        System.out.println("Loại nhân viên: " + this.loaiNhanVien());
        System.out.println("Lương: "+ this.getGioLamViec()* Configs.LUONG_LAM_THEM_MOI_GIO);
    }
}
