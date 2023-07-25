package org.example.vehicle.factory;

public interface AbstractFactory<T> {
    T create(String vehicleType) throws Exception;
}
