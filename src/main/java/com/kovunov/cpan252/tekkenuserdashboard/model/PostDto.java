package com.kovunov.cpan252.tekkenuserdashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class PostDto {
    private int userId;
    private int id;
    private String title;
    private String body;
}
