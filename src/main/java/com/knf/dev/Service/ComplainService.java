package com.knf.dev.Service;

import com.knf.dev.models.Complain;
import com.knf.dev.repository.ComplainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class ComplainService {

    @Autowired
    private ComplainRepository complainRepository;

    public ComplainService(ComplainRepository complainRepository) {
        this.complainRepository = complainRepository;
    }

    public Complain saveComplain(Complain complain)
    {
        return complainRepository.save(complain);
    }
}
