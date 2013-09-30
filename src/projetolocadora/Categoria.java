
package projetolocadora;


public class Categoria {
    private String nome;
    private String descricao;
    private int codigo;

    public Categoria() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Categoria{" + "nome=" + nome + ", descricao=" + descricao + ", codigo=" + codigo + '}';
    }
    
}
