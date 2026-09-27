package org.example.t1feigngrupo08pregunta2.restclient.github.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class GithubEventDTO {
    private String id;
    private String type;
    private ActorDTO actor;
}
