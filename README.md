# AegisFlow

**Secure Software Supply Chain & Cloud Security Platform**

AegisFlow centralizes software supply chain security. It ingests results from
existing security tools (SBOMs, SCA, SAST, IaC, secrets and container scans),
normalizes and correlates them, prioritizes risk with an explainable
deterministic engine, and gates releases through versioned, auditable policies.

> **Status:** early development (Phase 0/1 — project foundation).
> Nothing here is production-ready yet.

## Tech stack (current)

| Area | Choice |
|---|---|
| Language | Java 25 (LTS) |
| Framework | Spring Boot 4.1.x |
| Build | Gradle (Kotlin DSL) |
| Database | PostgreSQL + Flyway |
| Security | Spring Security, OAuth2 Resource Server (OIDC) |
| Tests | JUnit, Testcontainers |

Architecture: Modular Monolith, Clean Architecture, Ports and Adapters.
See `docs/adr/` for the reasoning behind each decision.

## Prerequisites

- JDK 25
- Docker (required by Testcontainers)

## Build and test

```bash
./gradlew build
```

## Roadmap

Phases 0 to 11 are tracked in the project roadmap (to be published under `docs/`).