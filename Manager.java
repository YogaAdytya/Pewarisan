public class Manager extends Karyawan {
    private String departemen;
    
    public Manager(String nama, String idKaryawan, String departemen) {
        setNama(nama);
        setIdKaryawan(idKaryawan);
        setDepartemen(departemen);
    }
    
    public void setDepartemen(String dept) {
        this.departemen = dept;
    }
    
    public String getDepartemen() {
        return departemen;
    }
}