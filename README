Time Seam
=========

Defines a simple `Clock` interface that can return the current time.

Ships with an implementation based on Java 8's [`java.time.Instant`][instant]
returning UTC, but can be easily extended to support other time zones or
implementations (e.g. joda-time).


Why
---

**Testing** Classes that require time are often very difficult to test. Using
a `Clock` like the one here introduces a seam between the class consuming the
time and the one producing the time.

**Configuration** If your application needs a specific timezone, this pattern
encourages that configuration to be defined in one place and injected
everywhere it's needed.

[instant]: https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html
