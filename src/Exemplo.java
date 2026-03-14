public class Exemplo {
    private int contador=0;
    public final String CURSO = "INFORMÁTICA";

    public int getContador(){
        return contador;      
    }
    public void contar(){
        contador++; //atributo
        System.out.println("Valor do [atributo] Contador: "
         + contador);
    }
    public void contar(int contador){
        contador++; //variável
        System.out.println("Valor da [variável] Contador: "
         + contador);
    }
    public void contar(float contador){
        contador++; //variável
        System.out.println("Contador [variável]: "
         + contador);
    }
    public void atualizarValor(){
        contador=5;
    }
    public void atualizarValor(int contador){
        this.contador=contador;
        System.out.println("Contador com this: "+this.contador);
    }
    
    public void atualizarValor(int x,int y){
        this.contador=x+y;
        System.out.println("Contador com this: "+this.contador);
    }
    void mostrarNotas(float notas[]){
        System.out.println("--- Mostrando as notas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " - ");
            notas[i]+=2;
        }
        notas[2] = 255;
    }
    public void mostrarNota(float nota){
        System.out.println("a nota é: " + nota);
        nota = 10;
    }
    
}
