import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String penulis;
    private static ArrayList<Buku> daftarBuku = new ArrayList<>();

    public Buku(String kodeBuku, String judulBuku, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan kode buku: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan penulis: ");
        String penulis = scanner.nextLine();
        daftarBuku.add(new Buku(kode, judul, penulis));
        System.out.println("Buku berhasil ditambahkan.");
    }

    public static void tampilkanBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam daftar.");
        } else {
            for (Buku buku : daftarBuku) {
                System.out.println(buku);
            }
        }
    }

    public static void updateBuku(Scanner scanner) {
        System.out.print("Masukkan kode buku yang ingin diperbarui: ");
        String kode = scanner.nextLine();
        for (Buku buku : daftarBuku) {
            if (buku.getKodeBuku().equals(kode)) {
                System.out.print("Masukkan judul baru: ");
                buku.setJudulBuku(scanner.nextLine());
                System.out.print("Masukkan penulis baru: ");
                buku.setPenulis(scanner.nextLine());
                System.out.println("Buku berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public static void hapusBuku(Scanner scanner) {
        System.out.print("Masukkan kode buku yang ingin dihapus: ");
        String kode = scanner.nextLine();
        daftarBuku.removeIf(buku -> buku.getKodeBuku().equals(kode));
        System.out.println("Buku berhasil dihapus.");
    }

    @Override
    public String toString() {
        return "Kode: " + kodeBuku + ", Judul: " + judulBuku + ", Penulis: " + penulis;
    }
}