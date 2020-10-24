package com.conceptos_medicos.api.model

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue
import java.util.*


@Entity
@Table(name = "concepto")
data class concepto(val idcode:Long = 0, val pxordx:String = "", val oldpxordx:String = "", val codetype:String = "", val concep_class_id:String = "", val concep_if:String = "", val vocabulary_id:String = "", val domain_id:String = "", val track:String = "", val standar_concept:String = "", 
                    val code:String = "", val code_periord:String = "", val code_scheme:String = "", val long_desc:String = "", val short_desc:String = "", val cade_status:String = "", val code_change:String = "", val code_change_year:String = "", val code_planned_type:String = "", 
                    val code_billing:String = "", val code_cms:String = "", val sex:String = "", val anat_or_cond:String = "", val poa_code_status:String = "", val poa_code_change:String = "", val poa_code_change_year:String = "", val valid_start_date:String = "", val valid_end_date:String = "", val invalid_reason:String = "", val create_dt:String = "") {
    @Id
    @GeneratedValue(Strategy = GenerationType.AUTO)
    var idd:Long = 0
}