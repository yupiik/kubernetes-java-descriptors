package io.yupiik.kubernetes.bindings.v1_31_9.v1;

import io.yupiik.kubernetes.bindings.v1_31_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SleepAction implements Validable<SleepAction>, Exportable {
    private int seconds;

    public SleepAction() {
        // no-op
    }

    public SleepAction(final int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(final int seconds) {
        this.seconds = seconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                seconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SleepAction)) {
            return false;
        }
        final SleepAction __otherCasted = (SleepAction) __other;
        return Objects.equals(seconds, __otherCasted.seconds);
    }

    public SleepAction seconds(final int seconds) {
        this.seconds = seconds;
        return this;
    }

    @Override
    public SleepAction validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"seconds\":" + seconds)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
