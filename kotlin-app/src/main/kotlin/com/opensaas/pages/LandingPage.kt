package com.opensaas.pages

import kotlinx.html.*
import com.opensaas.components.htmlTemplate

fun HTML.landingPage() {
    htmlTemplate("OpenSaaS - Your SaaS Solution") {
        main {
            classes = setOf("isolate")
            
            // Hero Section
            div {
                classes = setOf("relative", "pt-14", "w-full")
                
                // Background gradients would be handled via CSS
                div {
                    classes = setOf("md:p-24")
                    
                    div {
                        classes = setOf("mx-auto", "max-w-8xl", "px-6", "lg:px-8")
                        
                        div {
                            classes = setOf("lg:mb-18", "mx-auto", "max-w-3xl", "text-center")
                            
                            h1 {
                                classes = setOf("text-5xl", "font-bold", "text-foreground", "sm:text-6xl")
                                +"Some "
                                span {
                                    classes = setOf("italic")
                                    +"cool"
                                }
                                +" words about "
                                span {
                                    classes = setOf("text-gradient-primary")
                                    +"your product"
                                }
                            }
                            
                            p {
                                classes = setOf("mt-6", "mx-auto", "max-w-2xl", "text-lg", "leading-8", "text-muted-foreground")
                                +"With some more exciting words about your product!"
                            }
                            
                            div {
                                classes = setOf("mt-10", "flex", "items-center", "justify-center", "gap-x-6")
                                
                                a {
                                    href = "/pricing"
                                    classes = setOf("btn", "btn-outline", "btn-lg")
                                    +"Learn More"
                                }
                                
                                a {
                                    href = "/signup"
                                    classes = setOf("btn", "btn-primary", "btn-lg")
                                    +"Get Started "
                                    span {
                                        attributes["aria-hidden"] = "true"
                                        +"→"
                                    }
                                }
                            }
                        }
                        
                        div {
                            classes = setOf("mt-14", "flow-root", "sm:mt-14")
                            
                            div {
                                classes = setOf("hidden", "md:flex", "m-2", "justify-center", "rounded-xl", "lg:-m-4", "lg:rounded-2xl", "lg:p-4")
                                
                                img {
                                    src = "/static/open-saas-banner-light.png"
                                    alt = "App screenshot"
                                    classes = setOf("rounded-md", "shadow-2xl", "ring-1", "ring-gray-900/10", "dark:hidden")
                                    attributes["width"] = "1000"
                                    attributes["height"] = "530"
                                    attributes["loading"] = "lazy"
                                }
                                
                                img {
                                    src = "/static/open-saas-banner-dark.png"
                                    alt = "App screenshot"
                                    classes = setOf("rounded-md", "shadow-2xl", "ring-1", "ring-gray-900/10", "hidden", "dark:block")
                                    attributes["width"] = "1000"
                                    attributes["height"] = "530"
                                    attributes["loading"] = "lazy"
                                }
                            }
                        }
                    }
                }
            }
            
            // Features section placeholder
            div {
                classes = setOf("py-24", "sm:py-32")
                
                div {
                    classes = setOf("mx-auto", "max-w-7xl", "px-6", "lg:px-8")
                    
                    div {
                        classes = setOf("mx-auto", "max-w-2xl", "text-center")
                        
                        h2 {
                            classes = setOf("text-3xl", "font-bold", "tracking-tight", "text-gray-900", "sm:text-4xl")
                            +"Features that make you stand out"
                        }
                        
                        p {
                            classes = setOf("mt-6", "text-lg", "leading-8", "text-gray-600")
                            +"Everything you need to build a modern SaaS application."
                        }
                    }
                }
            }
        }
        
        // Footer placeholder
        footer {
            classes = setOf("bg-gray-50")
            
            div {
                classes = setOf("mx-auto", "max-w-7xl", "px-6", "py-12", "md:flex", "md:items-center", "md:justify-between", "lg:px-8")
                
                p {
                    classes = setOf("text-xs", "leading-5", "text-gray-500")
                    +"© 2024 Your Company, Inc. All rights reserved."
                }
            }
        }
    }
}