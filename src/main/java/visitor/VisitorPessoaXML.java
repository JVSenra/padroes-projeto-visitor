/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author user
 */
public class VisitorPessoaXML implements Visitor{
        public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAtendente(Atendente atendente) {
        return "<Atendente>\n" +
                "  <nome>" + atendente.getNome() + "</nome>\n" +
                "  <idade>" + atendente.getIdade() + "</idade>\n" +
                "  <turno>" + atendente.getTurno() + "</turno>\n" +
                "  <nivelSatisfacao>" + atendente.getNivelSatisfacao() + "</nivelSatisfacao>\n" +
                "</Atendente>";
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "<Gerente>\n" +
                "  <nome>" + gerente.getNome() + "</nome>\n" +
                "  <idade>" + gerente.getIdade() + "</idade>\n" +
                "  <numFuncionarios>" + gerente.getNumFuncionarios() + "</numFuncionarios>\n" +
                "  <experienciaAnos>" + gerente.getExperienciaAnos() + "</experienciaAnos>\n" +
                "</Gerente>";
    }

    @Override
    public String exibirDiretor(Diretor diretor) {
        return "<Diretor>\n" +
                "  <nome>" + diretor.getNome() + "</nome>\n" +
                "  <idade>" + diretor.getIdade() + "</idade>\n" +
                "  <participacao>" + diretor.getParticipacao() + "</participacao>\n" +
                "  <viagensMensais>" + diretor.getViagensMensais() + "</viagensMensais>\n" +
                "</Diretor>";
    }
}
