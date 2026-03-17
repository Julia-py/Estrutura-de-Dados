package LEncadeada;

public class Encadeada {
        Nodo primeiro;
        private int tamanho;
        public Encadeada() {
            this.primeiro = null;
            this.tamanho = 0;
        }

        public void Adicionar(int valor) {
            Nodo novo = new Nodo(valor);
            if (primeiro == null) {
                primeiro = novo;
            } else{
                Nodo atual = primeiro;
                while (atual.getProximo() != null) {
                    atual= atual.getProximo();
                }
               atual.setProximo(novo);
            }
            tamanho++;
        }


        public void add(int index, int elemento){
            if(index < 0 || index > tamanho){
                return;
            }
            else if(index == 0){
                Nodo novo = new Nodo(elemento);
                novo.setProximo(primeiro);
                primeiro = novo;
            }else{
                Nodo novo = new Nodo(elemento);
                Nodo anterior = get(index - 1);
                novo.setProximo(anterior.getProximo());
                anterior.setProximo(novo);
            }
            tamanho ++;
        }

        public void Remover(int index){
            if(index < 0 || index >= tamanho){
                return;
            }
            if (index == 0){
                primeiro = primeiro.getProximo();
            }else{
              Nodo anterior = get(index -1);
              Nodo atual = anterior.getProximo();

              anterior.setProximo(atual.getProximo());
            }
            tamanho --;
        }

        public int Size(){
            return tamanho;
        }
        public Nodo get(int index) {
            if (index<0 ||index >= tamanho){
                return null;
            }
            Nodo atual = primeiro;
            for(int i = 0; i< index; i++){
                atual = atual.getProximo();
            }
            return atual;
        }
}

