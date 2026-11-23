public class Main {
    public static void main(String[] args) {
        PedidoFacade pedidos = new PedidoFacade();

        System.out.println("=== Pedido valido ===");
        boolean sucesso = pedidos.processarPedido(new Produto(1, "Notebook"));
        System.out.println("Resultado: " + sucesso);

        System.out.println();

        System.out.println("=== Pedido invalido ===");
        boolean falha = pedidos.processarPedido(new Produto(0, ""));
        System.out.println("Resultado: " + falha);
    }
}
