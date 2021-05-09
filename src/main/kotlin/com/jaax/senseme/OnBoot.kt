package com.jaax.senseme

import com.jaax.senseme.entities.Recordatorio
import com.jaax.senseme.services.RecordatorioService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import java.util.Date

@Component
class OnBoot( private val service: RecordatorioService ): ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
  /*     val date = Date( System.currentTimeMillis() )
        val sense = Recordatorio( 2, "DATE-updt", date )
        println( " FECHA -> " + date )
        service.update( sense )

*/
    }
}