package com.opensaas.routes

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import com.opensaas.pages.landingPage
import com.opensaas.pages.loginPage

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondHtml {
                landingPage()
            }
        }
        
        get("/login") {
            call.respondHtml {
                loginPage()
            }
        }
    }
}