package sample;


import javafx.scene.control.ListView;

public class Cola {
    Controller c = new Controller();
    private Nodo frente;
    private Nodo top;
    public Cola() {
        this.frente = null;

    }
    public int i=0;

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
        i++;
    }

    public void mostrar(ListView elementos){
        if( frente != null){
            Nodo temp = frente;
            System.out.println("Los valores de la cola son: ");
            while(temp != null){
                System.out.println(temp.getValor());
                elementos.getItems().addAll(temp.getValor());
                temp = temp.getProximo();

            }
        }else{
            System.out.println("La cola está vacía.");

        }

    }

    public int extraer() {
        if (frente == null) {
            return 0;
        } else {
            int valorExtraer = frente.getValor(); //variable temporal
            System.out.println("Valor extraido: " + frente.getValor());
            frente = frente.getProximo(); //cambiar el frente por el siguiente
            i=i-1;
            return valorExtraer;
            //devolver el valor extraido de la cola
        }
    }
    public int  tamano()
    {
       return i;
    }
    int posicion =1;

    public int buscar(int busqueda){
        posicion=1;
        try {
            Nodo temp = frente;
            if(temp.getValor() == busqueda) {
                return 0;
            }else{
                while(temp != null){
                    if (temp.getProximo().getValor()== busqueda){
                        return posicion++;

                    }
                    temp = temp.getProximo();
                    posicion ++;
                }


                }
                return posicion;
       }finally {
            System.out.println("¡Número o valor no encontrado!");
        }

    }
}
