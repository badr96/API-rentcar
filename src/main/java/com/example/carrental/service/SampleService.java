package com.example.carrental.service;

import com.example.carrental.model.Sample;
import com.example.carrental.repository.SampleRepository;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    public Sample save(Sample sample) {
        return sampleRepository.saveAndFlush(sample);
    }

    public Optional<Sample> getOne(String PlateNumber){
        return sampleRepository.findByPlateNumber(PlateNumber);
    }
    public List<Sample> findAll(){
    	return sampleRepository.findAll();
    }
    
    
}
