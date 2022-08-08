package io.yupiik.kubernetes.bindings.v1_20_4.v1;

import java.util.List;
import java.util.Objects;

public class HorizontalPodAutoscalerList {
    private String apiVersion;
    private List<HorizontalPodAutoscalerListItems> items;
    private String kind;
    private HorizontalPodAutoscalerListMetadata metadata;

    public HorizontalPodAutoscalerList() {
        // no-op
    }

    public HorizontalPodAutoscalerList(final String apiVersion,
                                       final List<HorizontalPodAutoscalerListItems> items,
                                       final String kind,
                                       final HorizontalPodAutoscalerListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<HorizontalPodAutoscalerListItems> getItems() {
        return items;
    }

    public void setItems(final List<HorizontalPodAutoscalerListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public HorizontalPodAutoscalerListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final HorizontalPodAutoscalerListMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                items,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HorizontalPodAutoscalerList)) {
            return false;
        }
        final HorizontalPodAutoscalerList __otherCasted = (HorizontalPodAutoscalerList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
