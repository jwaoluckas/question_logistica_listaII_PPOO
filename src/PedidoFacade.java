public class PedidoFacade {
    public boolean processarPedido(Produto produto) {
        if (!ServicoEstoque.isAvailable(produto)) {
            System.out.println("Pedido cancelado: produto sem estoque.");
            return false;
        }
        if (!ServicoPagamento.makePayment()) {
            System.out.println("Pedido cancelado: pagamento recusado.");
            return false;
        }
        ServicoRemessa.shipProduct(produto);
        System.out.println("Pedido concluido com sucesso.");
        return true;
    }
}
