package com.jaax.senseme.entities

import com.fasterxml.jackson.annotation.JsonFormat
import java.util.*
import javax.persistence.*

@Entity
@Table( name = "recordatorios" )
data class Recordatorio(
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    @Column( name = "id" )
    val id: Int = 0,
    @Column( name = "texto" )
    var text: String = "",
    @Column( name = "fecha" )
    @Temporal( value = TemporalType.DATE )
    @JsonFormat( pattern = "dd-MM-yyyy" )
    var date: Date
)