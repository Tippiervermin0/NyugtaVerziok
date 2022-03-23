package nyugtaprojektek;

public class Nyugta3 {

    public static void main(String[] args) {
        
        String csillagok = "********************", duplaVonal = "====================",szaggatottVonal = "--------------------", rovidVonal = "_______";        
        
        System.out.println(csillagok);
        System.out.printf("%14s\n", "Nyugta 3");
        System.out.println(csillagok);
        
        final String HUF = "Ft", eur = "\u20ac";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320, osszesen = tetel1 + tetel2 + tetel3;

        System.out.printf("%10s: %5d %s\n", "Tétel 1", tetel1, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 2", tetel2, HUF);
        System.out.printf("%10s: %5d %s\n", "Tétel 3", tetel3, HUF);
        System.out.println(duplaVonal);
        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, HUF);
        System.out.println(szaggatottVonal);
        
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        int fizetendo = osszesen + szervizDij;
        double euro = fizetendo / 350.0;
        
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, HUF);
        System.out.printf("(%d%%)\n", szervizDijMertek);       
        System.out.println(duplaVonal);
        System.out.printf("%10s:  %d %s\n", "Fizetendő", fizetendo, HUF);       
        System.out.printf("%10s%7.2f %s\n","", euro, eur);//      
        System.out.printf("%s\n\n",szaggatottVonal);                       
        System.out.print(rovidVonal);
        System.out.printf("%13s\n",rovidVonal);        
        System.out.printf("%6s","Dátum");     
        System.out.printf("%13s","Név\n");        
        System.out.println(csillagok);    
        System.out.printf("%12s","CÉG\n");
        System.out.println(csillagok);
    }

}
