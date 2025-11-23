package io.yupiik.kubernetes.bindings.v1_24_16.v1;

import io.yupiik.kubernetes.bindings.v1_24_16.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_16.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_16.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class RollingUpdateDaemonSet implements Validable<RollingUpdateDaemonSet>, Exportable {
    private String maxSurge;
    private String maxUnavailable;

    public RollingUpdateDaemonSet() {
        // no-op
    }

    public RollingUpdateDaemonSet(final String maxSurge,
                                  final String maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (maxSurge != null ? "\"maxSurge\":\"" +  JsonStrings.escapeJson(maxSurge) + "\"" : ""),
                    (maxUnavailable != null ? "\"maxUnavailable\":\"" +  JsonStrings.escapeJson(maxUnavailable) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
