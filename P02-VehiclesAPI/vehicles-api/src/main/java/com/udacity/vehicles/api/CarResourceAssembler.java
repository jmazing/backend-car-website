package com.udacity.vehicles.api;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import com.udacity.vehicles.domain.car.Car;

/**
 * Maps the CarController to the Car class using HATEOAS
 */
@Component
public class CarResourceAssembler implements RepresentationModelAssembler<Car, EntityModel<Car>> {

    @Override
    public EntityModel<Car> toModel(Car car) {
        EntityModel<Car> carEntityModel = EntityModel.of(car);
        Link selfLink = linkTo(methodOn(CarController.class).get(car.getId())).withSelfRel();
        carEntityModel.add(selfLink);
        return carEntityModel;
    }
}
