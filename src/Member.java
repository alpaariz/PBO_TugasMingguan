import java.util.Scanner;
public class Member {
    public int id_member;
    public String nama_member;
    public String alamat;
    public long no_telp;
    public void insert_data() {
        Scanner input = new Scanner(System.in);
        System.out.println("Data Member");
        System.out.print("Masukan ID Member : ");
        id_member = input.nextInt();
        System.out.print("Masukan Nama Member : ");
        nama_member = input.next();
        System.out.print("Masukan Alamat Member : ");
        alamat = input.next();
        System.out.print("Masukan Nomor Telepon : ");
        no_telp = input.nextLong();
    }
}

