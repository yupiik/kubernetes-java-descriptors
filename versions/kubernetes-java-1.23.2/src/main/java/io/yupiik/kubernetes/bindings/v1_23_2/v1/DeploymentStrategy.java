package io.yupiik.kubernetes.bindings.v1_23_2.v1;

import io.yupiik.kubernetes.bindings.v1_23_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_2.Validable;
import io.yupiik.kubernetes.bindings.v1_23_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeploymentStrategy implements Validable<DeploymentStrategy>, Exportable {
    private RollingUpdateDeployment rollingUpdate;
    private DeploymentStrategyType type;

    public DeploymentStrategy() {
        // no-op
    }

    public DeploymentStrategy(final RollingUpdateDeployment rollingUpdate,
                              final DeploymentStrategyType type) {
        // no-op
    }

    public RollingUpdateDeployment getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final RollingUpdateDeployment rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
    }

    public DeploymentStrategyType getType() {
        return type;
    }

    public void setType(final DeploymentStrategyType type) {
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
        if (!(__other instanceof DeploymentStrategy)) {
            return false;
        }
        final DeploymentStrategy __otherCasted = (DeploymentStrategy) __other;
        return Objects.equals(rollingUpdate, __otherCasted.rollingUpdate) &&
            Objects.equals(type, __otherCasted.type);
    }

    public DeploymentStrategy rollingUpdate(final RollingUpdateDeployment rollingUpdate) {
        this.rollingUpdate = rollingUpdate;
        return this;
    }

    public DeploymentStrategy type(final DeploymentStrategyType type) {
        this.type = type;
        return this;
    }

    @Override
    public DeploymentStrategy validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (rollingUpdate != null ? "\"rollingUpdate\":" + rollingUpdate.asJson() : ""),
                    (type != null ? "\"type\":" + type.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
