class WebSite {
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
    public void InputWebSite(){
        WebSite website = new WebSite("Harry Potter", "ID1234");
        System.out.println("Judul Buku di Website: " + website.getJudulBuku());
        System.out.println(" ");
    }
}
