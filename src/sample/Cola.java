package sample;

public class Cola {
    Controller c = new Controller();
    private Nodo frente;
    private Nodo top;
    public Cola() {
        this.frente = null;

    }

    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (frente == null) {
            frente = nuevo;
        } else {
            Nodo temp = frente;
            while (temp.getProximo() != null) {
                temp = temp.getProximo();
            }
            temp.setProximo(nuevo);
        }
    }

    public Object mostrar() {
        if (frente != null) {
            Nodo temp = frente;
            while (temp != null) {
                temp = temp.getProximo();
                return temp.getValor();
            }
            return temp.getValor();
        } else {
            return "vacia";
        }
    }

    public int extraer() {
        if (frente == null) {
            return 0;
        } else {
            int valorExtraer = frente.getValor(); //variable temporal
            System.out.println("Valor extraido: " + frente.getValor());
            frente = frente.getProximo(); //cambiar el frente por el siguiente
            return valorExtraer; //devolver el valor extraido de la cola
        }
    }
    public void buscar(int busqueda){
        try {
            Nodo temp = top;
            int posicion =1;
            if(temp.getValor() == busqueda) {
                System.out.println("Valor en la posicion 0");
            }
            else{
                while(temp != null){
                    if (temp.getProximo().getValor()== busqueda){
                        System.out.println("Valor en la posicion " + posicion);
                        break;
                    }
                posicion ++;
                    temp = temp.getProximo();
                }


                }

        }finally {
            System.out.println("");
        }
    }
}
