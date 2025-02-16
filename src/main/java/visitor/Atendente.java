/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visitor;

/**
 *
 * @author user
 */
public class Atendente extends Pessoa{

    private String turno;
    private int nivelSatisfacao;

    public Atendente(String turno, int nivelSatisfacao, String nome, int idade) {
        super(nome, idade);
        this.turno = turno;
        this.nivelSatisfacao = nivelSatisfacao;
    }

    public String getTurno() {
        return turno;
    }

    public int getNivelSatisfacao() {
        return nivelSatisfacao;
    }


    
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirAtendente(this);
    }
    
}
