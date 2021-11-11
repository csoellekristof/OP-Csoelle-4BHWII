public class App {
    public static void main(String[] args) throws Exception {
        
        //System.out.println(summenFunktion(5));
        //System.out.println(factorial(5));
        //System.out.println(potenzFunktion(2, 8));

        final long timeStart = System.nanoTime();
		
		System.out.println(sum(1000));
		 	  
	    final long timeEnd = System.nanoTime();
	    System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart)/1000 + " Mikrosek.");

        

        final long timeStart2 = System.nanoTime();
		
		System.out.println(summenFunktion(1000));
		 	  
	    final long timeEnd2 = System.nanoTime();
	    System.out.println("Verlaufszeit der Schleife: " + (timeEnd2 - timeStart2)/1000 + " Mikrosek.");




        final long timeStart3 = System.nanoTime();
		
		System.out.println(summeIterativ(1000));
		 	  
	    final long timeEnd3 = System.nanoTime();
	    System.out.println("Verlaufszeit der Schleife: " + (timeEnd3 - timeStart3)/1000 + " Mikrosek.");

        


    }

    public static long summeEndRek(long m, long n) {
        if (n == 0) {
          return m;
        }
        else {
          return summeEndRek (m+n, n-1);
        }
      }
 public static long sum(long n) {
     return summeEndRek(0, n);
 }


    public static int summenFunktion(int number){

        if(number <= 1){
            return number;

        }

        return number + summenFunktion(number - 1);

    }

    public static int factorial(int number){

        if (number <= 1){

            return 1;
        }

        return number * factorial(number -1);


    }

    public static int potenzFunktion(int number, int hochzahl){

        if (hochzahl <= 0){

            return 1;

        }
        return (number * potenzFunktion(number, hochzahl -1));
    }

    public static int summeIterativ(int zahl){

        

        int value = zahl;

        while (zahl > 0){

            value += zahl-1;
            zahl = zahl-1;
        }
           

            
        return value;
    }
}
