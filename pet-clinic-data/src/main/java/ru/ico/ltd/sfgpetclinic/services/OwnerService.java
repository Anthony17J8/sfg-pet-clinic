package ru.ico.ltd.sfgpetclinic.services;

import ru.ico.ltd.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
