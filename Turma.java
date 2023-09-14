class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarTurma() {
        System.out.println("Turma de " + disciplina.getNome() + " ministrada por " + professor.getNome());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getCurso());
        }
        System.out.println();
    }
}