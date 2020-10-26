package com.conceptos_medicos.api.business

import org.springframework.stereotype.Service
import com.conceptos_medicos.api.model.vocabulario
import com.conceptos_medicos.api.exception.businessException
import com.conceptos_medicos.api.exception.notFoundException
import com.conceptos_medicos.api.dao.vocabularioRepository
import org.springframework.beans.factory.annotation.Autowired
import java.util.*


@Service
class vocabulario: ivocabulario{
     @Autowired
    val vocabularioRepository: vocabularioRepository? = null

    @Throws(businessException::class)
    override fun obtener_vocabularios(): List<vocabulario>{
        try {
            return vocabularioRepository!!.findAll()
        }catch(e:Exception) {
            throw businessException(e.message)
         }
    }

    @Throws(businessException::class, notFoundException::class)
    override fun cargar_vocabulario(idvoc:Long): vocabulario{
        val op: Optional<vocabulario>
        try {
            op = vocabularioRepository!!.findById(idvoc)
        }catch(e:Exception) {
            throw businessException(e.message)
        }
        if(!op.isPresent){
            throw notFoundException("No se encuentra el vocabulario con id =$idvoc")
        }
        return op.get()
    }

    @Throws(businessException::class)
    override fun guardar_vocabulario(voca:vocabulario): vocabulario{
        try {
            return vocabularioRepository!!.save(voca)
        }catch(e:Exception) {
            throw businessException(e.message)
        }
    }

    @Throws(businessException::class, notFoundException::class)
    override fun eliminar_vocabulario(idvoc:Long){
        val op: Optional<vocabulario>
        try {
            op = vocabularioRepository!!.findById(idvoc)
        }catch(e:Exception) {
            throw businessException(e.message)
        }
        if(!op.isPresent){
            throw notFoundException("No se encuentra el vocabulario con id=$idvoc")
        }else{
            try {
                vocabularioRepository!!.deleteById(idvoc)
            }catch(e:Exception) {
                throw businessException(e.message)
               }
        }  
    }
}