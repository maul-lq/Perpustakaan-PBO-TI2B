package Perpustakaan;

public class WebSite {
    private String judulBuku;
    private String idAkun;

    public WebSite(String judulBuku, String idAkun) {
        this.judulBuku = judulBuku;
        this.idAkun = idAkun;
    }

    public String getJudulBuku() {
        return this.judulBuku;
    }

    public void updateData(String judulBuku) {
        this.judulBuku = judulBuku;
        System.out.println("Data Buku telah diupdate: " + this.judulBuku);
    }

    public void tampilkanWebsite() {
        System.out.println("Judul Buku di Website: " + this.getJudulBuku());
        System.out.println(" ");
    }
}
