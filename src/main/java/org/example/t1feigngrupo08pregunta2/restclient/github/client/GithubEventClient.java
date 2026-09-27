package org.example.t1feigngrupo08pregunta2.restclient.github.client;

import org.example.t1feigngrupo08pregunta2.restclient.config.FeignConfig;
import org.example.t1feigngrupo08pregunta2.restclient.config.FeignInterceptorConfig;

import org.example.t1feigngrupo08pregunta2.restclient.github.model.GithubEventDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name="githubEventClient",
        url = "https://api.github.com",
        configuration = {FeignConfig.class, FeignInterceptorConfig.class})

public interface GithubEventClient {

    @GetMapping("/events")
    List<GithubEventDTO> getEvents();
}
