package br.com.celsius.abstração;

public class ContaBancaria {
    private String titular;
    private int numConta;
    private double saldo = 1250.0;


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void sacar(double saque){
        if (saque > saldo) {
            System.out.println("Impossivel realizar seu saque");
        }else{
                saldo -= saque;
                System.out.println("òtimo, agora seu saldo é de: " + saldo);
            }
    }
        public void deposito(double valor){
            if (valor < 0) {
                System.out.println("Impossivel depositar um valor negativo, tente novamente");}
            else {
                saldo += valor;

                System.out.println("òtimo, seu saldo agora é de: " + saldo);
            }
            }
}
