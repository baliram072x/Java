public class BinomialCoefficient {
    public static int factorial(int n ){
        int f = 1;
        for(int i =1 ; i<=n; i++){
            f = f*i;

        }
        return f;
        }

        public static int Binomial(int n , int r ){
            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_nmr = factorial(n-r);

            int bincoeffiecient = fact_n/ (fact_r*fact_nmr);
            return bincoeffiecient;

        }

    public static void main(String[] args){
        System.out.println(Binomial(5, 2));
    }
    }