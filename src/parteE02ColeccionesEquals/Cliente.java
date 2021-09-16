package parteE02ColeccionesEquals;

class Cliente {

    private String nombre;
    private String nroCuenta; // como no vamos a realizar operaciones es texto
    private double saldo;
    private int dni;

    public Cliente(String nombre, String nroCuenta, double saldo, int dni) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", nroCuenta=" + nroCuenta + ", saldo=" + saldo + ", dni=" + dni + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    /*
     * Este método equals es el que sobreescribimos para poder comparar nuestros
     * objetos dentro de la colección
     */

    @Override
    public boolean equals(Object obj) {

        /*
         * esto es un castin del objeto obj para que se nos permita la comparación del segund if anidado
         */

        Cliente other = (Cliente) obj; // casting de objeto

        /*
         * instanceof nos permite determinar si el objeto obj que recibe ésta función como
         * parámetro es del tipo Cliente, para que no venga cualquier verdura.
         */

        if (obj instanceof Cliente) { //para ver que obj sea un objeto de tipo Cliente
            if (this.dni == other.dni) return true;
            else return false;
        } else {
            return false;
        }
    }

}
