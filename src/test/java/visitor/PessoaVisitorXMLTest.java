package visitor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PessoaVisitorXMLTest {

    @Test
    void deveExibirAtendente() {
        Atendente atendente = new Atendente("Manhã", 25, "João", 8);
        VisitorPessoaXML visitor = new VisitorPessoaXML();

        assertEquals("<Atendente>\n  <nome>João</nome>\n  <idade>8</idade>\n  <turno>Manhã</turno>\n  <nivelSatisfacao>25</nivelSatisfacao>\n</Atendente>", visitor.exibir(atendente));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente("Carlos", 40, 10, 15);
        VisitorPessoaXML visitor = new VisitorPessoaXML();

        assertEquals("<Gerente>\n  <nome>Carlos</nome>\n  <idade>40</idade>\n  <numFuncionarios>10</numFuncionarios>\n  <experienciaAnos>15</experienciaAnos>\n</Gerente>", visitor.exibir(gerente));
    }

    @Test
    void deveExibirDiretor() {
        Diretor diretor = new Diretor("Fernanda", 50, 5, 3);
        VisitorPessoaXML visitor = new VisitorPessoaXML();

        assertEquals("<Diretor>\n  <nome>Fernanda</nome>\n  <idade>50</idade>\n  <participacao>5</participacao>\n  <viagensMensais>3</viagensMensais>\n</Diretor>", visitor.exibir(diretor));
    }
}
