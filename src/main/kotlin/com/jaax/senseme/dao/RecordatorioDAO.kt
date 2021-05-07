package com.jaax.senseme.dao

import com.jaax.senseme.entities.Recordatorio
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RecordatorioDAO: JpaRepository< Recordatorio, Int >