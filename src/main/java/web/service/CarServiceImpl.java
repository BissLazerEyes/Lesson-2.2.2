package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Cars;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarsDao carsDao;

    public CarServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    @Override
    public List<Cars> getCars(int count) {
        return carsDao.getCars(count);
    }
}