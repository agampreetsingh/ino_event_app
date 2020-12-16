package com.inotech.management.eventapp.service.dempgraphics;

import com.inotech.management.eventapp.entities.demographics.District;
import org.springframework.stereotype.Service;

@Service
public interface DistrictService {

    District addDistrict(District district);

    District findByName(String name);
}
