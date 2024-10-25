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
L'injection de dépendances est un modèle de conception qui met en œuvre le principe d'Inversion de Contrôle. Elle consiste à fournir les dépendances d'une classe depuis l'extérieur, plutôt que de les créer à l'intérieur de celle-ci.

### Inversion of Control (IoC)
L'Inversion de Contrôle est un principe de conception en programmation qui transfère le contrôle de la création et de la gestion des objets à un conteneur ou à un framework, au lieu de le coder explicitement dans l'application.

### Spring Beans
Les beans Spring sont les objets qui forment l'épine dorsale de votre application et sont gérés par le conteneur Spring. Ils sont définis soit dans le fichier XML (applicationContext.xml) soit par annotations.

### Bean Scopes
Dans le framework Spring, les bean scopes (portées des beans) définissent la durée de vie et la portée des beans créés par le conteneur Spring. Comprendre les différentes portées est essentiel pour gérer la mémoire, le cycle de vie des objets et le comportement de votre application.
Les beans peuvent avoir différents scopes, tels que :
singleton: Une seule instance de bean est créée par Spring.
prototype: Une nouvelle instance est créée chaque fois que le bean est demandé.
request: Une instance par requête HTTP.
session: Une instance par session HTTP.

### ApplicationContext
ApplicationContext est le conteneur central de Spring qui gère les beans et leur cycle de vie. Il peut être configuré soit par XML, soit par annotations.

### Component Scanning and Stereotype Annotations
Component Scanning et Annotations Stéréotypées sont des fonctionnalités clés du framework Spring qui facilitent la détection et la gestion des beans au sein de l'application. Elles permettent de simplifier la configuration et d'encourager une architecture modulaire.
Spring offre des annotations comme :
@Component: Indique un composant général.
@Service: Indique une classe de service.
@Repository: Indique une classe de dépôt.
@Controller: Indique un contrôleur Spring MVC.

### Spring Data JPA
Spring Data est un projet de Spring qui vise à simplifier l'accès aux données et à rendre la gestion des données plus cohérente et efficace dans les applications Java. Il fournit des abstractions et des outils pour interagir avec différentes technologies de stockage, y compris les bases de données relationnelles, NoSQL, et les systèmes de stockage en mémoire.

### Spring MVC
Spring MVC (Model-View-Controller) est un framework basé sur le modèle MVC, qui facilite le développement d'applications web en séparant les différentes responsabilités de l'application. Cela permet une meilleure organisation du code et une plus grande flexibilité dans le développement.
### Installation and Setup
