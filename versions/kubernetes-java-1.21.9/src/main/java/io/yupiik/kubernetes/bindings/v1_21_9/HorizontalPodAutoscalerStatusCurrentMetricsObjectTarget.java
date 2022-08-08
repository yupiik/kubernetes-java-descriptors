package io.yupiik.kubernetes.bindings.v1_21_9;

import java.util.Objects;

public class HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget {
    private String apiVersion;
    private String kind;
    private String name;

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget() {
        // no-op
    }

    public HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget(final String apiVersion,
                                                                   final String kind,
                                                                   final String name) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget)) {
            return false;
        }
        final HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget __otherCasted = (HorizontalPodAutoscalerStatusCurrentMetricsObjectTarget) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name);
    }
}
