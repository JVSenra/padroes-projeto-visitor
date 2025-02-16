/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author user
 */
public class Gerente extends Pessoa{

    private int numFuncionarios;
    private int experienciaAnos;

    public Gerente(String nome, int idade, int numFuncionarios, int experienciaAnos) {
        super(nome, idade);
        this.numFuncionarios = numFuncionarios;
        this.experienciaAnos = experienciaAnos;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public int getExperienciaAnos() {
        return experienciaAnos;
    }
    
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirGerente(this);
    }
    
}
