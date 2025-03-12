package Perpustakaan;

public class Customer {
    private String userName;
    private String password;
    private String peminjamanBuku;

    public Customer(String userName, String password, String peminjamanBuku) {
        this.userName = userName;
        this.password = password;
        this.peminjamanBuku = peminjamanBuku;
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
    public void UpdateCustomer(){
        Customer customer = new Customer("johndoe", "securepass", "Harry Potter");
        customer.setUserName("janedoe");
        customer.setPeminjamanBuku("Lord of the Rings");
        System.out.println("Updated Customer: " + customer.getUserName());
        System.out.println("Updated Buku yang dipinjam: " + customer.getPeminjamanBuku());
    }

    // public boolean login(String x, String y){
    //     if (this.userName == x && this.password == y){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    //     // return false;
    // }
}
