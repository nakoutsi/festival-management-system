package com.festivalmanagement.festival_management_system.repository;

import com.festivalmanagement.festival_management_system.Festival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestivalRepository extends JpaRepository<Festival, Long> {
    // Μπορείς να προσθέσεις επιπλέον μεθόδους αν χρειαστεί
}
