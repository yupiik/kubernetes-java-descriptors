package io.yupiik.kubernetes.bindings.v1_16_5.v1beta2;

import jakarta.json.JsonObject;
import java.util.Objects;

public class ControllerRevision {
    private String apiVersion;
    private JsonObject data;
    private String kind;
    private ControllerRevisionMetadata metadata;
    private int revision;

    public ControllerRevision() {
        // no-op
    }

    public ControllerRevision(final String apiVersion,
                              final JsonObject data,
                              final String kind,
                              final ControllerRevisionMetadata metadata,
                              final int revision) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public JsonObject getData() {
        return data;
    }

    public void setData(final JsonObject data) {
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ControllerRevisionMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ControllerRevisionMetadata metadata) {
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
}
