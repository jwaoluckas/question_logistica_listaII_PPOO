public class ServicoRemessa {
    public static void shipProduct(Produto product) {
        System.out.println("Remessa: conectando a logistica externa...");
        System.out.println("Remessa: produto " + product.name + " enviado para o cliente.");
    }
}
