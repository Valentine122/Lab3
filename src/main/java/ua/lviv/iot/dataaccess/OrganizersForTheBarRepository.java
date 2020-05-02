package ua.lviv.iot.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.stuffForBar.model.OrganizersForTheBar;

@Repository
public interface OrganizersForTheBarRepository extends JpaRepository<OrganizersForTheBar, Integer> {
}
