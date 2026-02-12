public class ProcessusCalcul {

    public static void main(String[] argv) {
        int n = 6;
        int puiss = 3;
        int x = 100;
        Calcul calc = new Calcul();
        Logger log = new Logger();

        int resFact;
        resFact = calc.factorial(n);

        int resSqrt;
        resSqrt = calc.sqrt(resFact);

        int resPower;
        resPower = calc.power(resSqrt, puiss);

        int resDiv;
        resDiv = calc.division(resPower, x);
        log.printValue(resDiv);







    }
}
