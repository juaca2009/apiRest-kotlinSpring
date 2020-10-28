package com.conceptos_medicos.api.model

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue
import java.util.*


@Entity
@Table(name = "vocabulario")
data class vocabulario(val id:Long = 0, val ref:String = "", val name:String = "", val url:String = "", 
                       val version:String = "",  val description:String = "", val status:String = "") {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var idd:Long = 0
}