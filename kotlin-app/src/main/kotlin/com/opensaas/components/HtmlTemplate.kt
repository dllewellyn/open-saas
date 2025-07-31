package com.opensaas.components

import kotlinx.html.*

fun HTML.htmlTemplate(pageTitle: String, content: BODY.() -> Unit) {
    head {
        meta {
            charset = "utf-8"
        }
        meta {
            name = "viewport"
            attributes["content"] = "width=device-width, initial-scale=1"
        }
        title(pageTitle)
        
        // Tailwind CSS via CDN for now
        link {
            href = "https://cdn.tailwindcss.com"
            rel = "stylesheet"
        }
        
        // Custom CSS for gradients and additional styling
        style {
            unsafe {
                +"""
                    .text-gradient-primary {
                        background: linear-gradient(45deg, #8b5cf6, #06b6d4);
                        -webkit-background-clip: text;
                        -webkit-text-fill-color: transparent;
                        background-clip: text;
                    }
                    
                    .btn {
                        @apply inline-flex items-center justify-center rounded-md text-sm font-medium transition-colors focus:outline-none focus:ring-2 focus:ring-offset-2 disabled:opacity-50;
                    }
                    
                    .btn-lg {
                        @apply h-11 px-8 py-2;
                    }
                    
                    .btn-outline {
                        @apply border border-gray-300 bg-transparent text-gray-700 hover:bg-gray-50;
                    }
                    
                    .btn-primary {
                        @apply bg-indigo-600 text-white hover:bg-indigo-700;
                    }
                    
                    .text-foreground {
                        @apply text-gray-900;
                    }
                    
                    .text-muted-foreground {
                        @apply text-gray-600;
                    }
                    
                    .bg-background {
                        @apply bg-white;
                    }
                    
                    @media (prefers-color-scheme: dark) {
                        .dark\\:hidden {
                            display: none;
                        }
                        .hidden.dark\\:block {
                            display: block;
                        }
                    }
                """.trimIndent()
            }
        }
    }
    
    body {
        classes = setOf("bg-background", "text-foreground")
        content()
    }
}