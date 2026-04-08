public class Karyawan {
    private String nama;
    private String jabatan;
    private double gaji;

    // CONSTRUCTOR 1: Untuk karyawan baru (gaji otomatis 0)
    public Karyawan(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = 0.0; // Nilai default
    }

    // CONSTRUCTOR 2: Untuk karyawan senior (gaji ditentukan langsung)
    public Karyawan(String nama, String jabatan, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void infoKaryawan() {
        System.out.println("Nama    : " + this.nama);
        System.out.println("Jabatan : " + this.jabatan);
        System.out.println("Gaji    : Rp" + this.gaji);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Menggunakan Constructor 1 (2 parameter)
        Karyawan staffBaru = new Karyawan("Zaki", "Intern");

        // Menggunakan Constructor 2 (3 parameter)
        Karyawan manager = new Karyawan("Citra", "Manager", 15000000);

        staffBaru.infoKaryawan();
        manager.infoKaryawan();
    }
