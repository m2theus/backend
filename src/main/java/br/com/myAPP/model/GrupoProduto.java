package br.com.myAPP.model;
import javax.persistence.*;

@Entity (name = "grupoproduto")
@SequenceGenerator(name="grupoproduto_seq", sequenceName="grupoproduto_seq", allocationSize=1)
public class GrupoProduto {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="produto_seq")

    private Integer id_grupoproduto;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_grupo")
    private Grupo grupo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_produto")
    private Produto produto;


}