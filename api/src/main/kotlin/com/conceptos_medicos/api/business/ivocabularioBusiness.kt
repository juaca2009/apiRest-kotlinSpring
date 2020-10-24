package com.conceptos_medicos.api.business

import com.conceptos_medicos.api.model.vocabulario

interface ivocabulario{
    fun obtener_vocabularios(): List<vocabulario>
    fun cargar_vocabulario(idvoc:Long): vocabulario
    fun guardar_vocabulario(voca:vocabulario): vocabulario
    fun eliminar_vocabulario(idvoc:Long)
}