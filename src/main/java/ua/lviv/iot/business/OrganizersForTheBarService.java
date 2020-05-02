package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.OrganizersForTheBarRepository;
import ua.lviv.iot.stuffForBar.model.OrganizersForTheBar;

import java.util.List;

@Service
public class OrganizersForTheBarService {
    @Autowired
    private OrganizersForTheBarRepository organizersForTheBarRepository;

    public OrganizersForTheBar createOrganizersForTheBar(OrganizersForTheBar organizersForTheBar) {
        return organizersForTheBarRepository.save(organizersForTheBar);
    }

    public boolean existOrganizersForTheBar(Integer id) {
        return organizersForTheBarRepository.existsById(id);
    }
    public OrganizersForTheBar getOrganizersForTheBar(Integer id) {
        return organizersForTheBarRepository.findById(id).get();
    }

    public List<OrganizersForTheBar> getOrganizersForTheBar() {
        return organizersForTheBarRepository.findAll();
    }

    public void deleteOrganizersForTheBar(Integer id) {
        organizersForTheBarRepository.deleteById(id);
    }

    public OrganizersForTheBar updateOrganizersForTheBar(Integer id, OrganizersForTheBar organizersForTheBar) {
        OrganizersForTheBar organizerssForTheBar = organizersForTheBarRepository.findById(id).get();
        organizersForTheBar.setId(id);
        organizerssForTheBar.setId(id);
        organizersForTheBarRepository.save(organizersForTheBar);
        return organizerssForTheBar;
    }
}
