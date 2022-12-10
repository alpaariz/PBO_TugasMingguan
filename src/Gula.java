public class Gula extends Bahan_pokok{
    String[] merek_Gula = {"Manis Kita", "Gulaku Premium White", "Tropicana Slim Classic", "Tropicana Slim Gula Jawa", "Halus Rosebrand"};
    public final void view_data(){
        System.out.println("-----------------------------------------------------");
        System.out.println(" 021               Gula                    13.500");
        System.out.println(" Merek Gula  : " + merek_Gula[0]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 022               Gula                    23.500");
        System.out.println(" Merek Gula  : " + merek_Gula[1]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 023               Gula                    69.900");
        System.out.println(" Merek Gula  : " + merek_Gula[2]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 024               Gula                    59.000");
        System.out.println(" Merek Gula  : " + merek_Gula[3]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 025               Gula                    25.000");
        System.out.println(" Merek Gula  : " + merek_Gula[4]);
    }
    public String note() {
        return " - Bahan Pokok Gula";
    }
}
