public abstract class NhanVien {
    protected String ten;
    protected long luong;
    public NhanVien(){

    }
    public  NhanVien(String ten){
        this.ten = ten;
    }
    protected abstract String loaiNhanVien();
    public abstract void tinhLuong();
    public void xuatThongTin(){
        System.out.println("Nhân viên có tên: "+ this.ten + ".");
        tinhLuong();
    }

}
