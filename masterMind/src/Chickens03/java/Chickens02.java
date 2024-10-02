public class Chickens02 {
    private static String dailyAverage;

	public static void main(String[] args) {
        //Put your  code here

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
        
        int eierenMaandag = 100;
        int eierenDinsdag = 121;
        int eierenWoensdag = 117;
        
        int totaalAantalEieren = eierenMaandag + eierenDinsdag + eierenWoensdag;
        System.out.println(totaalAantalEieren);
        
        
        double gemiddeldeDagelijkseEieren = totaalAantalEieren / 3;
        System.out.println(gemiddeldeDagelijkseEieren);
        
        
        double maandelijkseGemiddeldeEieren = gemiddeldeDagelijkseEieren * 30;
        System.out.println( maandelijkseGemiddeldeEieren);
        
        double winstPerEi = 0.18;
        double maandelijkseWinst = totaalAantalEieren * winstPerEi;
        System.out.println(maandelijkseWinst);
    }
    
}
