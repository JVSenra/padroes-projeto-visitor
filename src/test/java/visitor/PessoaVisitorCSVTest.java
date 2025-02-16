/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author user
 */
public class PessoaVisitorCSVTest {

    @Test
    void deveExibirAtendente() {
        Atendente atendente = new Atendente("Manhã", 25, "João", 8);
        VisitorPessoaCSV visitor = new VisitorPessoaCSV();

        assertEquals("nome,idade,turno,nivelSatisfacao\nJoão,8,Manhã,25", visitor.exibir(atendente));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente("Carlos", 40, 10, 15);
        VisitorPessoaCSV visitor = new VisitorPessoaCSV();

        assertEquals("nome,idade,numFuncionarios,experienciaAnos\nCarlos,40,10,15", visitor.exibir(gerente));
    }

    @Test
    void deveExibirDiretor() {
        Diretor diretor = new Diretor("Fernanda", 50, 5, 3);
        VisitorPessoaCSV visitor = new VisitorPessoaCSV();

        assertEquals("nome,idade,participacao,viagensMensais\nFernanda,50,5,3", visitor.exibir(diretor));
    }
}
