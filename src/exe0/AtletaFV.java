package exe0;

public class AtletaFV implements JogadorFutebol, JogadorVolei{
    @Override
    public void baterPenalti() {
        System.out.println("AtletaFV bateu o penalti");
    }

    @Override
    public void baterEscanteio() {
        System.out.println("AtletaFV bateu o escanteio");
    }

    @Override
    public void sacar() {
        System.out.println("AtletaFV sacou");
    }

    @Override
    public void cortar() {
        System.out.println("AtletaFV cortou");
    }
}
