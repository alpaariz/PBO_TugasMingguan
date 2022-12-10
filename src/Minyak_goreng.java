public class Minyak_goreng extends Bahan_pokok{
    String[] merek_Minyak = {"Tropical", "Bimoli", "Sania", "Fortune", "Curah"};
    public final void view_data(){
        System.out.println("-----------------------------------------------------");
        System.out.println(" 031               Minyak Goreng           25.700");
        System.out.println(" Merek Gula  : " + merek_Minyak[0]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 032               Minyak Goreng           20.000");
        System.out.println(" Merek Gula  : " + merek_Minyak[1]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 033               Minyak Goreng           24.000");
        System.out.println(" Merek Gula  : " + merek_Minyak[2]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 034               Minyak Goreng           21.000");
        System.out.println(" Merek Gula  : " + merek_Minyak[3]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 035               Minyak Goreng           20.000");
        System.out.println(" Merek Gula  : " + merek_Minyak[4]);
    }
    public String note() {
        return " - Bahan Pokok Minyak Goreng";
    }
}
