package com.example.homework2.address.service.entityservice;

import com.example.homework2.address.dao.StreetDao;
import com.example.homework2.address.entity.Street;
import com.example.homework2.generic.service.BaseEntityService;
import org.springframework.stereotype.Service;

@Service
public class StreetServiceEntityService extends BaseEntityService<Street, StreetDao> {

    public StreetServiceEntityService(StreetDao dao) {super(dao);}

}
