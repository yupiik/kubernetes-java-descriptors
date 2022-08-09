package io.yupiik.kubernetes.bindings.v1_17_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_17_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_17_4.Validable;
import io.yupiik.kubernetes.bindings.v1_17_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RollingUpdateDaemonSet implements Validable<RollingUpdateDaemonSet>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (maxUnavailable != null ? "\"maxUnavailable\":\"" +  JsonStrings.escapeJson(maxUnavailable) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
