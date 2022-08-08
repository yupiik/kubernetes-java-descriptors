package io.yupiik.kubernetes.bindings.v1_15_11.v1beta1;

import java.util.Objects;

public class ControllerRevisionListItems {
    private String apiVersion;
    private ControllerRevisionListItemsData data;
    private String kind;
    private ControllerRevisionListItemsMetadata metadata;
    private int revision;

    public ControllerRevisionListItems() {
        // no-op
    }

    public ControllerRevisionListItems(final String apiVersion,
                                       final ControllerRevisionListItemsData data,
                                       final String kind,
                                       final ControllerRevisionListItemsMetadata metadata,
                                       final int revision) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ControllerRevisionListItemsData getData() {
        return data;
    }

    public void setData(final ControllerRevisionListItemsData data) {
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ControllerRevisionListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ControllerRevisionListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                data,
                kind,
                metadata,
                revision);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ControllerRevisionListItems)) {
            return false;
        }
        final ControllerRevisionListItems __otherCasted = (ControllerRevisionListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(data, __otherCasted.data) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(revision, __otherCasted.revision);
    }
}
