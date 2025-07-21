public class Pessoas{
    //atributos
    private String nome ;
    private int idade ;
    private double altura;
    private float peso ;
    private String responsavel;

//metodo contrutor
Pessoas(){
    this.nome="";
    this.idade=0;
    this.altura=0;
    this.peso=0;
    this.responsavel=" ";
}

Pessoas(String nome,int idade, double altura, float peso,String responsavel){
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
public String getResponsavel(){
    return responsavel;
}
public void setResponsavel(String responsavel){
    this.responsavel= responsavel ;
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

       
        }
