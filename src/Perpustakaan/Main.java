package Perpustakaan;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("johndoe", "securepass", "Harry Potter");
        System.out.println("Customer: " + customer.getUserName());
        System.out.println("Buku yang dipinjam: " + customer.getPeminjamanBuku());
        System.out.println(" ");

        customer.UpdateCustomer();
        System.out.println(" ");
        
        Buku buku = new Buku("BK001", "The Great Gatsby", "F. Scott Fitzgerald");
        System.out.println("Kode Buku: " + buku.getKodeBuku());
        System.out.println("Judul Buku: " + buku.getJudulBuku());
        System.out.println("Penulis: " + buku.getPenulis());
        System.out.println(" ");

        buku.UpdateBuku();
        System.out.println(" ");
        
        Admin admin = new Admin("Budi", "Data peminjaman dibuat");
        System.out.println("Admin: " + admin.getNamaAdmin());
        System.out.println("Status Peminjaman: " + admin.pembuatanDataPeminjaman);
        System.out.println(" ");

        WebSite website = new WebSite("Harry Potter", "ID1234");
        System.out.println("Judul Buku di Website: " + website.getJudulBuku());
        System.out.println(" ");
        
        FormPeminjaman form = new FormPeminjaman("10 Maret 2025", "Pending");
        System.out.println("Jadwal Peminjaman: " + form.getJadwalPeminjaman());
        System.out.println(" ");
    }
}