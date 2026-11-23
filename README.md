# Logística - Padrão Facade

Simulação do atendimento de pedidos de uma loja de comércio eletrônico em Java usando o padrão Facade.

A classe `PedidoFacade` esconde do cliente os três serviços (`ServicoEstoque`, `ServicoPagamento` e `ServicoRemessa`) e executa o fluxo na ordem: verificar estoque, processar pagamento e enviar produto. Se o estoque ou o pagamento falhar, o pedido é interrompido.

## Como compilar

```
javac -d out src/*.java
```

## Como executar

```
java -cp out Main
```
