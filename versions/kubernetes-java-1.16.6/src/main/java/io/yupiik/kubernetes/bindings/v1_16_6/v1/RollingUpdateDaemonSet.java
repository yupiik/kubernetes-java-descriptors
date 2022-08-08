package io.yupiik.kubernetes.bindings.v1_16_6.v1;

import io.yupiik.kubernetes.bindings.v1_16_6.Validable;
import io.yupiik.kubernetes.bindings.v1_16_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RollingUpdateDaemonSet implements Validable<RollingUpdateDaemonSet> {
    private String maxUnavailable;

    public RollingUpdateDaemonSet() {
        // no-op
    }

    public RollingUpdateDaemonSet(final String maxUnavailable) {
        // no-op
    }

    public String getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxUnavailable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RollingUpdateDaemonSet)) {
            return false;
        }
        final RollingUpdateDaemonSet __otherCasted = (RollingUpdateDaemonSet) __other;
        return Objects.equals(maxUnavailable, __otherCasted.maxUnavailable);
    }

    public RollingUpdateDaemonSet maxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    @Override
    public RollingUpdateDaemonSet validate() {
        return this;
    }
}
