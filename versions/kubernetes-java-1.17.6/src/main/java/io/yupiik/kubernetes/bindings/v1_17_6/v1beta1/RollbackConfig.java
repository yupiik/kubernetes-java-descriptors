package io.yupiik.kubernetes.bindings.v1_17_6.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_6.Validable;
import io.yupiik.kubernetes.bindings.v1_17_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RollbackConfig implements Validable<RollbackConfig>, Exportable {
    private Integer revision;

    public RollbackConfig() {
        // no-op
    }

    public RollbackConfig(final Integer revision) {
        // no-op
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(final Integer revision) {
        this.revision = revision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                revision);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RollbackConfig)) {
            return false;
        }
        final RollbackConfig __otherCasted = (RollbackConfig) __other;
        return Objects.equals(revision, __otherCasted.revision);
    }

    public RollbackConfig revision(final Integer revision) {
        this.revision = revision;
        return this;
    }

    @Override
    public RollbackConfig validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (revision != null ? "\"revision\":" + revision : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
