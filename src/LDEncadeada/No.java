package LDEncadeada;

public  class No {
    private int elemento;
    private No anterior;
    private No proximo;

    public No(int elemento){
        proximo = null;
        anterior = null;
        this.elemento = elemento;
    }
    public No getProximo() {
        return proximo;
    }
    public No getAnterior() {return anterior;}

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    public int getelemento() {
        return elemento;
    }


    public int getElemento() {
        return elemento;
    }




}
