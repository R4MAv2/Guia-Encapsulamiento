package genc.GENC.src;

class CajaDeAhorro {
    private String nombreDeUsuario;
    private double saldo;

    /**
     * post: la instancia queda asignada al titular indicado
     * y con saldo igual a 0.
     */
    public CajaDeAhorro(String titularDeLaCuenta) {
        nombreDeUsuario = titularDeLaCuenta;
        saldo = 0;
    }

    /**
     * post: devuelve el nombre del titular de la Caja de Ahorro.
     */
    public String obtenerTitular() {
        return nombreDeUsuario;
    }

    /**
     * post: devuelve el saldo de la Caja de Ahorro.
     */
    public double consultarSaldo() {
        return saldo;
    }

    /**
     * pre : monto es un valor mayor a 0.
     * post: aumenta el saldo de la Caja de Ahorro según el monto
     * depositado.
     */
    public void depositar(double monto) {
        if (monto <= 0) {
            throw new Error("No puede agregar saldo negativo.");
        }
        saldo += monto;
    }

    /**
     * pre : monto es mayor a 0 y menor o igual que el saldo de la
     * Caja de Ahorro.
     * post: disminuye el saldo de la Caja de Ahorro según el monto
     * extraído.
     */
    public void extraer(double monto) {
        if (monto <= 0 || monto > saldo) {
            throw new Error("No puede retirar porque no tiene saldo y/o puso un monto negativo.");
        }
        saldo -= monto;
    }
}
