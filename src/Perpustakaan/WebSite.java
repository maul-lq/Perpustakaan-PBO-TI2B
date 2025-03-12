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
    }
}
