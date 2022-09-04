package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarsDao {
    private static final List<Cars> carList = new ArrayList<>();

    static {
        carList.add(new Cars("Модель: Toyota Prius","Год выпуска: 2012", "Стоимость: 1.133.000 рублей"));
        carList.add(new Cars("Модель: Ford Focus","Год выпуска: 2012", "Стоимость: 759.000 рублей"));
        carList.add(new Cars("Модель: Hyundai Solaris","Год выпуска: 2019", "Стоимость: 1.093.000 рублей"));
        carList.add(new Cars("Модель: Volkswagen Passat CC","Год выпуска: 2012", "Стоимость: 899.000 рублей"));
        carList.add(new Cars("Модель: Skoda Yeti","Год выпуска: 2011", "Стоимость: 688.000 рублей"));
    }

    @Override
    public List<Cars> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}