package projSistemaMedico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;s
    private String rg;
    private String convenio;
    private List<Consulta> consultas; // Lista de consultas armazenada dentro da classe Paciente

    public Paciente(String nome, LocalDate dataNascimento, String cpf, String rg, String convenio) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.convenio = convenio;
        this.consultas = new ArrayList<>();
    }

    // Getters para todos os atributos
    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getConvenio() {
        return convenio;
    }

    public List<Consulta> getConsultas() {
        return consultas; // Retorna uma c�pia da lista para evitar modifica��es externas
    }

    // Setters para todos os atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    // M�todos para adicionar, obter e excluir consultas (j� implementados anteriormente)

    // Exemplo de uso (j� implementado anteriormente)

    // Classe Consulta interna para representar uma consulta m�dica
    private class Consulta {
        private int id;
        private String data;
        private String hora;
        private String medico;
        private String especialidade;

        public Consulta(int id, String data, String hora, String medico, String especialidade) {
            this.id = id;
            this.data = data;
            this.hora = hora;
            this.medico = medico;
            this.especialidade = especialidade;
        }

    }
}
