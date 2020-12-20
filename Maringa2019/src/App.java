public class App {
    public static void main(String[] args) throws Exception {
        //declara três constantes do programa
        final double HAB = 423666, MULHER = 217000, VEICULO = 327000;

        //declara três variáveis reais do programa
        double PercF, PercM, VeiHab;

        //{Processamentos dos dados}
        PercM = ((HAB - MULHER) / HAB) * 100; // % de homens
        PercF = 100 - PercM; //% de mulheres
        VeiHab = VEICULO / HAB; //razão: veículos por habitante

        //{Saída das informações}
        System.out.println("Percentual de homens..: " + PercM + "%");
        System.out.println("Percentual de mulheres: " + PercF + "%");
        System.out.println("Veículos por habitante: " + VeiHab);
    }
}
