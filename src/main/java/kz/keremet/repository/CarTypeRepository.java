package kz.keremet.repository;

import kz.keremet.model.entity.CarType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 02.09.2016.
 */
public interface CarTypeRepository extends JpaRepository<CarType, Integer> {
}
