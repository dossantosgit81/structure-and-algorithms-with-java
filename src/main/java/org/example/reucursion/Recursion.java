package org.example.reucursion;

public class Recursion {

    public int fibIterative(int n){
        if(n < 1)
            return 0;
        if(n <= 2)
            return 1;
        int fibMinus2 = 0;
        int fibMinus1 = 1;
        int fibN = n;
        for (int i = 2; i<=n; i++ ){
            fibN = fibMinus1 + fibMinus2;
            fibMinus2 = fibMinus1;
            fibMinus1 = fibN;
        }
        return fibN;
    }

    /*
    * Pelo o que entendi, para cada rodada eu vou precisar x + y.
    * Só que a execução do computador não é linear como em loops.
    * então ele fará o cálculo de toda linha de execução quando n = 5 para x
    * depois n = 4 para x
    * depois n = 3 para x e n = 3 y
    * então, ele devolve o resuultado para linha de execução de x, que é a soma de x + y para 3, que seria 2 para 5
    * então ele volta com 2 para x e cálcula n = 4 para y
    * a soma retorna 3 quando x = 4
    * então retorna 2 para x quando n = 5
    * então retorna o resultado final da soma entre x + y
    * neste caso x = 3 e y = 2
    * Resultando em 5
    * */
    public int fibRecursion(int n){
        if(n < 1) return 0;
        if(n <= 2) return 1;
        int x = fibRecursion(n-1);

        int y = fibRecursion(n-2);
        return x + y;
    }
}
