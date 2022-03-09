package net.rudoy.customerrest.repository;

import net.rudoy.customerrest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for{@link Customer} class.
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
