package com.bcknd.plugins

import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Simple build")
        }

        get("/healthcheck") {
            val curTime = LocalDateTime.now(ZoneId.of("GMT+2"))
            val time = curTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            val message = "Status 200   Time: $time"

            call.respondText(message, ContentType.Text.Html, HttpStatusCode.OK)
        }
    }
}
