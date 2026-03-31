package LDECircular;

public class Main {
    public static void main(String[] args) {

        DECircular lista = new DECircular();

        // Inserindo elementos
        lista.Inserir(10, 0);
        lista.Inserir(20, 1);
        lista.Inserir(30, 2);
        lista.Inserir(5, 0);
        lista.Inserir(15, 2);

        System.out.println("Lista após inserções:");
        imprimir(lista);

        // Removendo elementos
        lista.Excluir(0); // remove 5
        lista.Excluir(2); // remove 20
        lista.Excluir(lista.TSize() - 1);

        System.out.println("\nLista após remoções:");
        imprimir(lista);

        if (lista.TSize() > 0) {
            System.out.println("\nPrimeiro: " + lista.primeiro.getelemento());
            System.out.println("Último: " + lista.primeiro.getAnterior().getelemento());
        }
    }
    public static void imprimir(DECircular lista ){

            if (lista.TSize() == 0) {
                System.out.println("Lista vazia");
                return;
            }

            Nodo atual = lista.primeiro;

            for (int i = 0; i < lista.TSize(); i++) {
                System.out.print(atual.getelemento() + " ");
                atual = atual.getProximo();
            }

            System.out.println();
        }
    }


