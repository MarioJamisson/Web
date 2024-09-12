package evento.com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String data;
    private String local;
    private String agencia;


    public Evento(EventoDados dados) {
        this.nome = dados.nome();
        this.data = dados.data();
        this.local = dados.local();
        this.agencia = dados.agencia();
    }

    public Evento() {}

    public void atualizaEvento(EventoUpdateDados dados){
        this.nome = dados.nome();
        this.data = dados.data();
        this.local = dados.local();
        this.agencia = dados.agencia();
    }

    public String getAgencia() {
         return agencia;
    }

    public void setAgencia(String agencia) {
         this.agencia = agencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Evento [id=" + id + ", nome=" + nome + ", data=" + data + ", local=" + local + ", agencia=" + agencia
                + "]";
    }
}