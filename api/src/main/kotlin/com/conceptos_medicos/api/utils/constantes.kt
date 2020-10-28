package com.conceptos_medicos.api.utils

class constantes {
    companion object{
        private const val url_api_base = "/api"
        private const val url_tipo = "/medica"
        private const val url_base = url_api_base + url_tipo
        //endpoints para vocavularios
        const val url_base_vocabularios = "$url_base/vocabularios" 
        //endpoints para conceptos
        const val url_base_conceptos = "$url_base/conceptos"
    }
}