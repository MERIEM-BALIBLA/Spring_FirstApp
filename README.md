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
my-spring-project
│

├── src

│   ├── main

│   │   ├── java

│   │   │   └── org

│   │   │       └── example

│   │   │           ├── controller    

│   │   │           ├── service       

│   │   │           ├── repository     

│   │   │           └── model        

│   │   │           └── Main                
│   │   └── resources

│   │       ├── Config.xml               
│
└── pom.xml                                   # Maven configuration file (or build.gradle for Gradle)

### Dependency Injection (DI) :
L'injection de dépendances (DI) est un design pattern qui permet à une classe d'injecter ses dépendances depuis l'extérieur au lieu de les instancier elle-même. Cela signifie que les dépendances sont envoyées en tant que paramètres dans le constructeur
#### Types d'Injection de Dépendances :
  #### Injection par Constructeur :
  Les dépendances sont injectées à travers le constructeur de la classe, c'est la méthode la plus recommandée car elle garantit que toutes les dépendances sont disponibles  dès la création de l'objet
  #### Injection par Setter :
  Les dépendances sont injectées après la création de l'objet via des méthodes setter, Cela rend ces dépendances optionnelles, car l'objet peut fonctionner sans elles.      Cette approche offre une plus grande flexibilité, car elle permet de modifier les dépendances après l'instanciation de l'objet.
  #### Injection par field
  L'injection par field est une technique qui permet d'injecter les dépendances directement dans les attributs de la classe, à l'aide des annotations @Inject ou        @Autowired. Bien que cette méthode soit plus simple à écrire que les autres types d'injection, elle n'est pas recommandée pour plusieurs raisons : elle rend le code plus     difficile à tester, elle masque les dépendances (qui ne sont pas visibles dans le constructeur), et elle ne permet pas l'immutabilité des objets.
  
### Inversion of Control (IoC)
L'Inversion de Contrôle est un principe de conception en programmation qui transfère le contrôle de la création et de la gestion des objets à un conteneur ou à un framework, au lieu de le coder explicitement dans l'application.
L'indépendance dans le contexte de l'IoC signifie que les composants d'une application sont faiblement couplés grâce à l'injection des dépendances. Cette indépendance est généralement réalisée par l'injection via constructeur, ce qui permet de rendre les dépendances explicites et de faciliter les tests en permettant l'injection de mocks. Au lieu d'instancier directement leurs dépendances, les classes les reçoivent du conteneur IoC, ce qui augmente leur réutilisabilité et leur maintenabilité.

### Spring Beans
Les Spring Beans sont des objets Java qui sont créés et gérés par le conteneur Spring IoC. Ils sont définis soit dans le fichier XML (applicationContext.xml) soit par annotations @Component (générique), @Service (couche service), @Repository (couche données), @Controller (couche web) et @Bean (configuration). Par défaut, les Beans suivent le pattern Singleton, ce qui signifie qu'une seule instance est créée et réutilisée pour toute l'application. 

### Bean Scopes
Dans le framework Spring, les scopes des beans définissent la durée de vie et la portée des beans créés par le conteneur Spring. Les beans peuvent avoir différents scopes, tels que :

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
Spring Data est un projet Spring qui a pour objectif de simplifier l’interaction avec différents systèmes de stockage de données : qu’il s’agisse d’une base de données relationnelle, d’une base de données NoSQL, d’un système Big Data ou encore d’une API Web.
Le principe de Spring Data est de simplifier le travail des développeurs en prenant en charge l’implémentation des méthodes d’accès à ces systèmes. Pour cela, Spring Data fournit des interfaces par défaut mais définit aussi une convention de nommage des méthodes d’accès pour nous permettre d’exprimer la requête à réaliser.

### Spring MVC
Spring MVC (Model-View-Controller) est un framework basé sur le modèle MVC, qui facilite le développement d'applications web en séparant les différentes responsabilités de l'application. Cela permet une meilleure organisation du code et une plus grande flexibilité dans le développement.
### Installation and Setup
