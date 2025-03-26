package Perpustakaan;

import java.util.ArrayList;

public class Customer {
    private int idCustomer;

    private String userName;
    private String password;
    private String peminjamanBuku;
    private ArrayList<Customer> customers;

    public Customer(String userName, String password, String peminjamanBuku) {
        this.userName = userName;
        this.password = password;
        this.peminjamanBuku = peminjamanBuku;
        // this.customers = this.customers;
    }
    public Customer(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public int getIdCustomer() {
        return this.idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPeminjamanBuku() {
        return this.peminjamanBuku;
    }

    public void setPeminjamanBuku(String peminjamanBuku) {
        this.peminjamanBuku = peminjamanBuku;
    }

    public void updateCustomerById(int idCustomer, String newUserName, String newPassword, String newPeminjamanBuku) {
        for (Customer customer : this.customers) {
            if (customer.getIdCustomer() == idCustomer) {
                customer.setUserName(newUserName);
                customer.setPassword(newPassword);
                customer.setPeminjamanBuku(newPeminjamanBuku);
                System.out.println("Customer data berhasil diupdate");
                return;
            }
        }
        System.out.println("Customer dengan id " + idCustomer + " tidak ditemukan");
    }

    public void hapusCustomer(Customer customer) {
        this.customers.remove(customer);
        System.out.println("Customer berhasil dihapus");
    }

    private int idCounter = 1;

    public void tambahCustomer(Customer customer) {
        customer.setIdCustomer(this.idCounter);
        this.customers.add(customer);
        System.out.println("Customer berhasil ditambahkan");
        this.idCounter++;
    }

    public void tampilkanCostumer() {
        for (Customer customer : this.customers) {
            System.out.println("Customer: " + customer.getUserName());
            System.out.println("Buku yang dipinjam: " + customer.getPeminjamanBuku());
            System.out.println(" ");
        }
        System.out.println("Jumlah Customer: " + this.customers.size());
    }

    // public boolean login(String x, String y){
    // if (this.userName == x && this.password == y){
    // return true;
    // }
    // else{
    // return false;
    // }
    // // return false;
    // }
}
