package mf;
import mf.questoes;

import java.util.Scanner;
public class quiz {   public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int acertos = 0;

    cabecalho cabecalho1 = new cabecalho();

    cabecalho1.Faculdade = "Faculdade: Faculdade Alfredo Nasser";
    cabecalho1.Aluno = "Muryllo Fernando Alves Ribeiro";
    cabecalho1.Professor = "Professor: Brenno Pimenta";
    cabecalho1.Disciplina = "Disciplina: Algoritmo e Programaçao II";
    cabecalho1.Inicio = "Bem Vindo ao Quiz!";
    cabecalho1.escrevaCabecalho();


    questoes questoes1 = new questoes();
    questoes1.questoes = "1- Quem foi a primeira pessoa a viajar no Espaço?";
    questoes1.A = "A) Yuri Gagarin";
    questoes1.B = "B) A cadela Laika";
    questoes1.C = "C) Neil Armstrong";
    questoes1.D = "D) Marcos Pontes";
    questoes1.E = "E) Buzz Aldrin";
    questoes1.escrevaquestao();
    questoes1.correta = "A";
    System.out.println("Digite a alternativa correta: ");
    String resposta = (String) sc.nextLine();
    if (questoes1.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("====================================================================== ");
    questoes questoes2 = new questoes();
    questoes2.questoes = "2- Que país tem o formato de uma bota?";
    questoes2.A = "A) Butão";
    questoes2.B = "B) Brasil";
    questoes2.C = "C) Portugal";
    questoes2.D = "D) Itália";
    questoes2.E = "E) México";
    questoes2.escrevaquestao();
    questoes2.correta = "D";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes2.iscorreta(resposta)){
        acertos = acertos+1;
    }
    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes3 = new questoes();
    questoes3.questoes = "3- Quem inventou a lâmpada?";
    questoes3.A = "A) Graham Bell";
    questoes3.B = "B) Steve Jobs";
    questoes3.C = "C) Thomas Edison";
    questoes3.D = "D) Henry Ford";
    questoes3.E = "E)  Santos Dumont";
    questoes3.escrevaquestao();
    questoes3.correta = "C";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes3.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes4 = new questoes();
    questoes4.questoes = "4- A que temperatura a água ferve?";
    questoes4.A = "A)  200 ºC";
    questoes4.B = "B) -10 ºC";
    questoes4.C = "C)  180 ºC";
    questoes4.D = "D) 0 ºC";
    questoes4.E = "E) 100 ºC";
    questoes4.escrevaquestao();
    questoes4.correta = "E";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes4.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes5 = new questoes();
    questoes5.questoes = "5-Quais são as fases da Lua?";
    questoes5.A = "A)  Nova, cheia e superlua";
    questoes5.B = "B) Penumbral, lunar parcial, lunar total e cheia";
    questoes5.C = "C) Nova, cheia, minguante e lua de sangue";
    questoes5.D = "D) Nova, crescente, cheia e minguante";
    questoes5.E = "E) Nova, crescente, cheia, minguante e lua de sangue";
    questoes5.escrevaquestao();
    questoes5.correta = "D";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes5.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes6 = new questoes();
    questoes6.questoes = "6- Quantos ossos temos no nosso corpo?";
    questoes6.A = "A) 300";
    questoes6.B = "B) 126";
    questoes6.C = "C)  206";
    questoes6.D = "D)  18";
    questoes6.E = "E)  200";
    questoes6.escrevaquestao();
    questoes6.correta = "C";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes6.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes7 = new questoes();
    questoes7.questoes = "7- Qual o maior planeta do sistema solar?";
    questoes7.A = "A) Marte";
    questoes7.B = "B) Lua";
    questoes7.C = "C) Saturno";
    questoes7.D = "D) Terra";
    questoes7.E = "E) Júpiter";
    questoes7.escrevaquestao();
    questoes7.correta = "E";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes7.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes8 = new questoes();
    questoes8.questoes = "8- Qual o planeta mais próximo do Sol?";
    questoes8.A = "A) Netuno";
    questoes8.B = "B) Júpiter";
    questoes8.C = "C) Mercúrio";
    questoes8.D = "D)  Terra";
    questoes8.E = "E) Marte";
    questoes8.escrevaquestao();
    questoes8.correta = "C";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes8.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes9 = new questoes();
    questoes9.questoes = "9-  Quantos andares tem o maior prédio do mundo?";
    questoes9.A = "A)  100";
    questoes9.B = "B)  200";
    questoes9.C = "C) 163";
    questoes9.D = "D) 25";
    questoes9.E = "E)  50";
    questoes9.escrevaquestao();
    questoes9.correta = "C";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes9.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes10 = new questoes();
    questoes10.questoes = "10- Em que país foi construído o Muro de Berlim?";
    questoes10.A = "A) Estados Unidos";
    questoes10.B = "B) China";
    questoes10.C = "C) Coreia do Norte";
    questoes10.D = "D)  Alemanha";
    questoes10.E = "E)  Brasil";
    questoes10.escrevaquestao();
    questoes10.correta = "D";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes10.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes11 = new questoes();
    questoes11.questoes = "11- Em que ano foi usado um celular pela primeira vez no Brasil?";
    questoes11.A = "A) 1900";
    questoes11.B = "B) 1990";
    questoes11.C = "C) 1890";
    questoes11.D = "D) 2000";
    questoes11.E = "E) 2020";
    questoes11.escrevaquestao();
    questoes11.correta = "B";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes11.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes12 = new questoes();
    questoes12.questoes = "12- Em que país se anda mais de bicicleta?";
    questoes12.A = "A) Brasil";
    questoes12.B = "B) Portugal";
    questoes12.C = "C)Estados Unidos";
    questoes12.D = "D)  Países Baixos";
    questoes12.E = "E)  Mongólia";
    questoes12.escrevaquestao();
    questoes12.correta = "D";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes12.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes13 = new questoes();
    questoes13.questoes = "13-Qual a nacionalidade de Napoleão Bonaparte?";
    questoes13.A = "A)  Francesa";
    questoes13.B = "B)  Brasileira";
    questoes13.C = "C) Mexicana";
    questoes13.D = "D) Japonesa";
    questoes13.E = "E)  Egípcio";
    questoes13.escrevaquestao();
    questoes13.correta = "A";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes13.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes14 = new questoes();
    questoes14.questoes = "14- Depois do futebol, qual o esporte mais popular no Brasil?";
    questoes14.A = "A) Esqui";
    questoes14.B = "B) Vôlei";
    questoes14.C = "C) Hóquei no gelo";
    questoes14.D = "D) Golfe";
    questoes14.E = "E) Esgrima";
    questoes14.escrevaquestao();
    questoes14.correta = "B";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes14.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

    System.out.println("====================================================================== ");
    questoes questoes15 = new questoes();
    questoes15.questoes = "15-  Em que região se localiza o estado de Minas Gerais?";
    questoes15.A = "A)  Sudeste";
    questoes15.B = "B) Centro-Oeste";
    questoes15.C = "C)  Norte";
    questoes15.D = "D) Sul";
    questoes15.E = "E) Nordeste";
    questoes15.escrevaquestao();
    questoes15.correta = "A";
    System.out.println("Digite a alternativa correta: ");
    resposta = (String) sc.nextLine();
    if (questoes15.iscorreta(resposta)){
        acertos = acertos+1;
    }

    System.out.println("ACERTOS: "+acertos);

}
}