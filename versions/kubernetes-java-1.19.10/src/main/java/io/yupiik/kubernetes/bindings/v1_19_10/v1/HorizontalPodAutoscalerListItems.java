package io.yupiik.kubernetes.bindings.v1_19_10.v1;

import java.util.Objects;

public class HorizontalPodAutoscalerListItems {
    private String apiVersion;
    private String kind;
    private HorizontalPodAutoscalerListItemsMetadata metadata;
    private HorizontalPodAutoscalerListItemsSpec spec;
    private HorizontalPodAutoscalerListItemsStatus status;

    public HorizontalPodAutoscalerListItems() {
        // no-op
    }

    public HorizontalPodAutoscalerListItems(final String apiVersion,
                                            final String kind,
                                            final HorizontalPodAutoscalerListItemsMetadata metadata,
                                            final HorizontalPodAutoscalerListItemsSpec spec,
                                            final HorizontalPodAutoscalerListItemsStatus status) {
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

    public HorizontalPodAutoscalerListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final HorizontalPodAutoscalerListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public HorizontalPodAutoscalerListItemsSpec getSpec() {
        return spec;
    }

    public void setSpec(final HorizontalPodAutoscalerListItemsSpec spec) {
        this.spec = spec;
    }

    public HorizontalPodAutoscalerListItemsStatus getStatus() {
        return status;
    }

    public void setStatus(final HorizontalPodAutoscalerListItemsStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerListItems)) {
            return false;
        }
        final HorizontalPodAutoscalerListItems __otherCasted = (HorizontalPodAutoscalerListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
