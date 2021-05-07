package com.jaax.senseme.services

import com.jaax.senseme.dao.RecordatorioDAO
import com.jaax.senseme.entities.Recordatorio
import org.springframework.dao.DuplicateKeyException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class RecordatorioService( val recordatorioDAO: RecordatorioDAO ): BasicCRUD<Recordatorio, Int> {

    override fun findAll() = recordatorioDAO.findAll()

    override fun findById(id: Int) = recordatorioDAO.findByIdOrNull( id )

    override fun save(t: Recordatorio): Recordatorio {
        return if( !recordatorioDAO.existsById(t.id) ){
            recordatorioDAO.save(t)
        } else {
            throw DuplicateKeyException( "${t.id} ya existe" )
        }
    }

    override fun update(t: Recordatorio): Recordatorio {
        return if( recordatorioDAO.existsById(t.id) ){
            recordatorioDAO.save(t)
        } else {
            throw EntityNotFoundException( "${t.id} no existe" )
        }
    }

    override fun deleteById(id: Int): Recordatorio {
        return this.findById(id)?.apply {
            this@RecordatorioService.recordatorioDAO.deleteById(id)
        } ?: throw EntityNotFoundException( "$id no existe" )
    }
}