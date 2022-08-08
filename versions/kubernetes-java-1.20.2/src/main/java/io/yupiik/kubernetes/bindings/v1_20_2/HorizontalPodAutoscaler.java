package io.yupiik.kubernetes.bindings.v1_20_2;

import java.util.Objects;

public class HorizontalPodAutoscaler {
    private String apiVersion;
    private String kind;
    private HorizontalPodAutoscalerMetadata metadata;
    private HorizontalPodAutoscalerSpec spec;
    private HorizontalPodAutoscalerStatus status;

    public HorizontalPodAutoscaler() {
        // no-op
    }

    public HorizontalPodAutoscaler(final String apiVersion,
                                   final String kind,
                                   final HorizontalPodAutoscalerMetadata metadata,
                                   final HorizontalPodAutoscalerSpec spec,
                                   final HorizontalPodAutoscalerStatus status) {
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

    public HorizontalPodAutoscalerMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final HorizontalPodAutoscalerMetadata metadata) {
        this.metadata = metadata;
    }

    public HorizontalPodAutoscalerSpec getSpec() {
        return spec;
    }

    public void setSpec(final HorizontalPodAutoscalerSpec spec) {
        this.spec = spec;
    }

    public HorizontalPodAutoscalerStatus getStatus() {
        return status;
    }

    public void setStatus(final HorizontalPodAutoscalerStatus status) {
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
        if (!(__other instanceof HorizontalPodAutoscaler)) {
            return false;
        }
        final HorizontalPodAutoscaler __otherCasted = (HorizontalPodAutoscaler) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }
}
