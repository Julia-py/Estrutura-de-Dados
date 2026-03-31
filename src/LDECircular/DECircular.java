package LDECircular;



public class DECircular {
    Nodo primeiro;
    private int Tlista;

    public DECircular() {
        this.primeiro = null;
        Tlista = 0;
    }

    public int TSize() {
        return Tlista;
    }

    public Nodo get(int index) {
        if (index < 0 || index >= Tlista) {
            return null;
        }
        Nodo atual = primeiro;
        for (int i = 0; i < index; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void Inserir(int elemento, int index) {
        Nodo novo = new Nodo(elemento);

        if (Tlista == 0) { // vazio
            primeiro = novo;
            novo.setProximo(novo);
            novo.setAnterior(novo);

        } else if (index == 0) { //inicio
            Nodo prox = get(Tlista- 1);

            novo.setProximo(primeiro);
            novo.setAnterior(prox);
            primeiro.setAnterior(novo);
            prox.setProximo(novo);
            primeiro = novo;

        } else if ( index == Tlista ){
            Nodo prox = get(Tlista -1);
            novo.setProximo(primeiro);
            novo.setAnterior(prox);
            prox.setProximo(novo);
            primeiro.setAnterior(novo);

        }else { //meio
            Nodo anterior = get(index - 1);
            Nodo proximo = anterior.getProximo();
            novo.setProximo(proximo);
            novo.setAnterior(anterior);
            anterior.setProximo(novo);
            proximo.setAnterior(novo);
        }
        Tlista++;
    }

    // refazer o excluir
    public void Excluir(int index) {
        if (index < 0 || index >= Tlista) {
            return;
        }
        if (Tlista == 1) {
            primeiro = primeiro;

        } else if (index == 0){

            Nodo prox = get(Tlista - 1);
            primeiro = primeiro.getProximo();
            prox.setProximo(primeiro);
            primeiro.setAnterior(prox);

        }else{
            Nodo ant = get(index - 1);
            Nodo atual = ant.getProximo();
            Nodo prox = atual.getProximo();

            ant.setProximo(prox);
            prox.setAnterior(ant);
        }
        Tlista--;
    }
}