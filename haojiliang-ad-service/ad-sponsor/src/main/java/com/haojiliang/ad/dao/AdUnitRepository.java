package com.haojiliang.ad.dao;

import com.haojiliang.ad.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdUnitRepository extends JpaRepository<AdUnit, Long> {

    AdUnit findByPlanIdAndUnitName(Long palnId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);

}
