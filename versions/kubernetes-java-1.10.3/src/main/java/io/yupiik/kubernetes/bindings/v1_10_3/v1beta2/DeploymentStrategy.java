package io.yupiik.kubernetes.bindings.v1_10_3.v1beta2;

import io.yupiik.kubernetes.bindings.v1_10_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_3.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_3.Validable;
import io.yupiik.kubernetes.bindings.v1_10_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DeploymentStrategy implements Validable<DeploymentStrategy>, Exportable {
    private RollingUpdateDeployment rollingUpdate;
    private String type;

    public DeploymentStrategy() {
        // no-op
    }

    public DeploymentStrategy(final RollingUpdateDeployment rollingUpdate,
                              final String type) {
        // no-op
    }

    public RollingUpdateDeployment getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final RollingUpdateDeployment rollingUpdate) {
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

    public DeploymentStrategy type(final String type) {
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
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
