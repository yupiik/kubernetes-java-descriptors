package io.yupiik.kubernetes.bindings.v1_19_3;

import java.util.Objects;

public class DeploymentSpecStrategyRollingUpdate {
    private String maxSurge;
    private String maxUnavailable;

    public DeploymentSpecStrategyRollingUpdate() {
        // no-op
    }

    public DeploymentSpecStrategyRollingUpdate(final String maxSurge,
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
        if (!(__other instanceof DeploymentSpecStrategyRollingUpdate)) {
            return false;
        }
        final DeploymentSpecStrategyRollingUpdate __otherCasted = (DeploymentSpecStrategyRollingUpdate) __other;
        return Objects.equals(maxSurge, __otherCasted.maxSurge) &&
            Objects.equals(maxUnavailable, __otherCasted.maxUnavailable);
    }
}
