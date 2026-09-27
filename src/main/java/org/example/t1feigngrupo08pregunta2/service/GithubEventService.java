package org.example.t1feigngrupo08pregunta2.service;

import lombok.RequiredArgsConstructor;
import org.example.t1feigngrupo08pregunta2.restclient.github.client.GithubEventClient;
import org.example.t1feigngrupo08pregunta2.restclient.github.model.ActorDTO;
import org.example.t1feigngrupo08pregunta2.restclient.github.model.GithubEventDTO;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import java.util.List;


@Service
@RequiredArgsConstructor

public class GithubEventService {

    private final GithubEventClient githubEventClient;

    public List<GithubEventDTO> getPushEventsWithOddActorId() {
        List<GithubEventDTO> events = githubEventClient.getEvents();

        if (events == null || events.isEmpty()) {
            return List.of();
        }

        return events.stream()
                .filter(event -> "PushEvent".equalsIgnoreCase(event.getType()))
                .filter(event -> event.getActor() != null
                        && event.getActor().getId() != null
                        && Math.abs(event.getActor().getId() % 2) == 1)
                .collect(Collectors.toList());
    }
}
