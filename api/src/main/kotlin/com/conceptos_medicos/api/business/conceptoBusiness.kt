package com.conceptos_medicos.api.business

import org.springframework.stereotype.Service
import com.conceptos_medicos.api.model.concepto
import com,conceptos_medicos.api.dao.conceptoRepository
import org.springframework.beans.factory.annotation.Autowired

//no compila pues falta implementar :v
@Service
class  concepto: iconcepto{
    @Autowired
    val conceptoRepository: conceptoRepository? = null
    override fun obtener_concepto(): List<concepto>{
        //falta implementar 
    }

    override fun cargar_concepto(idconc:Long): concepto{
        //falta implementar 
    }

    override fun guardar_concepto(concep:concepto): concepto{
        //falta implementar 
    }

    override fun eliminar_concepto(idconc:Long){
        //falta implementar 
    }
}