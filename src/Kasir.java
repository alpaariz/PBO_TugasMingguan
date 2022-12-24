import java.util.Scanner;

public class Kasir {
    public int id_Kasir;
    public String nama_Kasir;
    private String username;
    private String password;

    public void insert_data() {
        Scanner input = new Scanner(System.in);
        System.out.println("Data Kasir");
        System.out.print("Masukan ID Kasir      : ");
        id_Kasir = input.nextInt();
        System.out.print("Masukan Nama Kasir    : ");
        nama_Kasir = input.next();
    }

    public final String getUsername() {
        return "a";
    }
    public final String getPassword() {
        return "aa";
    }
}
