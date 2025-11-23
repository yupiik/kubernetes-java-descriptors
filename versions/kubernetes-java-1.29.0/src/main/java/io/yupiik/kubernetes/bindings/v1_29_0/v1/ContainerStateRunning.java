package io.yupiik.kubernetes.bindings.v1_29_0.v1;

import io.yupiik.kubernetes.bindings.v1_29_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_29_0.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ContainerStateRunning implements Validable<ContainerStateRunning>, Exportable {
    private String startedAt;

    public ContainerStateRunning() {
        // no-op
    }

    public ContainerStateRunning(final String startedAt) {
        this.startedAt = startedAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(final String startedAt) {
        this.startedAt = startedAt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                startedAt);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ContainerStateRunning)) {
            return false;
        }
        final ContainerStateRunning __otherCasted = (ContainerStateRunning) __other;
        return Objects.equals(startedAt, __otherCasted.startedAt);
    }

    public ContainerStateRunning startedAt(final String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    @Override
    public ContainerStateRunning validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (startedAt != null ? "\"startedAt\":\"" +  JsonStrings.escapeJson(startedAt) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
