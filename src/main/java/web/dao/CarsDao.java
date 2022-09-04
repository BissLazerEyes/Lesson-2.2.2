package web.dao;

import web.model.Cars;

import java.util.List;

public interface CarsDao {
    List<Cars> getCars(int count);
}