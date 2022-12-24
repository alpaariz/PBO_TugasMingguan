public class StokBahanPokok implements Stok{
    @Override
    public int jumlahstock(int gl, int myk, int brs) {
        return gl+myk+brs;
    }
}
