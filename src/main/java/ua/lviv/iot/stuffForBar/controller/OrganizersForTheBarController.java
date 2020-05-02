package ua.lviv.iot.stuffForBar.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.business.OrganizersForTheBarService;
import ua.lviv.iot.stuffForBar.model.OrganizersForTheBar;

import java.util.List;


import static org.springframework.http.HttpStatus.NOT_FOUND;
import static org.springframework.http.HttpStatus.OK;

@RequestMapping("/organizersForTheBar")
@RestController
public class OrganizersForTheBarController {

    @Autowired
    private OrganizersForTheBarService organizersForTheBarService;

    @GetMapping(path = "/{id}")
    public OrganizersForTheBar getOrganizersForTheBar(final @PathVariable("id") Integer id) {
        return organizersForTheBarService.getOrganizersForTheBar(id);
    }


    @GetMapping
    public List<OrganizersForTheBar> getOrganizersForTheBar() {
        return organizersForTheBarService.getOrganizersForTheBar();
    }


    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public OrganizersForTheBar createOrganizersForTheBar(final @RequestBody OrganizersForTheBar organizersForTheBar) {
        return organizersForTheBarService.createOrganizersForTheBar(organizersForTheBar);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<OrganizersForTheBar> deleteOrganizersForTheBar(@PathVariable("id") Integer organizersForTheBarId) {
        if (organizersForTheBarService.existOrganizersForTheBar(organizersForTheBarId)) {
            organizersForTheBarService.deleteOrganizersForTheBar(organizersForTheBarId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(NOT_FOUND).build();
        }
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<OrganizersForTheBar> updateOrganizersForTheBar(final @PathVariable("id") Integer organizersForTheBarId,
                                                 final @RequestBody OrganizersForTheBar organizersForTheBar) {
        return (organizersForTheBarService.existOrganizersForTheBar(organizersForTheBarId)) ? ResponseEntity.ok(organizersForTheBarService.updateOrganizersForTheBar(organizersForTheBarId, organizersForTheBar)) :
                ResponseEntity.status(NOT_FOUND).build();

    }

}