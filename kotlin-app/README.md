# Kotlin OpenSaaS Application

This directory contains the Kotlin conversion of the OpenSaaS template, built with:

- **Ktor** - Modern Kotlin web framework
- **kotlinx.html** - Type-safe HTML generation
- **Exposed** - Kotlin SQL framework (to be added)
- **Gradle** - Build system

## Quick Start

```bash
cd kotlin-app
./gradlew run
```

The application will start at http://localhost:8080

## Available Pages

- `/` - Landing page
- `/login` - Login form

## Architecture

- `src/main/kotlin/com/opensaas/Application.kt` - Main application setup
- `src/main/kotlin/com/opensaas/routes/` - Route definitions
- `src/main/kotlin/com/opensaas/pages/` - Page components using kotlinx.html
- `src/main/kotlin/com/opensaas/components/` - Reusable HTML components

## Status

This is a proof-of-concept demonstrating the conversion from React/TypeScript to Kotlin/kotlinx.html. See `../KOTLIN_CONVERSION_PLAN.md` for the complete roadmap.