package io.yupiik.kubernetes.bindings.v1_11_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_1.Validable;
import io.yupiik.kubernetes.bindings.v1_11_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RollingUpdateDeployment implements Validable<RollingUpdateDeployment> {
    private String maxSurge;
    private String maxUnavailable;

    public RollingUpdateDeployment() {
        // no-op
    }

    public RollingUpdateDeployment(final String maxSurge,
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
        if (!(__other instanceof RollingUpdateDeployment)) {
            return false;
        }
        final RollingUpdateDeployment __otherCasted = (RollingUpdateDeployment) __other;
        return Objects.equals(maxSurge, __otherCasted.maxSurge) &&
            Objects.equals(maxUnavailable, __otherCasted.maxUnavailable);
    }

    public RollingUpdateDeployment maxSurge(final String maxSurge) {
        this.maxSurge = maxSurge;
        return this;
    }

    public RollingUpdateDeployment maxUnavailable(final String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    @Override
    public RollingUpdateDeployment validate() {
        return this;
    }
}
