package com.bouncingballsite.services;

import com.bouncingballsite.model.Images;
import com.bouncingballsite.repository.ImagesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagesServices {
    @Autowired
    private ImagesRepo imagesRepo;

    public Images fetchAll() {return imagesRepo.fetchCounts();}

}
