package dev.pranjal.runnerz.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completeOn,
        Integer miles,
        dev.pranjal.runnerz.run.Location location
) {}
