package Perpustakaan;

public class Admin {
    private String namaAdmin;
    public String pembuatanDataPeminjaman;

    public Admin(String namaAdmin, String pembuatanDataPeminjaman) {
        this.namaAdmin = namaAdmin;
        this.pembuatanDataPeminjaman = pembuatanDataPeminjaman;
    }

    public String getNamaAdmin() {
        return this.namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }
}