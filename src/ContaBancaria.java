public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double utilizadoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }
        this.utilizadoChequeEspecial = 0;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return chequeEspecial;
    }

    public void depositar(double valor) {
        saldo += valor;
        if (utilizadoChequeEspecial > 0) {
            double taxa = utilizadoChequeEspecial * 0.2;
            double totalDevido = utilizadoChequeEspecial + taxa;
            if (saldo >= totalDevido) {
                saldo -= totalDevido;
                utilizadoChequeEspecial = 0;
            }
        }
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else if (saldo + chequeEspecial - utilizadoChequeEspecial >= valor) {
            double falta = valor - saldo;
            saldo = 0;
            utilizadoChequeEspecial += falta;
            return true;
        }
        return false;
    }

    public boolean pagarBoleto(double valor) {
        return sacar(valor);
    }

    public boolean usandoChequeEspecial() {
        return utilizadoChequeEspecial > 0;
    }
}