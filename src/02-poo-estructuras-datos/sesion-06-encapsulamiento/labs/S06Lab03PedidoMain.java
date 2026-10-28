public class S06Lab03PedidoMain {
    public static void main(String[] args) {
        // TODO 6: Crear primerPedido y segundoPedido; mostrar el estado inicial de ambos.
        S06Pedido pedido1 = new S06Pedido();
        S06Pedido pedido2 = new S06Pedido();

        System.out.println("Pedido 1 inicial: " + pedido1.getEstado());
        System.out.println("Pedido 2 inicial: " + pedido2.getEstado());
        // TODO 7: Enviar primerPedido y luego intentar cancelarlo; consultar tras cada accion.
        System.out.println("Enviar pedido 1: " + pedido1.enviar());
        System.out.println("Pedido 1: " + pedido1.getEstado());
        System.out.println("Cancelar pedido 1: " + pedido1.cancelar());
        System.out.println("Pedido 1: " + pedido1.getEstado());

        // TODO 8: Cancelar segundoPedido y luego intentar enviarlo; consultar tras cada accion.
        System.out.println("Cancelar pedido 2: " + pedido2.cancelar());
        System.out.println("Pedido 2: " + pedido2.getEstado());
        System.out.println("Enviar pedido 2: " + pedido2.enviar());
        System.out.println("Pedido 2: " + pedido2.getEstado());
    }
}