import java.util.Scanner;
import java.util.ArrayList;

import Perpustakaan.Admin;
import Perpustakaan.Buku;
import Perpustakaan.Customer;
import Perpustakaan.FormPeminjaman;
import Perpustakaan.WebSite;

public class App {

    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        

        Customer customer = new Customer("admin", "123", "Harry Potter");
        Buku buku = new Buku("BK001", "The Great Gatsby", "F. Scott Fitzgerald");
        Admin admin = new Admin("Budi");
        WebSite website = new WebSite("Harry Potter", "ID1234");
        FormPeminjaman form = new FormPeminjaman("10 Maret 2025", "Pending");
        String in;

        while (true) {
            System.out.println("=== Sistem Peminjaman Buku Online ===");
            System.out.println("1. Menu Customers");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Website");
            System.out.println("4. Tampilkan Form Peminjaman");
            System.out.println("5. Tampilkan Admin");
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
                pilihan = -1;
                continue;
            } finally {
                scanner.nextLine(); // Mengonsumsi newline
            }

            switch (pilihan) {
                case 1:
                    App.menuCustomers();
                    break;
                case 2:
                    buku.tampilkanBuku();
                    break;
                case 3:
                    website.tampilkanWebsite();
                    break;
                case 4:
                    form.tampilkanPeminjaman();
                    break;
                case 5:
                    System.out.println("Admin: " + admin.getNamaAdmin());
                    // System.out.println("Status Peminjaman: " + admin.pembuatanDataPeminjaman);
                    System.out.println(" ");
                    // admin.inputData();
                    break;
                case 6:
                    // customer.UpdateCustomer();
                    // customer.updateData();
                    break;
                case 7:
                    buku.UpdateBuku();
                    // buku.updateData();
                    break;
                case 8:
                    website.updateData(buku.getJudulBuku());
                    // website.updateData();
                    break;
                case 9:
                    // admin.updateDataAdmin();
                    break;
                case 10:
                    System.out.println("Keluar dari sistem...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void menuCustomers() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menu Customers ===");
            System.out.println("1. Tampilkan Data Customer");
            System.out.println("2. Tambah Data Customer");
            System.out.println("3. Update Data Customer");
            System.out.println("4. Hapus Data Customer");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan;
            try {
                pilihan = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
                pilihan = -1;
                continue;
            } finally {
                scanner.nextLine(); // Mengonsumsi newline
            }

            switch (pilihan) {
                case 1:
                    Customer customer = new Customer(App.customers);
                    customer.tampilkanCostumer();
                    break;
                case 2:
                    System.out.print("Masukkan nama customer: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan ID customer: ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan buku favorit customer: ");
                    String bukuFavorit = scanner.nextLine();

                    Customer newCustomer = new Customer(nama, id, bukuFavorit);
                    App.customers.add(newCustomer);
                    System.out.println("Customer berhasil ditambahkan!");
                    break;
                case 3:
                    System.out.print("Masukkan ID customer yang ingin diupdate: ");
                    String idUpdate = scanner.nextLine();
                    boolean found = false;

                    for (Customer cust : App.customers) {
                        if (cust.getIdCustomer() == Integer.parseInt(idUpdate)) {
                            System.out.print("Masukkan nama baru customer: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan buku favorit baru customer: ");
                            String bukuFavoritBaru = scanner.nextLine();

                            cust.setUserName(namaBaru);
                            cust.setPeminjamanBuku(bukuFavoritBaru);
                            System.out.println("Data customer berhasil diupdate!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Customer dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan ID customer yang ingin dihapus: ");
                    String idHapus = scanner.nextLine();
                    boolean deleted = false;

                    for (Customer cust : App.customers) {
                        if (cust.getIdCustomer() == Integer.parseInt(idHapus)) {
                            App.customers.remove(cust);
                            System.out.println("Customer berhasil dihapus!");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Customer dengan ID tersebut tidak ditemukan.");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}