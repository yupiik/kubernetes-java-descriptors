package io.yupiik.kubernetes.bindings.v1_10_10.v1beta2;

import io.yupiik.kubernetes.bindings.v1_10_10.Validable;
import io.yupiik.kubernetes.bindings.v1_10_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ControllerRevision implements Validable<ControllerRevision> {
    private String apiVersion;
    private RawExtension data;
    private String kind;
    private ObjectMeta metadata;
    private int revision;

    public ControllerRevision() {
        // no-op
    }

    public ControllerRevision(final String apiVersion,
                              final RawExtension data,
                              final String kind,
                              final ObjectMeta metadata,
                              final int revision) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public RawExtension getData() {
        return data;
    }

    public void setData(final RawExtension data) {
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
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
        if (!(__other instanceof ControllerRevision)) {
            return false;
        }
        final ControllerRevision __otherCasted = (ControllerRevision) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(data, __otherCasted.data) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(revision, __otherCasted.revision);
    }

    public ControllerRevision apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ControllerRevision data(final RawExtension data) {
        this.data = data;
        return this;
    }

    public ControllerRevision kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ControllerRevision metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ControllerRevision revision(final int revision) {
        this.revision = revision;
        return this;
    }

    @Override
    public ControllerRevision validate() {
        return this;
    }
}
