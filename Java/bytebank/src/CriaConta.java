public class CriaConta {
    public static void main(String[] args) {

        Conta contaOrigem = new Conta();
        Conta contaDestino = new Conta();

        contaOrigem.deposita(220);
        System.out.println(contaOrigem.saldo);

        contaOrigem.transfere(80, contaDestino);
        System.out.println(contaDestino.saldo);

        contaOrigem.saca(45);
        System.out.println(contaOrigem.saldo);
    }
}
