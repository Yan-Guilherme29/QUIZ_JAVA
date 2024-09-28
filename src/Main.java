public class Main {
    public static void main(String[] args) {
        Questao leia = new Questao();
        int acertos = 0;
        int erros   = 0;

        String[] perguntas = {
                " 01 - O que é Engenharia de Software? ",
                " 02 - O que é UML? ",
                " 03 - Qual a função do SCRUM? ",
                " 04 - ",
                " 05 - ",
                " 06 - ",
                " 07 - ",
                " 08 - ",
                " 09 - ",
                " 10 - ",
                " 11 - ",
                " 12 - ",
                " 13 - ",
                " 14 - ",
                " 15 - "
        };

        String[][] opcoes = {
                {" A) Um software de engenharia ", "B) Uma metodologia ", "C) Uma ciência ", "D) Nenhuma das anteriores ", "E) Todas as anteriores"},
                {" A) Linguagem de programação", "B) Linguagem de modelagem", "C) Linguagem matemática", "D) Linguagem de marcação", "E) Linguagem de montagem"},
                {" A) Organizar o desenvolvimento de projetos", "B) Definir funções", "C) Medir a qualidade de software", "D) Corrigir falhas", "E) Aumentar a segurança"},
                {" "},
                {"  "},
                {"  "},
                {" "},
                {" "},
                {" "},
                {" "},
                {" "},
                {" "},
                {" "},
                {" "},
                {" "}
        };

        //                    1    2    3    4    5    6    7    8    9   10   11   12   13    14   15
        String[] corretas = {"c", "b", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};

        System.out.println(" ");
        System.out.println(" =-------------------------------------------------------------------------------------------------------= ");
        System.out.println(" =                              Centro Universitário Alfredo Nasser                                      = ");
        System.out.println(" =                                Yan Guilherme Siqueira Gomides                                         = ");
        System.out.println(" =                                        Brenno Pimenta                                                 = ");
        System.out.println(" =                                                                                                       = ");
        System.out.println(" =               Olá! Bem vindos ao QUIZ de Java com o tema 'Engenharia de Software'                     = ");
        System.out.println(" =                                      Te Desejo Boa Sorte !!!                                          = ");
        System.out.println(" =-------------------------------------------------------------------------------------------------------= ");
        System.out.println(" ");

        System.out.println("                                             Começando...                                                ");
        System.out.println(" ");


        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(" =-------------------------------------------------------------------------------------------------------= ");
            leia.pergunta = perguntas[i];
            leia.opcaoA   = opcoes[i][0];
            leia.opcaoB   = opcoes[i][1];
            leia.opcaoC   = opcoes[i][2];
            leia.opcaoD   = opcoes[i][3];
            leia.opcaoE   = opcoes[i][4];
            leia.correta  = corretas[i];

            leia.escrevaQuestao();
            String resposta = leia.leiaResposta();
            boolean correta = leia.isCorreta(resposta);

            if (correta) {
                acertos++;
            } else {
                erros++;
            }
        }

        System.out.println(" =-------------------------------------------------------------------------------------------------------= ");
        double porcentagemAcertos = ((double) acertos / perguntas.length) * 100;
        System.out.println(" Resultados");
        System.out.println(" ");
        System.out.println(" Quantidade de acertos: " + acertos);
        System.out.println(" Quantidade de erros: " + erros);
        System.out.printf(" Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
    }
}