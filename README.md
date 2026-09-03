# SpringCore

Spring Framework's core container, worked through topic by topic — no Spring Boot, no
auto-configuration. Each package is a self-contained example with its own XML config and its own
`Test` class holding a `main`, so you can run exactly one idea at a time.

## What is in here

| Package | The idea |
|---|---|
| `ci/` | Constructor injection — `Person`, `Certi`, `Adition` wired through constructor args |
| `auto/wire/` | Autowiring the `Emp` → `Address` relationship from XML, and again with annotations in the nested `annotation/` package |
| `ref/` | `ref` between beans: `A` holding `B`, the long-hand version of what autowiring guesses |
| `collections/` | Injecting `List`, `Set`, `Map` into a bean |
| `standalone/collections/` | Collections declared as top-level beans and referenced by id, rather than inline |
| `lifecycle/` | Init and destroy callbacks — `Samosa`, `Pepsi`, `jelbi`, one per way of declaring them |
| `spel/` | Spring Expression Language in bean definitions |
| `stereotype/` | `@Component` and friends with component scanning instead of XML bean declarations |
| `javaconfig/` | The same wiring again as a `@Configuration` class, no XML at all |

Read in that order it is roughly the history of Spring configuration: XML with explicit refs →
autowiring → annotations → pure Java config. The same small object graphs recur on purpose, so
what changes between packages is only *who does the assembling*.

Dependencies are just `spring-core` and `spring-context`. No web layer, no database.

### Running it

An Eclipse/Maven project, not Spring Boot — there is no embedded server and no `spring-boot:run`.
Import it as an existing Maven project, then run the `Test` class in whichever package you want to
look at. Each one has its own `main`.

---

One of a set of small repositories I wrote while learning the Java/Spring ecosystem. Each one
exists to get a single idea working end to end, so it is deliberately minimal — no tests worth the
name, no production hardening. Kept public because the commit history is a more honest record of
what I learned than a summary would be.
