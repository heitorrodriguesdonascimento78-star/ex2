public class BuscaMultipla {
    public static void main(String[] args) {
        int[] vetor = {10, 20, 30, 20, 50 };
        int busca = 20;
        boolean encontrou = false;

        System.out.print("Saída: posições ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == busca) {
                System.out.print(i + " ");
                encontrou = true;
            }
        }

        if (!encontrou) System.out.println("Não encontrado.");
    }
}