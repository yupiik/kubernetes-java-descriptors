package io.yupiik.kubernetes.bindings.v1_26_1.v1;

import io.yupiik.kubernetes.bindings.v1_26_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_26_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_26_1.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DaemonSetUpdateStrategy implements Validable<DaemonSetUpdateStrategy>, Exportable {
    private RollingUpdateDaemonSet rollingUpdate;
    private String type;

    public DaemonSetUpdateStrategy() {
        // no-op
    }

    public DaemonSetUpdateStrategy(final RollingUpdateDaemonSet rollingUpdate,
                                   final String type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    public RollingUpdateDaemonSet getRollingUpdate() {
        return rollingUpdate;
    }

    public void setRollingUpdate(final RollingUpdateDaemonSet rollingUpdate) {
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

    public DaemonSetUpdateStrategy type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public DaemonSetUpdateStrategy validate() {
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
