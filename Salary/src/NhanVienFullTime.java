public class NhanVienFullTime extends NhanVien{
    private int loaiChucVu;
    private int ngayLamThem;
    public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu){
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }

    public int getLoaiChucVu() {
        return loaiChucVu;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    public int getNgayLamThem() {
        return ngayLamThem;
    }

    public void setNgayLamThem(int ngayLamThem) {
        this.ngayLamThem = ngayLamThem;
    }

    @Override
    protected String loaiNhanVien() {
        return "Full time";
    }

    @Override
    public void tinhLuong() {

        System.out.println("Chức vụ: " + ((this.getLoaiChucVu() == 1)?"Sếp":"Lính"));
        System.out.println("Loại nhân viên: " + this.loaiNhanVien());
        System.out.println("Lương: " + ((this.getLoaiChucVu() == 1)?Configs.LUONG_SEP + this.getNgayLamThem()* Configs.LUONG_LAM_THEM_MOI_NGAY :Configs.LUONG_LINH + this.getNgayLamThem()* Configs.LUONG_LAM_THEM_MOI_NGAY ) ) ;
    }
}
