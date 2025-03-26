class FormPeminjaman {
    private String jadwalPeminjaman;
    private String pengajuanPeminjaman;

    public FormPeminjaman(String jadwalPeminjaman, String pengajuanPeminjaman) {
        this.jadwalPeminjaman = jadwalPeminjaman;
        this.pengajuanPeminjaman = pengajuanPeminjaman;
    }

    public String getJadwalPeminjaman() {
        return jadwalPeminjaman;
    }
    public void InputPeminjaman(){
        FormPeminjaman form = new FormPeminjaman("10 Maret 2025", "Pending");
        System.out.println("Jadwal Peminjaman: " + form.getJadwalPeminjaman());
        System.out.println(" ");
    }
}