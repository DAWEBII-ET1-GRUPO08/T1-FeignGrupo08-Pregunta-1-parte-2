package org.example.t1feigngrupo08pregunta2.controller;

import lombok.RequiredArgsConstructor;
import org.example.t1feigngrupo08pregunta2.restclient.github.model.ActorDTO;
import org.example.t1feigngrupo08pregunta2.restclient.github.model.GithubEventDTO;
import org.example.t1feigngrupo08pregunta2.service.GithubEventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/github/events")
@RequiredArgsConstructor
public class GithubEventController {

    private final GithubEventService githubEventService;

    @GetMapping("/eventoyactor")
    public ResponseEntity<List<GithubEventDTO>> getOddActorPushEvents() {
        List<GithubEventDTO> filteredEvents = githubEventService.getPushEventsWithOddActorId();
        return ResponseEntity.ok(filteredEvents);
    }
}
