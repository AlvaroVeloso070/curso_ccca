package com.course.ccca.infra.persistence.cupom;

import com.course.ccca.domain.cupom.Cupom;
import com.course.ccca.infra.common.Mapper;

public class CupomMapper extends Mapper{
    public static CupomEntity toEntity(Cupom cupom){
        return map(cupom, CupomEntity.class);
    }
    public static Cupom toDomain(CupomEntity cupomEntity){
        return map(cupomEntity, Cupom.class);
    }
}
