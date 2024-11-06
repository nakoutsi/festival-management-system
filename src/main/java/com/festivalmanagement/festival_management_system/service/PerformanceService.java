package com.festivalmanagement.festival_management_system.service;

import com.festivalmanagement.festival_management_system.Performance;
import com.festivalmanagement.festival_management_system.repository.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerformanceService {

    private final PerformanceRepository performanceRepository;

    @Autowired
    public PerformanceService(PerformanceRepository performanceRepository) {
        this.performanceRepository = performanceRepository;
    }

    public List<Performance> findAllPerformances() {
        return performanceRepository.findAll();
    }

    public Optional<Performance> findPerformanceById(Long id) {
        return performanceRepository.findById(id);
    }

    public Performance savePerformance(Performance performance) {
        return performanceRepository.save(performance);
    }

    public void deletePerformance(Long id) {
        performanceRepository.deleteById(id);
    }
}
