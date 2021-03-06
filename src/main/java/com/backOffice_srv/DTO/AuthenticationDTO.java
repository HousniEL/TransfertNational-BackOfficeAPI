package com.backOffice_srv.DTO;


import lombok.*;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class AuthenticationDTO {
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
