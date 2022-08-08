package io.yupiik.kubernetes.bindings.v1_16_4;

import java.util.List;
import java.util.Objects;

public class ControllerRevisionList {
    private String apiVersion;
    private List<ControllerRevisionListItems> items;
    private String kind;
    private ControllerRevisionListMetadata metadata;

    public ControllerRevisionList() {
        // no-op
    }

    public ControllerRevisionList(final String apiVersion,
                                  final List<ControllerRevisionListItems> items,
                                  final String kind,
                                  final ControllerRevisionListMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ControllerRevisionListItems> getItems() {
        return items;
    }

    public void setItems(final List<ControllerRevisionListItems> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ControllerRevisionListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ControllerRevisionListMetadata metadata) {
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
        if (!(__other instanceof ControllerRevisionList)) {
            return false;
        }
        final ControllerRevisionList __otherCasted = (ControllerRevisionList) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }
}
