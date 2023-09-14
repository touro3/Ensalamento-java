import java.util.ArrayList;

class Ensalamento {
    public static void main(String[] args) {
        // CrThaynado professores
        Professor Thayna = new Professor("Thayna", "POO");
        Professor Jeremias = new Professor("Jeremias", "Estrutura de Dados");
        Professor Dudu = new Professor("Alvaro", "BI");

        // CrThaynado disciplinas
        Disciplina pooTI = new Disciplina("POO do curso de TI", "TI");
        Disciplina edTI = new Disciplina("Estrutura de Dados do curso de TI", "TI");
        Disciplina biADM = new Disciplina("BI do curso de ADM", "ADM");

        // CrThaynado alunos
        Aluno Mario = new Aluno("Mario", "TI");
        Aluno Duda = new Aluno("Duda", "ADM");
        Aluno Tourinho = new Aluno("Tourinho", "TI");
        Aluno Thayna = new Aluno("Thayna", "ADM");
        Aluno Adriano = new Aluno("Adriano", "TI");
        Aluno Diogo = new Aluno("Diogo", "ADM");
        Aluno Dudu = new Aluno("Dudu", "TI");
        Aluno Victor = new Aluno("Victor", "ADM");
        Aluno Rocha = new Aluno("Rocha", "TI");
        Aluno Larissa = new Aluno("Larissa", "ADM");
        Aluno Gabi = new Aluno("Gabi", "TI");
        Aluno Jorge = new Aluno("Jorge", "ADM");
        Aluno Kelvin = new Aluno("Kelvin", "TI");

        // CrThaynado turmas e adicionando alunos
        Turma turma1 = new Turma(Thayna, pooTI);
        turma1.adicionarAluno(Mario);
        turma1.adicionarAluno(Tourinho);
        turma1.adicionarAluno(Adriano);
        turma1.adicionarAluno(Dudu);
        turma1.adicionarAluno(Rocha);
        turma1.listarTurma();

        Turma turma2 = new Turma(Jeremias, edTI);
        turma2.adicionarAluno(Mario);
        turma2.adicionarAluno(Tourinho);
        turma2.adicionarAluno(Adriano);
        turma2.adicionarAluno(Gabi);
        turma2.adicionarAluno(Kelvin);
        turma2.listarTurma();

        Turma turma3 = new Turma(Alvaro, biADM);
        turma3.adicionarAluno(Duda);
        turma3.adicionarAluno(Thayna);
        turma3.adicionarAluno(Diogo);
        turma3.adicionarAluno(Victor);
        turma3.adicionarAluno(Larissa);
        turma3.adicionarAluno(Jorge);
        turma3.listarTurma();
    }
}
