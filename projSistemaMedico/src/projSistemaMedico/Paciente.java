package projSistemaMedico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paciente {

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
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
        return consultas; // Retorna uma cópia da lista para evitar modificações externas
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

    public void adicionarConsulta(String dataConsulta, String horaConsulta, String medicoConsulta, String especialidadeConsulta) {
        int idConsulta = consultas.size() + 1; // Gera um ID único para cada consulta
        consultas.add(new Consulta(idConsulta, dataConsulta, horaConsulta, medicoConsulta, especialidadeConsulta));
    }

    public List<Consulta> obterConsultas() {
        return consultas;
    }

    public void excluirConsulta(int idConsulta) {
        for (int i = 0; i < consultas.size(); i++) {
            Consulta consulta = consultas.get(i);
            if (consulta.id() == idConsulta) {
                consultas.remove(i);
                break;
            }
        }
    }
    
    // Exemplo de uso
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("João Silva", LocalDate.of(1980, 1, 1), "123.456.789-00", "12.345.678-9", "Plano de Saúde Exemplo");

        paciente1.adicionarConsulta("2024-04-28", "10:00", "Dr. José da Silva", "Cardiologia");

        List<Consulta> consultasPaciente = paciente1.obterConsultas();
        System.out.println(consultasPaciente);

        paciente1.excluirConsulta(1); // Exclui a consulta com ID 1

        List<Consulta> consultasPacienteAtualizado = paciente1.obterConsultas();
        System.out.println(consultasPacienteAtualizado);
    }

    // Exemplo de uso (já implementado anteriormente)

    // Classe Consulta interna para representar uma consulta médica
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
