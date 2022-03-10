public class ListaDeExercicios4 {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Impressora", 13, 6);
        Estoque estoque2 = new Estoque("Monitor", 11, 13);
        Estoque estoque3 = new Estoque("Mouse", 6, 2);

        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);

        System.out.println("Estoque 1 precisa repor: " + estoque1.precisaRepor() +
                           "\nEstoque 2 precisa repor: " + estoque2.precisaRepor() +
                           "\nEstoque 3 precisa repor: " + estoque3.precisaRepor());

        System.out.println("\nEstoque 1 - " + estoque1.mostra() +
                           "\nEstoque 2 - " + estoque2.mostra() +
                           "\nEstoque 3 - " + estoque3.mostra());
    }
}
