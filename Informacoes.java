public class Informacoes{
    public static void main(String[] args){

    Pessoas pessoas = new Pessoas();
    pessoas.setNome("thuany");
    pessoas.setIdade(17) ;
    pessoas.setAltura(1.60);
    pessoas.setPeso(57);
    pessoas.setResponsavel(true);

        //oque eles fazem
        pessoas.Estudando();
        pessoas.Aulas();
        pessoas.Falar();

       Aluno AlunosEmGeral = new Aluno();
       AlunosEmGeral.setNome("aluna thuany");
       AlunosEmGeral.setIdade(16);
       AlunosEmGeral.setAltura(1.60);
       AlunosEmGeral.setPeso(56);
       AlunosEmGeral.setResponsavel(true );
       AlunosEmGeral.setNotas(9.0);
       AlunosEmGeral.setFrequencia(true);
       AlunosEmGeral.setMediaFinal(8);

       AlunosEmGeral.Estudando();
       AlunosEmGeral.Aulas();
       AlunosEmGeral.Falar();
      
      Professor ProfessoresEmGeral = new Professor();
      ProfessoresEmGeral.setNome("professor jhonatan");
      ProfessoresEmGeral.setIdade(47);
      ProfessoresEmGeral.setAltura(1.78);
      ProfessoresEmGeral.setPeso(70);
      ProfessoresEmGeral.setResponsavel(true );
      ProfessoresEmGeral.setMateria("biologia");
      ProfessoresEmGeral.setQuantidadeDeAulas(5);
      ProfessoresEmGeral.setSalario(1.700);

      ProfessoresEmGeral.Estudando();
      ProfessoresEmGeral.Aulas();
      ProfessoresEmGeral.Falar();

        System.out.println("\n########PESSOA###########");
     String mensagem1 = "\nNome:"+pessoas.getNome()+                
                        "\nIdade:"+pessoas.getIdade()+
                        "\nAltura:"+pessoas.getAltura()+     
                         "\nPeso:"+pessoas.getPeso()+                                           
                        "\nResponsavel:"+pessoas.getResponsavel();

                        System.out.println(mensagem1);

            System.out.println("\n########ALUNO###########");
    String mensagem2 = "\nNome:"+AlunosEmGeral.getNome()+                
                        "\nIdade:"+AlunosEmGeral.getIdade()+
                        "\nAltura:"+AlunosEmGeral.getAltura()+     
                         "\nPeso:"+AlunosEmGeral.getPeso()+                                           
                        "\nResponsavel:"+AlunosEmGeral.getResponsavel()+
                        "\nNotas: "+AlunosEmGeral.getNotas()+
                        "\nFrequencia: "+AlunosEmGeral.getFrequencia()+
                        "\nMediaFinal: "+AlunosEmGeral.getMediaFinal();

                         System.out.println(mensagem2);

             System.out.println("\n########PROFESSOR###########");
   String mensagem3 = "\nNome:"+ProfessoresEmGeral.getNome()+                
                        "\nIdade:"+ProfessoresEmGeral.getIdade()+
                        "\nAltura:"+ProfessoresEmGeral.getAltura()+     
                         "\nPeso:"+ProfessoresEmGeral.getPeso()+                                           
                        "\nResponsavel:"+ProfessoresEmGeral.getResponsavel()+
                        "\nMateria:"+ProfessoresEmGeral.getMateria()+
                        "\nQuantidadeDeAulas:"+ProfessoresEmGeral.getQuantidadeDeAulas()+
                        "\nSalario: "+ProfessoresEmGeral.getSalario();

                        System.out.println(mensagem3);

    }
    }
  