import java.util.Scanner;
public class Main {

    protected static void loginpage() {
        Kasir Kasir = new Kasir();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Username : ");
        String username = input.nextLine();
        System.out.print("Masukan Password : ");
        String password = input.nextLine();
        if ((username==Kasir.getUsername()) && (password==Kasir.getPassword())) {
            sapa("Kasir");
            sapa2(1);
        }
    }
    static void sapa(String Hallo) {
        System.out.println("Selamat Berbelanja");
    }
    static void sapa2(int hallo) {
        System.out.println("Admin ke - "+hallo);
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        loginpage();
        System.out.println("");
        Kasir Kasir = new Kasir();
        System.out.println("+-----------------------------------------------+");
        System.out.println("|               Menu Toko Bahan Pokok           |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("1. Daftar Member");
        System.out.println("2. Pembelian");
        System.out.println("3. Kasir");
        System.out.println("4. Daftar barang");
        System.out.println("+-----------------------------------------------+");
        System.out.println("Masukan Pilihan Anda : ");
        int menu = input.nextInt();
        if (menu==1) {
            System.out.println("");
            Member Member = new Member();
            Member.insert_data();
            System.out.println("");
        }
        if (menu==2) {
            System.out.println("");
            Member Member = new Member();
            Member.insert_data();
            System.out.println("");
            Bahan_pokok Bahan_pokok = new Bahan_pokok();
            Bahan_pokok.view_data();
            Transaksi Transaksi = new Transaksi();
            System.out.println("");
            System.out.println("+-----------------------------------------------+");
            Transaksi.pilih_bahanPokok();
            Transaksi.insert_data();
            Transaksi.view_data();
            Transaksi.cetak_data();
        }
        if (menu==3) {
            Kasir.insert_data();
            System.out.println("");
        }
        if (menu==4) {
            System.out.println("");
            Bahan_pokok Bahan_pokok = new Bahan_pokok();
            System.out.println(Bahan_pokok.note());
            Beras Beras = new Beras();
            System.out.println(Beras.note());
            Gula Gula = new Gula();
            System.out.println(Gula.note());
            Minyak_goreng Minyak_goreng = new Minyak_goreng();
            System.out.println(Minyak_goreng.note());
        }

    }

}