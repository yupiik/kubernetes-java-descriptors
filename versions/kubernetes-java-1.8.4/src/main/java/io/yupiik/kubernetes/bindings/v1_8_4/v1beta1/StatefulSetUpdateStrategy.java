package io.yupiik.kubernetes.bindings.v1_8_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_8_4.Validable;
import io.yupiik.kubernetes.bindings.v1_8_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StatefulSetUpdateStrategy implements Validable<StatefulSetUpdateStrategy> {
    private RollingUpdateStatefulSetStrategy rollingUpdate;
    private String type;

    public StatefulSetUpdateStrategy() {
        // no-op
    }

    public StatefulSetUpdateStrategy(final RollingUpdateStatefulSetStrategy rollingUpdate,
                                     final String type) {
        // no-op
    }

    public RollingUpdateStatefulSetStrategy getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final RollingUpdateStatefulSetStrategy rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
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
        if (!(__other instanceof StatefulSetUpdateStrategy)) {
            return false;
        }
        final StatefulSetUpdateStrategy __otherCasted = (StatefulSetUpdateStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }

    public StatefulSetUpdateStrategy rollingUpdate(final RollingUpdateStatefulSetStrategy rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public StatefulSetUpdateStrategy type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public StatefulSetUpdateStrategy validate() {
        return this;
    }
}
