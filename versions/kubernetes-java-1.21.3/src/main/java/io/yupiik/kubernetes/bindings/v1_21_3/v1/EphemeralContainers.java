package io.yupiik.kubernetes.bindings.v1_21_3.v1;

import io.yupiik.kubernetes.bindings.v1_21_3.Validable;
import io.yupiik.kubernetes.bindings.v1_21_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EphemeralContainers implements Validable<EphemeralContainers> {
    private String apiVersion;
    private List<EphemeralContainer> ephemeralContainers;
    private String kind;
    private ObjectMeta metadata;

    public EphemeralContainers() {
        // no-op
    }

    public EphemeralContainers(final String apiVersion,
                               final List<EphemeralContainer> ephemeralContainers,
                               final String kind,
                               final ObjectMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<EphemeralContainer> getEphemeralContainers() {
        return ephemeralContainers;
    }

    public void setEphemeralContainers(final List<EphemeralContainer> ephemeralContainers) {
        this.ephemeralContainers = ephemeralContainers;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                ephemeralContainers,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EphemeralContainers)) {
            return false;
        }
        final EphemeralContainers __otherCasted = (EphemeralContainers) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(ephemeralContainers, __otherCasted.ephemeralContainers) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public EphemeralContainers apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public EphemeralContainers ephemeralContainers(final List<EphemeralContainer> ephemeralContainers) {
        this.ephemeralContainers = ephemeralContainers;
        return this;
    }

    public EphemeralContainers kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public EphemeralContainers metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public EphemeralContainers validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (ephemeralContainers == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "ephemeralContainers", "ephemeralContainers",
                "Missing 'ephemeralContainers' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
