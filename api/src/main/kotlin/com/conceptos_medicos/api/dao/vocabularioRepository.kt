package com.conceptos_medicos.api.dao

import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import com.conceptos_medicos.api.model.vocabulario

@Repository
interface vocabularioRepository: JpaRepository<vocabulario,Long>