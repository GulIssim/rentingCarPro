package kz.keremet.repository;

import kz.keremet.model.entity.Car;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by HP on 02.09.2016.
 */
@Transactional
public interface CarRepository extends JpaRepository<Car, Integer> {
  /*  @Query("select b from Car b where b.reg_no = :reg_no")
    Car findByName(@Param("reg_no") String reg_no);*/

}
