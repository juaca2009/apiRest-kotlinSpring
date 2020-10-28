package com.conceptos_medicos.api.web

import com.conceptos_medicos.api.business.ivocabulario
import com.conceptos_medicos.api.utils.constantes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import com.conceptos_medicos.api.exception.businessException
import com.conceptos_medicos.api.model.vocabulario
import com.conceptos_medicos.api.exception.notFoundException
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(constantes.url_base_vocabularios)
class vocabularioController {
    @Autowired
    val vocabularioBusiness: ivocabulario? = null

    @GetMapping("")
    fun obtener_vocabularios(): ResponseEntity<List<vocabulario>>{
        return try {
            ResponseEntity(vocabularioBusiness!!.obtener_vocabularios(), HttpStatus.OK)
        }
        catch(e: businessException) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun cargar_vocabulario(@PathVariable("id") idvoc:Long): ResponseEntity<Any>{
        return try {
            ResponseEntity(vocabularioBusiness!!.cargar_vocabulario(idvoc), HttpStatus.OK)
        }
        catch(e: businessException) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        catch(e: notFoundException){
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @PostMapping("")
    fun guardar_vocabulario(@RequestBody voca: vocabulario): ResponseEntity<Any>{
        return try {
            vocabularioBusiness!!.guardar_vocabulario(voca)
            val header_respuesta = HttpHeaders()
            header_respuesta.set("location", constantes.url_base_vocabularios + "/" + voca.id)
            ResponseEntity(header_respuesta, HttpStatus.CREATED)
        }
        catch(e: businessException) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @DeleteMapping("/{id}")
    fun eliminar_vocabulario(@PathVariable("id") idvoc: Long): ResponseEntity<Any>{
        return try {
            vocabularioBusiness!!.eliminar_vocabulario(idvoc)
            ResponseEntity(HttpStatus.OK)
        }
        catch(e: businessException) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        catch(e: notFoundException){
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }
}
