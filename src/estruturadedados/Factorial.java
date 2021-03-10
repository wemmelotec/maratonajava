package estruturadedados;

public class Factorial {
    public static void main(String[] args) {
        /*
        Este é um problema que aborda a ideia da recursividade, ou seja, um método que vai chamando a si mesmo
        para resolver o problema, até o retorno a base.
         */
        double x = 1;//armazena o número fatorial
        double y = x;//armazena o resultado temporário da multiplicação

        if(x==0){
            y=1;
        }else {
            while (x > 1) { //caso recursivo
                y = y * (x - 1);
                x--;
            }
        }
        System.out.println(y);
        /*
        Recursion
            • Terminates when a base case is reached.
            • Each recursive call requires extra space on the stack frame (memory).
            • If we get infinite recursion, the program may run out of memory and result in stack
            overflow.
            • Solutions to some problems are easier to formulate recursively.

        Example Algorithms of Recursion
            • Fibonacci Series, Factorial Finding
            • Merge Sort, Quick Sort
            • Binary Search
            • Tree Traversals and many Tree Problems: InOrder, PreOrder PostOrder
            • Graph Traversals: DFS [Depth First Search] and BFS [Breadth First Search]
            • Dynamic Programming Examples
            • Divide and Conquer Algorithms
            • Towers of Hanoi
            • Backtracking Algorithms [we will discuss in next section]
         */
    }

}
