package LDECircular;

public class Nodo {
    private int elemento;
    private Nodo anterior;
    private Nodo proximo;

    public Nodo(int elemento){
        proximo = null;
        anterior = null;
        this.elemento = elemento;
    }
    public Nodo getProximo() {
        return proximo;
    }
    public Nodo getAnterior() {return anterior;}

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    public int getelemento() {
        return elemento;
    }




}


