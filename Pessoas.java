public class Pessoas{
    //atributos
    private String nome ;
    private int idade ;
    private double altura;
    private float peso ;
    private boolean responsavel;

//metodo contrutor
Pessoas(){
    this.nome="";
    this.idade=0;
    this.altura=0;
    this.peso=0;
    this.responsavel=true;
}

Pessoas(String nome,int idade, double altura, float peso,boolean responsavel){
    this.nome= nome;
    this.idade= idade;
    this.altura= altura;
    this.peso=peso;
    this.responsavel= responsavel;
}
//metodos
public String getNome(){
    return nome ;
}
public void setNome(String nome){
    this.nome = nome;
}
public int getIdade(){
    return idade ;
}
public void setIdade(int valor){
    this.idade = valor;
}
public double getAltura(){
    return altura ;
}
public void setAltura(double valor){
    this.altura = valor ;
}
public float getPeso(){
    return peso;
}
public void setPeso(float valor){
    this.peso = valor;
}
public boolean getResponsavel(){
    return responsavel;
}
public void setResponsavel(boolean valor){
    this.responsavel= valor ;
}

//oque eles fazem

        public void Estudando(){
            System.out.println("estou estudando");
        }
    
        public void Aulas(){
            System.out.println("estou em aula");
        }
        
        public void Falar(){
            System.out.println("estou falando");
        }

        public void exibirInformacoes(){
            System.out.println("Nome: "+nome);
            System.out.println("Idade: "+idade);
            System.out.println("Altura: "+altura);
            System.out.println("Peso: "+ peso);
            System.out.println("Responsavel"+responsavel);
        }
}