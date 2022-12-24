public class BayarBarang extends Pembayaran{

    BayarBarang(int biaya){
        super(biaya);
    }

    @Override
    int pembayaran() {
        return super.getBiaya();
    }
}