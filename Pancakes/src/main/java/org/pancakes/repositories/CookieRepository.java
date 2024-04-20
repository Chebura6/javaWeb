package org.pancakes.repositories;

import org.pancakes.entities.Cookie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CookieRepository extends JpaRepository<Cookie, Integer> {
}
