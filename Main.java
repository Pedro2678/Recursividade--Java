
public class Main {

    // Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Progressão aritmética
    public static int pa(int n) {
        if (n == 1) return 2;
        return pa(n - 1) + 3;
    }

    // Progressão geométrica
    public static int pg(int n) {
        if (n == 1) return 2;
        return pg(n - 1) * 2;
    }

    // Frequências musicais
    public static double frequencia(int n) {
        if (n == 0) return 110;
        return frequencia(n - 1) * 2;
    }

    // Demonstração da Call Stack
    public static void stack(int n) {
        System.out.println("Entrando: " + n);

        if (n > 0) stack(n - 1);

        System.out.println("Saindo: " + n);
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci: " + fibonacci(6));
        System.out.println("PA: " + pa(5));
        System.out.println("PG: " + pg(5));
        System.out.println("Frequência: " + frequencia(3) + " Hz");

        // Call Stack
        System.out.println("\nCall Stack:");
        stack(3);

        // Array alocado na Heap
        int[] numeros = {pa(1), pa(2), pa(3)};

        System.out.println("\nHeap:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
