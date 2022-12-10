public class Beras extends Bahan_pokok{
    String[] merek_Beras = {"Organik Nusa", "Cap Bunga", "Rojolele", "Maknyus", "Sania"};
    public final void view_data(){
        System.out.println("-----------------------------------------------------");
        System.out.println(" 011               Beras                    22.000");
        System.out.println(" Merek Beras : " + merek_Beras[0]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 012               Beras                    35.000");
        System.out.println(" Merek Beras : " + merek_Beras[1]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 013               Beras                    35.000");
        System.out.println(" Merek Beras : " + merek_Beras[2]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 014               Beras                    62.000");
        System.out.println(" Merek Beras : " + merek_Beras[3]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 015               Beras                    56.000");
        System.out.println(" Merek Beras : " + merek_Beras[4]);
    }
    public String note(){
        return " - Bahan Pokok Beras";
    }
}
