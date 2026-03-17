package LEncadeada;

public class Nodo {
    private Nodo proximo;
    private int valor;

    public Nodo(int valor){
        proximo = null;
        this.valor = valor;
    }
    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
