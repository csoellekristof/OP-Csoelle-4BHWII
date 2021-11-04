public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println(summenFunktion(5));
        System.out.println(factorial(5));
        System.out.println(potenzFunktion(2, 8));


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
}
