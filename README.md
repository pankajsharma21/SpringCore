# SpringCore

Spring Framework's core container, worked through by hand — no Spring Boot, no auto-configuration.
The point was to see what dependency injection actually does before letting a framework hide it.

## What is in here

| | |
|---|---|
| `Student.java` | A plain bean wired from XML — the simplest case: setter injection |
| `auto/wire/` | The same `Emp` → `Address` relationship wired by **XML autowiring** |
| `auto/wire/annotation/` | And again, wired by **annotations** (`@Autowired`) |

Having the same relationship written three ways is the whole exercise: the object graph is
identical, only who assembles it changes.

Dependencies are just `spring-core` and `spring-context`. No web layer, no database.

### Running it

An Eclipse/Maven project, not Spring Boot — there is no embedded server and no `spring-boot:run`.
Import it as an existing Maven project, then run the `main` method directly.

```bash
mvn compile
mvn exec:java -Dexec.mainClass=<the class shown above>
```

---

One of a set of small repositories I wrote while learning the Java/Spring ecosystem. Each one
exists to get a single idea working end to end, so it is deliberately minimal — no tests worth the
name, no production hardening. Kept public because the commit history is a more honest record of
what I learned than a summary would be.
