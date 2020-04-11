package ua.lviv.iot.stuffForBar.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.stuffForBar.model.OrganizersForTheBar;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

@RequestMapping("/organizersForTheBar")
@RestController
public class OrganizersForTheBarController {
    private Map <Integer, OrganizersForTheBar> organizerssForTheBar = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping(path = "/{id}")
    public OrganizersForTheBar getOrganizersForTheBar(@PathVariable("id") Integer organizersForTheBarId) {
        return organizerssForTheBar.get(organizersForTheBarId);
    }

    @GetMapping
    public List<OrganizersForTheBar> getOrganizersForTheBar() {
        return new LinkedList<>(organizerssForTheBar.values());
    }


    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public OrganizersForTheBar createOrganizersForTheBar(final @RequestBody OrganizersForTheBar organizersForTheBar) {
        organizersForTheBar.setId(idCounter.incrementAndGet());
        organizerssForTheBar.put(organizersForTheBar.getId(), organizersForTheBar);
        return organizersForTheBar;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<OrganizersForTheBar> deleteOrganizersForTheBar(@PathVariable("id") Integer organizersForTheBarId) {
        HttpStatus status = organizerssForTheBar.remove(organizersForTheBarId) == null ? NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<OrganizersForTheBar> updateOrganizersForTheBar(final @PathVariable("id") Integer organizersForTheBarId, final @RequestBody OrganizersForTheBar organizersForTheBar) {
        organizersForTheBar.setId(organizersForTheBarId);
        if (organizerssForTheBar.containsKey(organizersForTheBarId)) {
            return ResponseEntity.ok(organizerssForTheBar.put(organizersForTheBarId, organizersForTheBar));
        } else {
            return ResponseEntity.status(NOT_FOUND).build();
        }
    }

}