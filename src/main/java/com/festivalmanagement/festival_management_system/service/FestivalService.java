package com.festivalmanagement.festival_management_system.service;

import com.festivalmanagement.festival_management_system.Festival;
import com.festivalmanagement.festival_management_system.repository.FestivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FestivalService {

    private final FestivalRepository festivalRepository;

    @Autowired
    public FestivalService(FestivalRepository festivalRepository) {
        this.festivalRepository = festivalRepository;
    }

    public List<Festival> findAllFestivals() {
        return festivalRepository.findAll();
    }

    public Optional<Festival> findFestivalById(Long id) {
        return festivalRepository.findById(id);
    }

    public Festival saveFestival(Festival festival) {
        return festivalRepository.save(festival);
    }

    public void deleteFestival(Long id) {
        festivalRepository.deleteById(id);
    }
}
