package ru.ico.ltd.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.ico.ltd.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
