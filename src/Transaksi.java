import java.sql.SQLOutput;
import java.util.Scanner;
public class Transaksi {
    private int tanggal_beli;
    private int jumlah_barang;
    private int pilih, bayar;

    Scanner input = new Scanner(System.in);
    Member Member = new Member();
    Bahan_pokok Bahan_pokok = new Bahan_pokok();

    public Transaksi() {
        System.out.print("  Jumlah Pembayaran ");
    }
    public Transaksi(String note) {
        System.out.print(note);
    }

    public void pilih_bahanPokok() {
        System.out.print("Masukan ID Bahan Pokok yang anda pilih : ");
        pilih = input.nextInt();
        if (pilih==011) {
            Bahan_pokok.setId_bahanpokok(011);
            Bahan_pokok.setNama_bahanpokok("Beras");
            Bahan_pokok.setHarga(22000);
        }
        else if (pilih==012) {
            Bahan_pokok.setId_bahanpokok(012);
            Bahan_pokok.setNama_bahanpokok("Beras");
            Bahan_pokok.setHarga(35000);
        }
        else if (pilih==013) {
            Bahan_pokok.setId_bahanpokok(013);
            Bahan_pokok.setNama_bahanpokok("Beras");
            Bahan_pokok.setHarga(35000);
        }
        else if (pilih==014) {
            Bahan_pokok.setId_bahanpokok(014);
            Bahan_pokok.setNama_bahanpokok("Beras");
            Bahan_pokok.setHarga(62000);
        }
        else if (pilih==015) {
            Bahan_pokok.setId_bahanpokok(015);
            Bahan_pokok.setNama_bahanpokok("Beras");
            Bahan_pokok.setHarga(56000);
        }
        else if (pilih==021) {
            Bahan_pokok.setId_bahanpokok(021);
            Bahan_pokok.setNama_bahanpokok("Gula");
            Bahan_pokok.setHarga(13500);
        }
        else if (pilih==022) {
            Bahan_pokok.setId_bahanpokok(022);
            Bahan_pokok.setNama_bahanpokok("Gula");
            Bahan_pokok.setHarga(23500);
        }
        else if (pilih==023) {
            Bahan_pokok.setId_bahanpokok(023);
            Bahan_pokok.setNama_bahanpokok("Gula");
            Bahan_pokok.setHarga(69900);
        }
        else if (pilih==024) {
            Bahan_pokok.setId_bahanpokok(024);
            Bahan_pokok.setNama_bahanpokok("Gula");
            Bahan_pokok.setHarga(59000);
        }
        else if (pilih==025) {
            Bahan_pokok.setId_bahanpokok(025);
            Bahan_pokok.setNama_bahanpokok("Gula");
            Bahan_pokok.setHarga(25000);
        }
        else if (pilih==031) {
            Bahan_pokok.setId_bahanpokok(031);
            Bahan_pokok.setNama_bahanpokok("Minyak Goreng");
            Bahan_pokok.setHarga(25700);
        }
        else if (pilih==032) {
            Bahan_pokok.setId_bahanpokok(032);
            Bahan_pokok.setNama_bahanpokok("Minyak Goreng");
            Bahan_pokok.setHarga(20000);
        }
        else if (pilih==033) {
            Bahan_pokok.setId_bahanpokok(033);
            Bahan_pokok.setNama_bahanpokok("Minyak Goreng");
            Bahan_pokok.setHarga(24000);
        }
        else if (pilih==034) {
            Bahan_pokok.setId_bahanpokok(034);
            Bahan_pokok.setNama_bahanpokok("Minyak Goreng");
            Bahan_pokok.setHarga(21000);
        }
        else if (pilih==035) {
            Bahan_pokok.setId_bahanpokok(035);
            Bahan_pokok.setNama_bahanpokok("Minyak Goreng");
            Bahan_pokok.setHarga(20000);
        }
        else {
            System.out.println("Maaf pilihan menu sewa tidak tersedia.");
            pilih_bahanPokok();
        }
    }
    void insert_data() {
        System.out.println("");
        System.out.println("Detail Pembelian");
        System.out.print("Masukan tanggal Beli : ");
        tanggal_beli = input.nextInt();
        System.out.print("Jumlah Barang :");
        jumlah_barang = input.nextInt();
    }
    public int jumlah(int a, int b) {
        return a+b;
    }
    public int jumlah(int c, int d, int e) {
        return (c*d)+(d*e);
    }
    protected int jumlah(int f) {
        return f-jumlah(jumlah_barang, Bahan_pokok.getHarga());
    }

    public void view_data() {
        System.out.println("");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|              Detail Pembelian                 |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("| Nama Barang    : - "+ Bahan_pokok.getNama_bahanpokok()+ " "+ Bahan_pokok.getNama_bahanpokok());
        System.out.println("| Tanggal Beli   : "+tanggal_beli);
        System.out.println("| Jumlah         : "+jumlah_barang);
        System.out.println("+-----------------------------------------------+");
        System.out.println("| Harga          : "+ Bahan_pokok.getHarga());
        System.out.println("| Total          : "+jumlah(jumlah_barang, Bahan_pokok.getHarga()));
        System.out.println("| Bayar          : ");
        bayar = input.nextInt();
        System.out.println("+-----------------------------------------------+");
    }
    public void cetak_data() {
        System.out.println("");
        System.out.println("+-----------------------------------------------+");
        System.out.println("|               Struct Pembelian                |");
        System.out.println("+-----------------------------------------------+");
        System.out.println("| Nama Pembeli   : "+Member.nama_member);
        System.out.println("| Alamat         : "+Member.alamat);
        System.out.println("| No Telepon     : "+Member.no_telp);
        System.out.println("| Tanggal Beli   : "+tanggal_beli);
        System.out.println("+-----------------------------------------------+");
        System.out.println("| Nama Barang    : - "+ Bahan_pokok.getId_bahanpokok()+" "+Bahan_pokok.getNama_bahanpokok());
        System.out.println("| Jumlah         : "+jumlah_barang);
        System.out.println("| Harga          : "+Bahan_pokok.getHarga());
        System.out.println("| Kembalian      : "+jumlah(bayar));
        System.out.println("+-----------------------------------------------+");
    }
}
