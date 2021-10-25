package com.salesianostriana.dam.e07ModeloManytoMany.repository;

import com.salesianostriana.dam.e07ModeloManytoMany.model.AddedTo;
import com.salesianostriana.dam.e07ModeloManytoMany.model.AddedToPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPK> {
}
