/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author user
 */
public class VisitorPessoaJSON implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAtendente(Atendente atendente) {
        return "{" +
                "\"nome\":\"" + atendente.getNome() + "\"," +
                "\"idade\":" + atendente.getIdade() + "," +
                "\"turno\":\"" + atendente.getTurno() + "\"," +
                "\"nivelSatisfacao\":" + atendente.getNivelSatisfacao() +
                "}";
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "{" +
                "\"nome\":\"" + gerente.getNome() + "\"," +
                "\"idade\":" + gerente.getIdade() + "," +
                "\"numFuncionarios\":" + gerente.getNumFuncionarios() + "," +
                "\"experienciaAnos\":" + gerente.getExperienciaAnos() +
                "}";
    }

    @Override
    public String exibirDiretor(Diretor diretor) {
        return "{" +
                "\"nome\":\"" + diretor.getNome() + "\"," +
                "\"idade\":" + diretor.getIdade() + "," +
                "\"participacao\":" + diretor.getParticipacao() + "," +
                "\"viagensMensais\":" + diretor.getViagensMensais() +
                "}";
    }
}