package com.gabrielbarrilli.cartoriovinculos.web.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioResponseDto {

    private Long id;
    private String nome;
    private String email;
    private String passwd;
}
