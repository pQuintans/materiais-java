public class ListaDeExercicios4 {
    public static void main(String[] args) {
        SimuladorCaixaBanco caixa1 = new SimuladorCaixaBanco(1);
        SimuladorCaixaBanco caixa2 = new SimuladorCaixaBanco(2);
        caixa1.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa2.proximoAtendimento();
        caixa2.proximoAtendimento();
        caixa2.proximoAtendimento();
        caixa1.proximoAtendimento();
        caixa2.proximoAtendimento();
        caixa1.proximoAtendimento();
    }
}
