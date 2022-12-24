public class Bahan_pokok {
    protected int id_bahanpokok;
    protected String nama_bahanpokok;
    protected int harga;

    public int getId_bahanpokok() {
        return id_bahanpokok;
    }

    public void setId_bahanpokok(int id_bahanpokok) {
        this.id_bahanpokok = id_bahanpokok;
    }

    public String getNama_bahanpokok() {
        return nama_bahanpokok;
    }

    public void setNama_bahanpokok(String nama_bahanpokok) {
        this.nama_bahanpokok = nama_bahanpokok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    protected void view_data() {
        Beras Beras = new Beras();
        Minyak_goreng Minyak_goreng = new Minyak_goreng();
        Gula Gula = new Gula();
        System.out.println("+----------------------------------------------+");
        System.out.println("|                 Dartar Bahan Pokok           |");
        System.out.println("+----------------------------------------------+");
        System.out.println("| ID |    Bahan Pokok           |    Harga     |");
        System.out.println("+----------------------------------------------+");
        Beras.view_data();
        Minyak_goreng.view_data();
        Gula.view_data();
        System.out.printf("+----------------------------------------------+");
    }
    public String note() {
        return "Daftar Bahan Pokok";
    }
}
