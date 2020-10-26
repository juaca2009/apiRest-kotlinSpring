package com.conceptos_medicos.api.business

import org.springframework.stereotype.Service
import com.conceptos_medicos.api.model.concepto
import com.conceptos_medicos.api.exception.businessException
import com.conceptos_medicos.api.exception.notFoundException
import com.conceptos_medicos.api.dao.conceptoRepository
import org.springframework.beans.factory.annotation.Autowired
import java.util.*


@Service
class  concepto: iconcepto{
    @Autowired
    val conceptoRepository: conceptoRepository? = null

    @Throws(businessException::class)
    override fun obtener_concepto(): List<concepto>{
        try {
            return conceptoRepository!!.findAll()
        }catch(e:Exception){
            throw businessException(e.message)
         }
    }

    @Throws(businessException::class, notFoundException::class)
    override fun cargar_concepto(idconc:Long): concepto{
        val op: Optional<concepto>
        try {
            op = conceptoRepository!!.findById(idconc)
        }catch(e:Exception) {
            throw businessException(e.message)
        }
        if(!op.isPresent){
            throw notFoundException("No se encuentra el concepto con id =$idconc")
        }
        return op.get()
    }

    @Throws(businessException::class)
    override fun guardar_concepto(concep:concepto): concepto{
        try {
            return conceptoRepository!!.save(concep)
        }catch(e:Exception) {
            throw businessException(e.message)
        }
    }


    @Throws(businessException::class, notFoundException::class)
    override fun eliminar_concepto(idconc:Long){
        val op: Optional<concepto>
        try {
            op = conceptoRepository!!.findById(idconc)
        }
        catch(e:Exception) {
            throw businessException(e.message)
        }
        if(!op.isPresent){
            throw notFoundException("No se encuentra el vocabulario con id=$idconc")
        }
        else{
            try {
                conceptoRepository!!.deleteById(idconc)
            }
            catch(e:Exception ) {
                throw businessException(e.message)
            }
        }
    }
}
