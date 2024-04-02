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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoa")
@EntityListeners(AuditingEntityListener.class)
public class Pessoa {

    @Id
    @Column(name = "id_pessoa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_pessoa;

    @Column(name = "name_pessoa" , unique = true)
    private String name_pessoa;

    @CreatedDate
    @Column(name = "created_pessoa")
    private LocalDateTime created_pessoa;

    @CreatedBy
    @Column(name = "createdby_pessoa")
    private Long createdby_pessoa;

    @Column(name = "enabled_pessoa")
    private Boolean enabled_pessoa;

    @LastModifiedDate
    @Column(name = "updated_pessoa")
    private LocalDateTime updated_pessoa;

    @CreatedBy
    @Column(name = "updatedby_pessoa")
    private Long updatedby_pessoa;
}
