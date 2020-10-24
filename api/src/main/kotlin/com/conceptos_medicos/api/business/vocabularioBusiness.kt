package com.conceptos_medicos.api.business

import org.springframework.stereotype.Service
import com.conceptos_medicos.api.model.vocabulario
import com,conceptos_medicos.api.dao.vocabularioRepository
import org.springframework.beans.factory.annotation.Autowired

//no compila pues falta implementar :v
@Service
class vocabulario: ivocabulario{
     @Autowired
    val vocabularioRepository: vocabularioRepository? = null
    override fun obtener_vocabularios(): List<vocabulario>{
       //falta implementar 
    }

    override fun cargar_vocabulario(idvoc:Long): vocabulario{
        //falta implementar 
    }

    override fun guardar_vocabulario(voca:vocabulario): vocabulario{
        //falta implementar 
    }

    override fun eliminar_vocabulario(idvoc:Long){
        //falta implementar 
    }
    
}