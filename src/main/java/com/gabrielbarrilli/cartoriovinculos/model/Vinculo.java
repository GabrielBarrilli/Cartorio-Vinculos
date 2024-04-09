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

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vinculo")
@EntityListeners(AuditingEntityListener.class)
public class Vinculo {

    @Id
    @Column(name = "id_vinculo")
    @GeneratedValue(strategy = IDENTITY)
    private Long id_vinculo;

    @Column(name = "name_vinculo", nullable = false, unique = true)
    private String name_vinculo;

    @CreatedDate
    @Column(name = "created_vinculo", nullable = false)
    private LocalDateTime created_vinculo;

    @CreatedBy
    @Column(name = "createdby_vinculo", nullable = false)
    private Long createdBy_vinculo;

    @Column(name = "enabled_vinculo", nullable = false)
    private Boolean enabled_vinculo;

    @LastModifiedDate
    @Column(name = "updated_vinculo")
    private LocalDateTime updated_vinculo;

    @CreatedBy
    @Column(name = "updatedby_vinculo")
    private Long updatedBy_vinculo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vinculo vinculo = (Vinculo) o;
        return Objects.equals(id_vinculo, vinculo.id_vinculo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_vinculo);
    }
}
