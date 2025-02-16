/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package visitor;

/**
 *
 * @author user
 */
public interface Visitor {
    String exibirAtendente(Atendente atendente);
    String exibirGerente(Gerente gerente);
    String exibirDiretor(Diretor diretor);
}
