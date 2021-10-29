package parteE02ColeccionesEquals;

class ClienteBanco {
    public static void main(String[] args) {
        private String nombre;
        private String nroCuenta; // como no vamos a realizar operaciones es texto
        private double saldo;
        private int dni;

    public ClienteBanco(String nombre, String nroCuenta, double saldo, int dni) {
            this.nombre = nombre;
            this.nroCuenta = nroCuenta;
            this.saldo = saldo;
            this.dni = dni;
        }


        @Override
        public boolean equals(Object obj) {

            ClienteBanco other = (ClienteBanco) obj;

            if (obj instanceof ClienteBanco) {
                if (this.dni == other.dni) return true;
                else return false;
            } else {
                return false;
            }
        }
    }

}