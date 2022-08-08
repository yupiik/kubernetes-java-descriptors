package io.yupiik.kubernetes.bindings.v1_22_2.v1;

import io.yupiik.kubernetes.bindings.v1_22_2.Validable;
import io.yupiik.kubernetes.bindings.v1_22_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RollingUpdateDaemonSet implements Validable<RollingUpdateDaemonSet> {
    private String maxSurge;
    private String maxUnavailable;

    public RollingUpdateDaemonSet() {
        // no-op
    }

    public RollingUpdateDaemonSet(final String maxSurge,
                                  final String maxUnavailable) {
        // no-op
    }

    public String getMaxSurge() {
        return maxSurge;
    }

    public void setMaxSurge(final String maxSurge) {
        this.maxSurge = maxSurge;
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
                maxSurge,
                maxUnavailable);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof RollingUpdateDaemonSet)) {
            return false;
        }
        final RollingUpdateDaemonSet __otherCasted = (RollingUpdateDaemonSet) __other;
        return Objects.equals(maxSurge, __otherCasted.maxSurge) &&
            Objects.equals(maxUnavailable, __otherCasted.maxUnavailable);
    }

    public RollingUpdateDaemonSet maxSurge(final String maxSurge) {
        this.maxSurge = maxSurge;
        return this;
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
