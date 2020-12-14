package com.example.basics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Bean

@SpringBootApplication
class BasicsApplication {

    @Bean
    fun runner (fs : FilmService, cs : CityService) = ApplicationListener<ApplicationReadyEvent> {
//        testing()
        show("str1", "str2")
//        fs.all().forEach { println(toLower(it.title)) }
//        cs.all().forEach { println(toLower(it.city)) }
    }
}

fun main(args: Array<String>) {
    runApplication<BasicsApplication>(*args)
}


