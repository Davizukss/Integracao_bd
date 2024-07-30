package br.com.etechoracio.blog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "TBL_POST")
public class post {
    @Id
    @Column(name = "ID_POST")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "TX_TITULO")
    private String titulo;

    @Column(name = "TX_CONTEUDO")
    private String conteudo;

    @Column(name = "DT_CRIACAO")
    private LocalDateTime dataCriacao;

}
