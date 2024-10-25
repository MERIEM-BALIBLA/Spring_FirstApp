## SPRING FRAMEWORK

This application is a basic User Management System 
built using Spring Core without Spring Boot, 
Spring MVC, and Spring Data JPA. It allows users to perform CRUD operations 
such as creating, viewing, updating, and deleting users through a web interface.

## Table of Contents
- [Project Structure](#project-structure)
- [Dependency Injection (DI)](#dependency-injection-di)
- [Inversion of Control (IoC)](#inversion-of-control-ioc)
- [Spring Beans](#spring-beans)
- [Bean Scopes](#bean-scopes)
- [ApplicationContext](#applicationcontext)
- [Component Scanning and Stereotype Annotations](#component-scanning-and-stereotype-annotations)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation and Setup](#installation-and-setup)

### Project Structure

### Dependency Injection (DI) :
  L'injection de dépendances est un pattern de conception qui implémente le principe d'Inversion de Contrôle, L'injection de dépendances consiste à fournir les dépendances d'une classe depuis l'extérieur, plutôt que de les créer à l'intérieur de la classe.
### Inversion of Control (IoC)
L'Inversion de Contrôle est un principe de conception en programmation qui consiste à transférer le contrôle de la création et gestion des objets à un conteneur ou framework, plutôt que de le coder explicitement dans l'application.
### Spring Beans
Les beans Spring sont les objets qui forment l'épine dorsale de votre application et sont gérés par le conteneur Spring. Ils sont définis soit dans le fichier XML (applicationContext.xml) soit par annotations.
### Bean Scopes
Les beans peuvent avoir différents scopes, tels que :
singleton: Une seule instance de bean est créée par Spring.
prototype: Une nouvelle instance est créée chaque fois que le bean est demandé.
request: Une instance par requête HTTP.
session: Une instance par session HTTP.
### ApplicationContext
ApplicationContext est le conteneur central de Spring qui gère les beans et leur cycle de vie. Il peut être configuré soit par XML, soit par annotations.
### Component Scanning and Stereotype Annotations
Spring offre des annotations comme :
@Component: Indique un composant général.
@Service: Indique une classe de service.
@Repository: Indique une classe de dépôt.
@Controller: Indique un contrôleur Spring MVC.
### Spring Data JPA
Projet de Spring pour simplifier l'acceés au données 
### Spring MVC
Projet de Spring
### Installation and Setup
