public class Professor extends Pessoas{
    private String materia;
    private int quantidadeDeAulas ;
    private double salario ;

 //metodo construtor
 public Professor (){}

        public String getMateria(){
            return materia;
        }
        public void setMateria(String materia){
           this.materia = materia;
        }
        public int getQuantidadeDeAulas(){
            return quantidadeDeAulas ;
        }
        public void setQuantidadeDeAulas(int valor){
            this.quantidadeDeAulas = valor;
        }
        public double getSalario(){
            return salario;
        }
        public void setSalario( double valor){
            this.salario = valor ;
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
        System.out.println("Materia: "+materia);
        System.out.println("Quantidade de Aulas: "+quantidadeDeAulas);
        System.out.println("Salario: "+salario);
}
}