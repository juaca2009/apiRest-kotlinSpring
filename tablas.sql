CREATE TABLE `vocabularies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ref` char(20) NOT NULL,
  `name` char( 250) NOT NULL,
  `url` char( 250) NOT NULL,
  `version` char(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `status` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

CREATE TABLE concepts (
  idCODE int(250) NOT NULL AUTO_INCREMENT,
  PXORDX	varchar(250),
  OLDPXORDX	varchar(250),
  CODETYPE	varchar(250),
  CONCEPT_CLASS_ID varchar(250),	
  CONCEPT_ID varchar(250),
  VOCABULARY_ID	varchar(250),
  DOMAIN_ID	varchar(250),
  TRACK	varchar(250),
  STANDARD_CONCEPT	varchar(250),
  CODE varchar(250),
  CODEWITHPERIODS	varchar(250),
  CODESCHEME varchar(250),
  LONG_DESC	varchar(250),
  SHORT_DESC 	varchar(250),
  CODE_STATUS	varchar(250),
  CODE_CHANGE	varchar(250),
  CODE_CHANGE_YEAR	varchar(250),
  CODE_PLANNED_TYPE	varchar(250),
  CODE_BILLING_STATUS	varchar(250),
  CODE_CMS_CLAIM_STATUS	varchar(250),
  SEX_CD	varchar(250),
  ANAT_OR_COND	varchar(5),
  POA_CODE_STATUS	varchar(250),
  POA_CODE_CHANGE	varchar(250),
  POA_CODE_CHANGE_YEAR	varchar(250),
  VALID_START_DATE varchar(250),
  VALID_END_DATE	varchar(250),
  INVALID_REASON	varchar(250),
  CREATE_DT varchar(250),
  PRIMARY KEY (idCODE)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

