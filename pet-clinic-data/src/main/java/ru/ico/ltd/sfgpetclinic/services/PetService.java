package ru.ico.ltd.sfgpetclinic.services;

import ru.ico.ltd.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
