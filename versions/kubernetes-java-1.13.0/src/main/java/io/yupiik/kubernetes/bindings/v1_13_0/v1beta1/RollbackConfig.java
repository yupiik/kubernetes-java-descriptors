package io.yupiik.kubernetes.bindings.v1_13_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_0.Validable;
import io.yupiik.kubernetes.bindings.v1_13_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RollbackConfig implements Validable<RollbackConfig> {
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
}
