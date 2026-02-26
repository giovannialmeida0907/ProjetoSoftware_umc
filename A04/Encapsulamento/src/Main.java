import entidades.Conta;
    public class Main {
        public static void main(String[] args) {
            Conta conta = new Conta("Pedro", 2000.00);

            conta.titular = "Julio";
            conta.saldo = 200.00;

            System.out.println(conta.titular);
            System.out.println(conta.saldo);
        }
}
