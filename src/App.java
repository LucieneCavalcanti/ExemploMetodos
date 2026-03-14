public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciandoooo");
        Exemplo ex = new Exemplo();
        // System.out.println(ex.CURSO);
        // ex.contar();
        // ex.contar(10);
        // ex.contar(6.2f);
        // ex.atualizarValor();
        // ex.atualizarValor(25);
        // ex.atualizarValor(10,20);
        // System.out.println(ex.getContador());
        float notas[] = new float[4];
        float notas2[] = {5,3,5,8,7,9,5,1,2.6f,4.5f,7,23,5};
        System.out.println("Vetor notas ao inicializar --->");
        ex.mostrarNotas(notas);
        System.out.println("Vetor notas após alteração (255) --->");
        ex.mostrarNotas(notas);
        System.out.println("\nVetor notas 2--->");
        ex.mostrarNotas(notas2);
        float nota1 = 0;
        System.out.println("\n\nMostrando a nota ao iniciar");
        ex.mostrarNota(nota1);
        System.out.println("\n\nMostrando a nota ao alterar para (10)");
        ex.mostrarNota(nota1);
        
    }
}
