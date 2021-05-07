package com.jaax.senseme

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SensemeApplication

fun main(args: Array<String>) {
	runApplication<SensemeApplication>(*args)
}
