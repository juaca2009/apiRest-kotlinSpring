package com.conceptos_medicos.api.model

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue
import java.util.*


@Entity
@Table(name = "concepto")
data class concepto(val idCODE:Long = 0, val PXORDX:String = "", val OLDPXORDX:String = "", val CODETYPE:String = "", val CONCEPT_CLASS_ID:String = "", val CONCEPT_ID:String = "", val VOCABULARY_ID:String = "", val DOMAIN_ID:String = "", val TRACK:String = "", val STANDARD_CONCEPT:String = "", 
                    val CODE:String = "", val CODEWITHPERIODS:String = "", val CODESCHEME:String = "", val LONG_DESC:String = "", val SHORT_DESC:String = "", val CODE_STATUS:String = "", val CODE_CHANGE:String = "", val CODE_CHANGE_YEAR:String = "", val CODE_PLANNED_TYPE:String = "", 
                    val CODE_BILLING_STATUS:String = "", val CODE_CMS_CLAIM_STATUS:String = "", val SEX_CD:String = "", val ANAT_OR_COND:String = "", val  POA_CODE_STATUS:String = "", val POA_CODE_CHANGE:String = "", val POA_CODE_CHANGE_YEAR:String = "", val VALID_START_DATE:String = "", val VALID_END_DATE:String = "", val INVALID_REASON:String = "", val CREATE_DT:String = "") {
    @Id
    @GeneratedValue(Strategy = GenerationType.AUTO)
    var idd:Long = 0
}