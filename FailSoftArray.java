/* Esta classe implementa um array "resistente a falha"
   que impede a ocorrência de erros de tempo de execução */

class FailSoftArray {
    private int a[]; // referência ao array
    private  int errval; // valor a ser retornado se get() falhar
    public int lenght; // lenght é publica


    /*Constrói o array dados seu tamanho e o valor
    a ser retornado se get() falhar */
    public FailSoftArray(int size, int errv) {
        a = new int[size];
        errval = errv;
        lenght = size;
    }

    // Retornao valor do índice especificado.
    public int get(int index) {
        if(indexOK(index)) return a[index]; //
        return errval;
    }

    // Insere um valor em um índice. Retorna false em caso de falha.
    public boolean put(int index, int val){
        if(indexOK(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }

    // Retorna true se index estiver dentro dos limites.

    private boolean indexOK(int index) {
        if(index >= 0 & index < lenght) return true;
        return false;

    }
}

// Demonstra o array resistente a falha
class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // exibe falhas silenciosas
        System.out.println("Fail quietly. ");

        for(int i = 0; i < (fs.lenght * 2); i++)
            fs.put(i, i*10);

        for(int i = 0; i < (fs.lenght * 2); i ++) {
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
        }
        System.out.println("");

        // agora, tratar as falhas
        System.out.println("\nFail with error reports. ");
        for(int i = 0; i < (fs.lenght * 2); i ++)
            if(!fs.put(i, i * 10))
                System.out.println("index " + i + " out-of-bounds");

        for( int i = 0; i < (fs.lenght * 2 ); i  ++) {
            x = fs.get(i);
            if(x != -1 ) System.out.print(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds");
        }

    }
}
