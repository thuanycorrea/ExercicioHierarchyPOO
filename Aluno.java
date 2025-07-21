public class Aluno extends Pessoas{
   //atributos
    private double notas ;
    private boolean frequencia ;
    private float mediafinal ;

    //metodo construtor
    Aluno(){}
    
        public double getNotas(){
            return notas;
        }
        public void setNotas(double valor){
           this.notas = valor;
        }
        public boolean getFrequencia(){
            return frequencia ;
        }
        public void setFrequencia(boolean valor){
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
      @Override
      public void exibirInformacoes(){
        super.exibirInformacoes();//puxa da classe pessoa
        System.out.println("Nota: "+notas);
        System.out.println("frequencia: "+frequencia);
        System.out.println("Media Final: "+mediafinal);

      }
    }

 