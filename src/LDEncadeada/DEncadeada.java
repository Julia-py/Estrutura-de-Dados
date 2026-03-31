package LDEncadeada;
/*•Crie o objeto do NodoDuplo (valor, prox e ant)
•Crie o Objeto da ListaDEncadeada
•Precisa ter o primeiro e tamanho (variáveis)
•O size retorna o tamanho da lista
•O add (elemento) adiciona no final da lista
•O get (index) – retorna o nodo na posição (ou null se não tem aquela posição)
•O add (index, elemento) adiciona na posição pedida (lembrar de checar o primeiro)
•O remove (index) remove o elemento daquele index da lista*/



public class DEncadeada {
    No primeiro;
    private int Tlista;

    public DEncadeada() {
        this.primeiro = null;
        Tlista = 0;
    }

    public int TSize() {
        return Tlista;
    }

    public No get(int index) {
        if (index < 0 || index >= Tlista) {
            return null;
        }
        No atual = primeiro;
        for (int i = 0; i < index; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void Inserir(int elemento, int index) {
        No novo = new No(elemento);
        if (index < 0 || index > Tlista) {
            return;
            //lista vazio
        } else if (index == 0) { // inicio
            if (primeiro != null) {
                primeiro.setAnterior(novo);
            }
            novo.setProximo(primeiro);
            novo.setAnterior(null);
            primeiro = novo;

        } else if (index == Tlista) { //final
            No anterior = get(index - 1);
            anterior.setProximo(novo);
            novo.setAnterior(anterior);
            novo.setProximo(null);

        } else { //meio
            No anterior = get(index - 1);
            No proximo = get(index);
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
        if (index == 0) {

            if (Tlista == 1) {
                primeiro = null;
            } else {
                No ultimo = get(Tlista - 1);
                primeiro = primeiro.getProximo();
                ultimo.setProximo(primeiro);
            }

        } else {

            No anterior = get(index - 1);
            No atual = anterior.getProximo();
            anterior.setProximo(atual.getProximo());
        }
        Tlista--;
    }
}
