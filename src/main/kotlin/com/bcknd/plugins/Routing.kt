package com.bcknd.plugins

import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Simple build")
        }

        get("/healthcheck") {
            call.respond(HttpStatusCode.OK, "Status 200")
        }
    }
}
