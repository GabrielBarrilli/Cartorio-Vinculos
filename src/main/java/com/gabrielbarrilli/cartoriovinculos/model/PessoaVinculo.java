package com.gabrielbarrilli.cartoriovinculos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoa_vinculo")
@EntityListeners(AuditingEntityListener.class)
public class PessoaVinculo {

    @Id
    @Column(name = "id_pessoa_vinculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(name = "created_pessoa_vinculo")
    private LocalDateTime created_pessoavinculo;

    @CreatedBy
    @Column(name = "createdby_pessoa_vinculo")
    private Long createdby_pessoavinculo;

    @Column(name = "enabled_pessoa_vinculo")
    private Boolean enabled_pessoavinculo;

    @LastModifiedDate
    @Column(name = "updated_pessoa_vinculo")
    private LocalDateTime updated_pessoavinculo;

    @CreatedBy
    @Column(name = "updatedby_pessoa_vinculo")
    private Long updatedby_pessoavinculo;

    @ManyToOne
    @JoinColumn(name = "id_pessoa_principal")
    private Pessoa pessoaPrincipal;

    @ManyToOne
    @JoinColumn(name = "id_pessoa_secundaria")
    private Pessoa pessoaSecundaria;

    @ManyToOne
    @JoinColumn(name = "id_vinculo")
    private Vinculo vinculo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaVinculo that = (PessoaVinculo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
