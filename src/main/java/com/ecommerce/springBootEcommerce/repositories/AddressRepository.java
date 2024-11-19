package com.ecommerce.springBootEcommerce.repositories;

import com.ecommerce.springBootEcommerce.model.Address;
import org.hibernate.query.criteria.JpaDerivedRoot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
