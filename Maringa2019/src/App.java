public class App {
    public static void main(String[] args) throws Exception {
        //declara tr�s constantes do programa
        final double HAB = 423666, MULHER = 217000, VEICULO = 327000;

        //declara tr�s vari�veis reais do programa
        double PercF, PercM, VeiHab;

        //{Processamentos dos dados}
        PercM = ((HAB - MULHER) / HAB) * 100; // % de homens
        PercF = 100 - PercM; //% de mulheres
        VeiHab = VEICULO / HAB; //raz�o: ve�culos por habitante

        //{Sa�da das informa��es}
        System.out.println("Percentual de homens..: " + PercM + "%");
        System.out.println("Percentual de mulheres: " + PercF + "%");
        System.out.println("Ve�culos por habitante: " + VeiHab);
    }
}
