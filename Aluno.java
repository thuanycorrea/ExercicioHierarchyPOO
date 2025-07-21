public class Aluno extends Pessoas{
   //atributos
    private double notas ;
    private double frequencia ;
    private float mediafinal ;

    //metodo construtor
    Aluno(){}
    
        public double getNotas(){
            return notas;
        }
        public void setNotas(double valor){
           this.notas = valor;
        }
        public double getFrequencia(){
            return frequencia ;
        }
        public void setFrequencia(double valor){
            this.frequencia = valor;
        }
        public float getMediaFinal(){
            return mediafinal;
        }
        public void setMediaFinal( float valor){
            this.mediafinal = valor ;
        }
        @Override
        public void Estudando(){
            System.out.println("estou estudando");
        }
        @Override
        public void Aulas(){
            System.out.println("estou em aula");
        }
        @Override
        public void Falar(){
            System.out.println("estou falando");
        }
      

      }
    

 