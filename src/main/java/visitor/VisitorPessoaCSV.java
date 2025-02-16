/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author user
 */
public class VisitorPessoaCSV implements Visitor{
        public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAtendente(Atendente atendente) {
        return "nome,idade,turno,nivelSatisfacao\n"
                + atendente.getNome()
                + "," + atendente.getIdade()
                + "," + atendente.getTurno()
                + "," + atendente.getNivelSatisfacao();
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "nome,idade,numFuncionarios,experienciaAnos\n"
                + gerente.getNome()
                + "," + gerente.getIdade()
                + "," + gerente.getNumFuncionarios()
                + "," +  gerente.getExperienciaAnos();
    }

    @Override
    public String exibirDiretor(Diretor diretor) {
        return "nome,idade,participacao,viagensMensais\n"
                + diretor.getNome()
                + "," + diretor.getIdade()
                + "," + diretor.getParticipacao()
                + "," + diretor.getViagensMensais();

    }

}
