package io.yupiik.kubernetes.bindings.v1_13_2.v1;

import io.yupiik.kubernetes.bindings.v1_13_2.Validable;
import io.yupiik.kubernetes.bindings.v1_13_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ContainerStateRunning implements Validable<ContainerStateRunning> {
    private String startedAt;

    public ContainerStateRunning() {
        // no-op
    }

    public ContainerStateRunning(final String startedAt) {
        // no-op
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
}
