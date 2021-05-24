package com.jaax.senseme

import com.jaax.senseme.entities.Recordatorio
import com.jaax.senseme.services.RecordatorioService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import java.util.*

@Component
class OnBoot( private val service: RecordatorioService ): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        /*val date = Date( System.currentTimeMillis() )
        val sense = Recordatorio( 0, "DATE-updt", "2021-10-01" )
        service.save( sense )*/
    }
}