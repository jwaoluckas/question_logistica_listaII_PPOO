public class PedidoFacade {
    public void processarPedido(Produto produto) {
        ServicoEstoque.isAvailable(produto);
        ServicoPagamento.makePayment();
        ServicoRemessa.shipProduct(produto);
    }
}
