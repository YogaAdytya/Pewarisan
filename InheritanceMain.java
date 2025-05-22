class InheritanceMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Yoga Adytya", "MGR001", "IT");
        
        System.out.println("Informasi Manager:");
        System.out.println("Nama: " + mgr.getNama());
        System.out.println("ID: " + mgr.getIdKaryawan());
        System.out.println("Departemen: " + mgr.getDepartemen());
    }
}