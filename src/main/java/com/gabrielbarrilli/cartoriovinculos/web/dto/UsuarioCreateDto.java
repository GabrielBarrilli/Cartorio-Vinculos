package com.gabrielbarrilli.cartoriovinculos.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioCreateDto {

    @NotBlank
    @Size(min = 3, max = 100, message = "Mínimo de 3 letras, máximo 100")
    private String nome;

    @NotBlank
    @Email(message = "Formato de email inválido. Formato válido: xxx@xxx.xxx" , regexp = "^[a-z0-9.+-]+@[a-z0-9.-]+\\.[a-z]{2,}$")
    private String username;

    @NotBlank
    @Size(min = 6, max = 16, message = "Senha deve ter no mínimo 6 caracteres e no máximo 16")
    private String password;
}
