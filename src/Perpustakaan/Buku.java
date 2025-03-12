package Perpustakaan;

public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String penulis;

    public Buku(String kodeBuku, String judulBuku, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
    }

    public String getKodeBuku() {
        return this.kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getJudulBuku() {
        return this.judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public void UpdateBuku(){
        Buku buku = new Buku("BK001", "The Great Gatsby", "F. Scott Fitzgerald");
        buku.setJudulBuku("1984");
        buku.setPenulis("George Orwell");
        System.out.println("Updated Judul Buku: " + buku.getJudulBuku());
        System.out.println("Updated Penulis: " + buku.getPenulis());
    }
}
