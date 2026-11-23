public class ServicoEstoque {
    public static boolean isAvailable(Produto product) {
        System.out.println("Estoque: verificando disponibilidade do produto...");
        if (product == null || product.productId <= 0 || product.name == null || product.name.trim().isEmpty()) {
            System.out.println("Estoque: produto invalido ou indisponivel.");
            return false;
        }
        System.out.println("Estoque: produto disponivel.");
        return true;
    }
}
