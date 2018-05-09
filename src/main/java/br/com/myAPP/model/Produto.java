package br.com.myAPP.model;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity (name = "produto")
@SequenceGenerator(name="produto_seq", sequenceName="produto_seq", allocationSize=1)
public class Produto {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produto_seq")

    @Column(name="id_produto")
    private Integer idProduto;

    @Column(name="nm_produto")
    private String nmProduto;

    @Column(name="dt_cadastro")
    private Timestamp dtCadastro;

    @Column(name="vl_produto")
    private Double vlProduto;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        this.nmProduto = nmProduto;
    }

    public Timestamp getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Timestamp dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Double getVlProduto() {
        return vlProduto;
    }

    public void setVlProduto(Double vlProduto) {
        this.vlProduto = vlProduto;
    }
}
