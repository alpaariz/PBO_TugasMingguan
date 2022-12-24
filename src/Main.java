import java.util.Scanner;
public class Main {

    protected static void loginpage() {
        Kasir Kasir = new Kasir();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Username : ");
        String username = input.nextLine();
        System.out.print("Masukan Password : ");
        String password = input.nextLine();
        if ((username == Kasir.getUsername()) && (password == Kasir.getPassword())) {
            sapa("Kasir");
            sapa2(1);
        }
        /*else{
            System.out.println("Password atau Username Anda salah.");
            System.out.println();
            loginpage();
        }*/
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
        Kasir.insert_data();
        System.out.println("+-----------------------------------------------+");
        System.out.println("|               Menu Toko Bahan Pokok           |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("1. Daftar Member                                |");
        System.out.println("2. Pembelian                                 |");
        System.out.println("3. Daftar Kasir                                 |");
        System.out.println("4. Daftar barang                                |");
        System.out.println("5. Daftar harga barang                          |");
        System.out.println("6. Stok Bahan Pokok                             |");
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
        if (menu==5) {
            System.out.println();
            System.out.println("+-----------------------------------------------+");
            System.out.println("|            Daftar Harga Bahan Pokok           |");
            System.out.println("|             (dalam beberapa merek)            |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("| 1. Beras                                      |");
            System.out.println("| 2. Gula                                       |");
            System.out.println("| 3. Minyak Goreng                              |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("Masukan Pilihan Anda : ");
            int pilih = input.nextInt();
            if (pilih==1){
                System.out.println("Daftar Harga Beras /Kg ");
                System.out.println("1. Organik Nusa              22.000/kg");
                System.out.println("2. Cap Bunga                 35.000/kg");
                System.out.println("3. Rojolele                  35.000/kg");
                System.out.println("4. Maknyus                   62.000/kg");
                System.out.println("5. Sania                     56.000/kg");
            }
            if (pilih==2) {
                System.out.println("Daftar Harga Gula /Kg ");
                System.out.println("1. Manis Kita                13.500/kg");
                System.out.println("2. Gulaku Premium White      23.500/kg");
                System.out.println("3. Tropicana Slim Classic    69.900/kg");
                System.out.println("4. Tropicana Slim Gula Jawa  59.000/kg");
                System.out.println("5. Halus Rosebrand           25.000/kg");
            }
            if (pilih==3) {
                System.out.println("Daftar Harga Minyak Goreng /Kg ");
                System.out.println("1. Tropical                  25.700/kg");
                System.out.println("2. Bimoli                    20.000/kg");
                System.out.println("3. Sania                     24.000/kg");
                System.out.println("4. Fortune                   21.000/kg");
                System.out.println("5. Curah                     20.000/kg");
            }
        }
        if (menu==6) {
            StokBahanPokok sbp = new StokBahanPokok();
            System.out.println();
            System.out.println("+-----------------------------------------------+");
            System.out.println("|                 Stok Bahan Pokok              |");
            System.out.println("+-----------------------------------------------+");
            System.out.println("Masukan stok Beras               : ");
            int brs = input.nextInt();
            System.out.println("Masukan stok Gula                : ");
            int gl = input.nextInt();
            System.out.println("Masukan stok Minyak Goreng       : ");
            int myk = input.nextInt();
            System.out.println("+-----------------------------------------------+");
            System.out.println("Jumlah stock Bahan Pokok : "+sbp.jumlahstock(gl,brs,myk));
        }
    }
}

