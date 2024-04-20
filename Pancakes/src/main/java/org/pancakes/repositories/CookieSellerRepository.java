package org.pancakes.repositories;

import org.pancakes.entities.CookieSeller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CookieSellerRepository extends JpaRepository<CookieSeller, Integer> {
}
