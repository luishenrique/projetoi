/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoi;

/**
 *
 * @author L. Henrique
 */
public class Produtos {
    private Integer codigo;
    private String nome;
    private Double taxa;
    private Double setup;
    private Double previsao;
    private Double carregamento;

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getSetup() {
        return setup;
    }

    public void setSetup(Double setup) {
        this.setup = setup;
    }

    public Double getPrevisao() {
        return previsao;
    }

    public void setPrevisao(Double previsao) {
        this.previsao = previsao;
    }

    public Double carregamento() {
        if (carregamento == null) {
            carregamento = (previsao / taxa) + setup;
        }
        return carregamento;
    }
}
