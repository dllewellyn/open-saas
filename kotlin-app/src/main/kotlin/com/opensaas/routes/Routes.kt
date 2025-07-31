package com.opensaas.routes

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import com.opensaas.pages.landingPage
import com.opensaas.pages.loginPage
import com.opensaas.pages.signupPage

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
        
        get("/signup") {
            call.respondHtml {
                signupPage()
            }
        }
    }
}