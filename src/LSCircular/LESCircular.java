package LSCircular;


public class LESCircular {
    No primeiro;
    private int tamanho;
    public LESCircular() {
        this.primeiro = null;
        this.tamanho = 0;
    }
    public int Size(){
        return tamanho;
    }
    public No get(int index) {
        if (index<0 ||index >= tamanho){
            return null;
        }
        No atual = primeiro;
        for(int i = 0; i< index; i++){
            atual = atual.getProximo();
        }
        return atual;
    }

    public void add(int index, int elemento){// atualiza o ultimo
        No novo = new No(elemento);
        if(index < 0 || index > tamanho){// lista vazia
            return;
        }
        else if(index == 0){ // primeiro elemento
            if(tamanho == 0){
                primeiro = novo;
                novo.setProximo(primeiro);
            }else{
                No prox = get(tamanho - 1);
                novo.setProximo(primeiro);
                primeiro = novo;
                prox.setProximo(primeiro);
            }

        }else if(index == tamanho){ // ultimo elemento
            No prox = get(tamanho - 1);
            prox.setProximo(novo);
            novo.setProximo(primeiro);
        }else{ // meio
            No anterior = get(index - 1);
            novo.setProximo(anterior.getProximo());
            anterior.setProximo(novo);
        }
        tamanho ++;
    }

    public void Remover(int index){ //
        if(index < 0 || index >= tamanho){
            return;
        }
        if (index == 0){
            if (tamanho == 1){
                primeiro = null;
            }else{
                No prox = get(tamanho -1);
                primeiro= primeiro.getProximo();
                prox.setProximo(primeiro);
            }
        }else{
            No anterior = get(index -1);
            No atual = anterior.getProximo();
            anterior.setProximo(atual.getProximo());
        }
        tamanho --;
    }
}
