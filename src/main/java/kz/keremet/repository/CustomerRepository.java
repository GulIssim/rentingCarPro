package kz.keremet.repository;

import kz.keremet.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HP on 02.09.2016.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
