package com.jaax.senseme.controller

import com.jaax.senseme.entities.Recordatorio
import com.jaax.senseme.services.RecordatorioService
import com.jaax.senseme.utils.Constants
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping( Constants.ENDPOINT_RECORDATORIO )
class RecordatorioController( recordatorioService: RecordatorioService ): BasicController<Recordatorio, Int>(recordatorioService)