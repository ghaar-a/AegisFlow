# ADR 0001: Initial technology stack

- **Status:** Accepted
- **Date:** 2026-11-23

## Context

AegisFlow is a portfolio-grade platform focused on software supply chain
security, built with Java backend engineering as its core specialty. The stack
must be stable, supported and compatible, favoring maturity over novelty.

## Decision

- **Java 25 (LTS).** Spring Boot 4 keeps a Java 17 baseline, so Java 25 is supported.
- **Spring Boot 4.1.x (latest stable patch at project creation).** Chosen over
  4.2.x, which was at release-candidate stage when the project started. Newer
  minor releases will be evaluated once the ecosystem catches up.
- **Gradle with Kotlin DSL.** Type-safe build scripts.
- **Spring MVC (servlet stack)** rather than WebFlux. Persistence is blocking
  (JPA/JDBC), so a reactive stack would add complexity without benefit.
- **PostgreSQL + Flyway.** The schema is controlled exclusively by migrations;
  `ddl-auto=update` is never used.
- **Modular Monolith with Clean Architecture and Ports and Adapters.**
  Microservices are deferred until measurable technical reasons exist.
- **No Lombok.** Domain code stays explicit and framework-free.

## Consequences

- Dependencies not covered by Spring Initializr (OpenAPI, ArchUnit, WireMock)
  must have their compatibility with Spring Boot 4.1 verified before adoption.
- Docker is a prerequisite for running the integration tests.
- Upgrading to Spring Boot 4.2+ is a deliberate future decision with its own ADR.