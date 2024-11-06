package com.festivalmanagement.festival_management_system.repository;

import com.festivalmanagement.festival_management_system.Performance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    // Μπορείς να προσθέσεις επιπλέον μεθόδους αν χρειαστεί
}
