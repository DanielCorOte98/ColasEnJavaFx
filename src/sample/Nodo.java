package sample;

public class Nodo {
    private int valor;
    private Nodo proximo;

    public Nodo(){
        this.valor=0;
        this.proximo=null;
    }

    public Nodo(int valor){
        this.valor=valor;
        this.proximo=null;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getProximo() {
        return proximo;
    }

}
