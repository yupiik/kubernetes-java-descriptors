package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import io.yupiik.kubernetes.bindings.v1_23_1.Validable;
import io.yupiik.kubernetes.bindings.v1_23_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DaemonSetUpdateStrategy implements Validable<DaemonSetUpdateStrategy> {
    private RollingUpdateDaemonSet rollingUpdate;
    private DaemonSetUpdateStrategyType type;

    public DaemonSetUpdateStrategy() {
        // no-op
    }

    public DaemonSetUpdateStrategy(final RollingUpdateDaemonSet rollingUpdate,
                                   final DaemonSetUpdateStrategyType type) {
        // no-op
    }

    public RollingUpdateDaemonSet getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final RollingUpdateDaemonSet rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    public DaemonSetUpdateStrategyType getType() {
        return type;
    }

    public void setType(final DaemonSetUpdateStrategyType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rollingUpdate,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetUpdateStrategy)) {
            return false;
        }
        final DaemonSetUpdateStrategy __otherCasted = (DaemonSetUpdateStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }

    public DaemonSetUpdateStrategy rollingUpdate(final RollingUpdateDaemonSet rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public DaemonSetUpdateStrategy type(final DaemonSetUpdateStrategyType type) {
        this.type = type;
        return this;
    }

    @Override
    public DaemonSetUpdateStrategy validate() {
        return this;
    }
}
