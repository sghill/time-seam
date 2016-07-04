package net.sghill.seams.time;

import java.time.Instant;

public class UtcInstantClock implements Clock<Instant> {
    @Override
    public Instant now() {
        return Instant.now(java.time.Clock.systemUTC());
    }
}
