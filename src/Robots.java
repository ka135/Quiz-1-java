public class Robots {
    /* Atributos*/

    String tipo;
    String accion;
    String Color;
    int numero_de_ruedas;

    public Robots(String tipo, String accion, String Color, int numero_de_ruedas) {
        this.tipo = tipo;
        this.accion = accion;
        this.Color = Color;
        this.numero_de_ruedas = numero_de_ruedas;

        /**
         * Método constructor para inicializar la clase
         * @para tipo el tipo del robot
         * @para accion la axion del robot
         * @para Color el color del robot
         * @para numero_de_ruedas el numero de ruedas del robot
         *
         */

    }

    void funcionar(){
        System.out.println("Es un "+ tipo + " robot, es de color "+ Color +", tiene "+ numero_de_ruedas +" ruedas y esta "+ accion);
    }
}