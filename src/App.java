import java.util.Scanner;

import Perpustakaan.Admin;
import Perpustakaan.Buku;
import Perpustakaan.Customer;
import Perpustakaan.FormPeminjaman;
import Perpustakaan.WebSite;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Customer customer = new Customer();
        Buku buku = new Buku();
        WebSite website = new WebSite();
        FormPeminjaman form = new FormPeminjaman();
        Admin admin = new Admin();

        while (true) {
            // App.clear();
            System.out.println("=== Sistem Peminjaman Buku Online ===");
            System.out.println("1. Tambah Data Customer");
            System.out.println("2. Tambah Data Buku");
            System.out.println("3. Tambah Data Website");
            System.out.println("4. Tambah Data Form Peminjaman");
            System.out.println("5. Tambah Data Admin");
            System.out.println("6. Update Data Customer");
            System.out.println("7. Update Data Buku");
            System.out.println("8. Update Data Website");
            System.out.println("9. Update Data Admin");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan;
            try {
                pilihan = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
                pilihan=-1;
                continue;
            }finally{
                scanner.nextLine(); // Mengonsumsi newline
            }

            switch (pilihan) {
                case 1:
                    customer.inputData();
                    break;
                case 2:
                    buku.inputData();
                    break;
                case 3:
                    website.inputData();
                    break;
                case 4:
                    form.inputData();
                    break;
                case 5:
                    admin.inputData();
                    break;
                case 6:
                    customer.updateData();
                    break;
                case 7:
                    buku.updateData();
                    break;
                case 8:
                    website.updateData();
                    break;
                case 9:
                    admin.updateData();
                    break;
                case 10:
                    System.out.println("Keluar dari sistem...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    /**
     * @hidden Clears the console screen by printing the ANSI escape code for
     *         clearing the screen.
     * @hidden This method uses the escape sequence "\033[H\033[2J" to move the
     *         cursor to the top-left corner and clear the screen.
     * @category System
     * @implNote This method uses the ANSI escape code for clearing the screen.
     */
    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}