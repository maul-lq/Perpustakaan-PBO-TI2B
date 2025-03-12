package Perpustakaan;

public class FormPeminjaman {
    private String jadwalPeminjaman;
    private String pengajuanPeminjaman;

    public FormPeminjaman(String jadwalPeminjaman, String pengajuanPeminjaman) {
        this.jadwalPeminjaman = jadwalPeminjaman;
        this.pengajuanPeminjaman = pengajuanPeminjaman;
    }

    public String getJadwalPeminjaman() {
        return this.jadwalPeminjaman;
    }
}