package br.com.myAPP.model;
import javax.persistence.*;

@Entity (name = "grupo")
@SequenceGenerator(name="grupo_seq", sequenceName="grupo_seq", allocationSize=1)
public class Grupo {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="grupo_seq")

    @Column(name="id_grupo")
    private Integer idGrupo;

    @Column(name="nm_grupo")
    private String nmGrupo;

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public String getNmGrupo() {
        return nmGrupo;
    }

    public void setNmGrupo(String nmGrupo) {
        this.nmGrupo = nmGrupo;
    }
}
