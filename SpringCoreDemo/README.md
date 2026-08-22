\# Spring Core: Circular Dependency Demo



This project demonstrates a classic \*\*Circular Dependency\*\* issue in Spring using constructor-based dependency injection between two components.



\---



\## 1. What is Circular Dependency?



A circular dependency happens when two or more Spring managed beans depend on each other:

\* `ClassA` requires `ClassB` via constructor injection.

\* `ClassB` requires `ClassA` via constructor injection.



```text

&#x20;      ┌──────────┐

&#x20;      │  ClassA  │

&#x20;      └────┬─────┘

&#x20;           │  ▲

&#x20;           ▼  │

&#x20;      ┌───────┴──┐

&#x20;      │  ClassB  │

&#x20;      └──────────┘


-Resolve using following
Use Setter / Field Injection

@Component

public class ClassA {



&#x20;   @Autowired

&#x20;   private ClassB classb;

&#x20;   // ...

}





\[Circular Dependency Demo](docs/images/circular-dependency.png)



