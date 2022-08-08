package io.yupiik.kubernetes.bindings.v1_20_15;

import java.util.Objects;

public class HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject {
    private String apiVersion;
    private String kind;
    private String name;

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject() {
        // no-op
    }

    public HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject(final String apiVersion,
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
        if (!(__other instanceof HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject)) {
            return false;
        }
        final HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject __otherCasted = (HorizontalPodAutoscalerListItemsStatusCurrentMetricsObjectDescribedObject) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name);
    }
}
