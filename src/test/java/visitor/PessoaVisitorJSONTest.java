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
public class PessoaVisitorJSONTest {

    @Test
    void deveExibirAtendente() {
        Atendente atendente = new Atendente("Manhã", 25, "João", 8);
        VisitorPessoaJSON visitor = new VisitorPessoaJSON();

        assertEquals("{\"nome\":\"João\",\"idade\":8,\"turno\":\"Manhã\",\"nivelSatisfacao\":25}", visitor.exibir(atendente));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente("Carlos", 40, 10, 15);
        VisitorPessoaJSON visitor = new VisitorPessoaJSON();

        assertEquals("{\"nome\":\"Carlos\",\"idade\":40,\"numFuncionarios\":10,\"experienciaAnos\":15}", visitor.exibir(gerente));
    }

    @Test
    void deveExibirDiretor() {
        Diretor diretor = new Diretor("Fernanda", 50, 5, 3);
        VisitorPessoaJSON visitor = new VisitorPessoaJSON();

        assertEquals("{\"nome\":\"Fernanda\",\"idade\":50,\"participacao\":5,\"viagensMensais\":3}", visitor.exibir(diretor));
    }
}