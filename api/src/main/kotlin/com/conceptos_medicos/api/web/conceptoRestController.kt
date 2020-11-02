package com.conceptos_medicos.api.web

import com.conceptos_medicos.api.business.iconcepto
import com.conceptos_medicos.api.utils.constantes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import com.conceptos_medicos.api.exception.businessException
import com.conceptos_medicos.api.model.concepto
import com.conceptos_medicos.api.exception.notFoundException
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(constantes.url_base_conceptos)
class conceptoController {
    @Autowired
    val conceptoBusiness: iconcepto? = null

    @GetMapping("")
    fun obtener_concepto(): ResponseEntity<List<concepto>>{
        return try {
            ResponseEntity(conceptoBusiness!!.obtener_concepto(), HttpStatus.OK)
        }
        catch(e: businessException) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{id}")
    fun cargar_vocabulario(@PathVariable("id") idconc:Long): ResponseEntity<Any>{
        return try {
            ResponseEntity(conceptoBusiness!!.cargar_concepto(idconc), HttpStatus.OK)
        }
        catch(e: businessException) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        catch(e: notFoundException){
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @PostMapping("")
    fun guardar_concepto(@RequestBody concep: concepto): ResponseEntity<Any>{
        return try {
            conceptoBusiness!!.guardar_concepto(concep)
            val header_respuesta = HttpHeaders()
            header_respuesta.set("location", constantes.url_base_conceptos + "/" + concep.idCODE)
            ResponseEntity(header_respuesta, HttpStatus.CREATED)
        }
        catch(e: businessException) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @DeleteMapping("/{id}")
    fun eliminar_concepto(@PathVariable("id") idconc: Long): ResponseEntity<Any>{
        return try {
            conceptoBusiness!!.eliminar_concepto(idconc)
            ResponseEntity(HttpStatus.OK)
        }
        catch(e: businessException) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
        catch(e: notFoundException){
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @PutMapping("")
    fun actualizar_concepto(@RequestBody concep: concepto): ResponseEntity<Any>{
        return try {
            conceptoBusiness!!.guardar_concepto(concep)
            ResponseEntity(HttpStatus.OK)
        }
        catch(e: businessException) {
            ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

}