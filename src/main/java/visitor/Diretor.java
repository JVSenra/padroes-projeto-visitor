/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author user
 */
public class Diretor extends Pessoa{
    private int participacao;
    private int viagensMensais;

    public Diretor(String nome, int idade, int participacao, int viagensMensais) {
        super(nome, idade);
        this.participacao = participacao;
        this.viagensMensais = viagensMensais;
    }

    public int getParticipacao() {
        return participacao;
    }

    public int getViagensMensais() {
        return viagensMensais;
    }
    
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirDiretor(this);
    }
}
