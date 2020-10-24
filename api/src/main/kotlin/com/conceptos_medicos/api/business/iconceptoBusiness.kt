package com.conceptos_medicos.api.business

import com.conceptos_medicos.api.model.concepto

interface iconcepto{
    fun obtener_concepto(): List<concepto>
    fun cargar_concepto(idconc:Long): concepto
    fun guardar_concepto(concep:concepto): concepto
    fun eliminar_concepto(idconc:Long)
}