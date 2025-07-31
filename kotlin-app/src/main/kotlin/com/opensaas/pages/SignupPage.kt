package com.opensaas.pages

import kotlinx.html.*
import com.opensaas.components.htmlTemplate

fun HTML.signupPage() {
    htmlTemplate("Sign Up - OpenSaaS") {
        main {
            classes = setOf("min-h-screen", "flex", "items-center", "justify-center", "py-12", "px-4", "sm:px-6", "lg:px-8")
            
            div {
                classes = setOf("max-w-md", "w-full", "space-y-8")
                
                div {
                    h2 {
                        classes = setOf("mt-6", "text-center", "text-3xl", "font-extrabold", "text-gray-900")
                        +"Create your account"
                    }
                }
                
                form {
                    classes = setOf("mt-8", "space-y-6")
                    action = "/auth/signup"
                    method = FormMethod.post
                    
                    div {
                        classes = setOf("rounded-md", "shadow-sm", "-space-y-px")
                        
                        div {
                            label {
                                classes = setOf("sr-only")
                                htmlFor = "email"
                                +"Email address"
                            }
                            input {
                                id = "email"
                                name = "email"
                                type = InputType.email
                                autoComplete = true
                                required = true
                                classes = setOf("relative", "block", "w-full", "px-3", "py-2", "border", "border-gray-300", "placeholder-gray-500", "text-gray-900", "rounded-t-md", "focus:outline-none", "focus:ring-indigo-500", "focus:border-indigo-500", "focus:z-10", "sm:text-sm")
                                placeholder = "Email address"
                            }
                        }
                        
                        div {
                            label {
                                classes = setOf("sr-only")
                                htmlFor = "password"
                                +"Password"
                            }
                            input {
                                id = "password"
                                name = "password"
                                type = InputType.password
                                autoComplete = true
                                required = true
                                classes = setOf("relative", "block", "w-full", "px-3", "py-2", "border", "border-gray-300", "placeholder-gray-500", "text-gray-900", "focus:outline-none", "focus:ring-indigo-500", "focus:border-indigo-500", "focus:z-10", "sm:text-sm")
                                placeholder = "Password"
                            }
                        }
                        
                        div {
                            label {
                                classes = setOf("sr-only")
                                htmlFor = "confirmPassword"
                                +"Confirm Password"
                            }
                            input {
                                id = "confirmPassword"
                                name = "confirmPassword"
                                type = InputType.password
                                autoComplete = true
                                required = true
                                classes = setOf("relative", "block", "w-full", "px-3", "py-2", "border", "border-gray-300", "placeholder-gray-500", "text-gray-900", "rounded-b-md", "focus:outline-none", "focus:ring-indigo-500", "focus:border-indigo-500", "focus:z-10", "sm:text-sm")
                                placeholder = "Confirm Password"
                            }
                        }
                    }
                    
                    div {
                        button {
                            type = ButtonType.submit
                            classes = setOf("group", "relative", "w-full", "flex", "justify-center", "py-2", "px-4", "border", "border-transparent", "text-sm", "font-medium", "rounded-md", "text-white", "bg-indigo-600", "hover:bg-indigo-700", "focus:outline-none", "focus:ring-2", "focus:ring-offset-2", "focus:ring-indigo-500")
                            +"Create Account"
                        }
                    }
                    
                    div {
                        classes = setOf("text-center", "text-sm")
                        
                        span {
                            classes = setOf("text-gray-600")
                            +"I already have an account ("
                        }
                        a {
                            href = "/login"
                            classes = setOf("font-medium", "text-indigo-600", "hover:text-indigo-500")
                            +"go to login"
                        }
                        span {
                            classes = setOf("text-gray-600")
                            +")."
                        }
                    }
                }
            }
        }
    }
}