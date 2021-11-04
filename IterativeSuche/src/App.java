public class App {
    

    //probe
    public static void main(String[] args) throws Exception {
        
        int[] zahlen = {1, 2 ,4 ,5 ,6 , 56, 78};
        int result = sucheIterativ(3, zahlen);

        if(result != -1 ){
               
            System.out.println("Die Zahl " + result + " wurde gefunden!");


        }
        else{

            System.out.println("Ihre Zahl konnte nicht gefunden werden!");


        }
        
        

    }


    public static int sucheIterativ(int zahl, int[] mListe){

        int links = 0; //Linke Grenze
        int rechts = mListe.length -1; //Rechte Grenze

        while(links <= rechts){
            
            int mitte = links + (rechts-links) / 2;  //Mitte zwischen den Grenzen


            if(mListe[mitte] == zahl){

                return zahl;
            }
            
            if(mListe[mitte] < zahl){

                links = mitte + 1;

            }

            else if(mListe[mitte] > zahl){

                rechts = mitte - 1;

            }


        }

            
        return -1;
    }
}
