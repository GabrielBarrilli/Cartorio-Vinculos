package com.gabrielbarrilli.cartoriovinculos.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
@EntityListeners(AuditingEntityListener.class)
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_usuario", nullable = false, unique = true)
    private String nome_usuario;

    @Column(name = "email_usuario", nullable = false, unique = true)
    private String email_usuario;

    @Column(name = "password_usuario", nullable = false)
    private String passwd_usuario;

    @LastModifiedDate
    @Column(name = "created_usuario", nullable = false)
    private LocalDateTime created_usuario;

    @CreatedBy
    @Column(name = "createdby_usuario", nullable = false)
    private Long createdby_usuario;

    @Column(name = "enabled_usuario", nullable = false)
    private Boolean enabled_usuario;

    @LastModifiedDate
    @Column(name = "updated_usuario")
    private LocalDateTime updated_usuario;

    @CreatedBy
    @Column(name = "updatedby_usuario")
    private Long updatedby_usuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
