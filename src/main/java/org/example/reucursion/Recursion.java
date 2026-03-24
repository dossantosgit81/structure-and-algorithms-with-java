package org.example.reucursion;

import java.util.HashMap;

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

    /*Exercícios */
    /*1. Contagem Regressiva*/
    public void countRegressive(int n){
        if(n < 0)
            return;
        System.out.println(n);
        countRegressive(n-1);
    }

    /*2. Soma de array*/
    /*
    * Neste método, estou retornando recursivamente a soma de um um elemento a seu adjacente
    *
    * */
    public int sumArrayRecursive(int[] arr, int index){
        if(index == arr.length-1) return arr[arr.length-1];
        else return arr[index] + sumArrayRecursive(arr, index+1);
    }

    /*
    * Neste método estou retornando da última string à string inicial recursivamente
    * */
    public String revertText(String text, int indexLast, int indexInit){
       if(indexLast == indexInit) return String.valueOf(text.charAt(indexInit));
       else return text.charAt(indexLast) + revertText(text, indexLast-1, indexInit);
    }

    /*radar*/
    public String revertTextPalindrome(String text, int indexLast, int indexInit){
        if(indexLast == indexInit) return String.valueOf(text.charAt(indexInit));
        else return text.charAt(indexLast) + revertTextPalindrome(text, indexLast-1, indexInit);
    }
    public boolean isPalindrome(String text, int indexLast, int indexInit){
        String revertText = revertTextPalindrome(text, indexLast, indexInit);
        return revertText.equals(text);
    }

    public boolean isPalindromeUsingTwoPointers(String word, int start, int end){
        if(start >= end) return true;
        char cStart = word.charAt(start);
        char cEnd = word.charAt(end);
        if(cStart != cEnd) return false;
        return isPalindromeUsingTwoPointers(word, start+1, end-1);
    }

    public int numberRaised(int x, int n){
        if(n == 1) return x;
        return x * numberRaised(x, n-1);
    }

    /*Pense no caso base primeiro,
      mas garanta que cada chamada recursiva aproxime você dele.*/
    /*Tail call optimization = Acumalador*/
    /*
    - Control + shift + seta para cima ou para baixo move a linha
    - Control + D duplica a linha atual
    - Control + Alt + V é uma atalho para o extract variable
    */

    public int challengeUpstairs(int n){
        if(n < 1) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int x = challengeUpstairs(n-1);
        int y = challengeUpstairs(n-2);
        return x+y;
    }

    public int fibRecursion(int n){
        if(n < 1) return 0;
        if(n <= 2) return 1;
        int x = fibRecursion(n-1);
        int y = fibRecursion(n-2);
        return x + y;
    }

    public long fibRecursionWithMemoization(Long n, HashMap<Long, Long> cache){
        if(n < 1) return 0;
        if(n <= 2) return 1;
        if(cache.containsKey(n)) return cache.get(n);
        else{
            long x = fibRecursionWithMemoization(n-1, cache);
            long y = fibRecursionWithMemoization(n-2, cache);
            cache.put(n, x+y);
            return x+y;
        }
    }

}
