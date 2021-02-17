package br.com.abc.javacore.crud;

public class Funcionario {
    private String cpfDoUsuario;
    private String nomeFuncionario;
    private Departamento departamentoDoFuncionario;

    public Funcionario() {
    }

    public Funcionario(String cpfDoUsuario, String nomeFuncionario) {
        this.cpfDoUsuario = cpfDoUsuario;
        this.nomeFuncionario = nomeFuncionario;

    }

    @Override
    public String toString() {
        return "Funcionario:\n" +
                " matriculaFuncionario = " + cpfDoUsuario +
                "\t nomeFuncionario = " + nomeFuncionario +
                "\t departamentoDoFuncionario = " + departamentoDoFuncionario.getNomeDepartamento();
    }

    public String getCpfDoUsuario() {
        return cpfDoUsuario;
    }

    public void setCpfDoUsuario(String cpfDoUsuario) {
        this.cpfDoUsuario = cpfDoUsuario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Departamento getDepartamentoDoFuncionario() {
        return departamentoDoFuncionario;
    }

    public void setDepartamentoDoFuncionario(Departamento departamentoDoFuncionario) {
        this.departamentoDoFuncionario = departamentoDoFuncionario;
    }
}
