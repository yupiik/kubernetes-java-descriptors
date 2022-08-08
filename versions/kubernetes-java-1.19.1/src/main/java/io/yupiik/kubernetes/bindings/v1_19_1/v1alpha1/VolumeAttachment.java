package io.yupiik.kubernetes.bindings.v1_19_1.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_19_1.Validable;
import io.yupiik.kubernetes.bindings.v1_19_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VolumeAttachment implements Validable<VolumeAttachment> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private VolumeAttachmentSpec spec;
    private VolumeAttachmentStatus status;

    public VolumeAttachment() {
        // no-op
    }

    public VolumeAttachment(final String apiVersion,
                            final String kind,
                            final ObjectMeta metadata,
                            final VolumeAttachmentSpec spec,
                            final VolumeAttachmentStatus status) {
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

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public VolumeAttachmentSpec getSpec() {
        return spec;
    }

    public void setSpec(final VolumeAttachmentSpec spec) {
        this.spec = spec;
    }

    public VolumeAttachmentStatus getStatus() {
        return status;
    }

    public void setStatus(final VolumeAttachmentStatus status) {
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
        if (!(__other instanceof VolumeAttachment)) {
            return false;
        }
        final VolumeAttachment __otherCasted = (VolumeAttachment) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public VolumeAttachment apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public VolumeAttachment kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public VolumeAttachment metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public VolumeAttachment spec(final VolumeAttachmentSpec spec) {
        this.spec = spec;
        return this;
    }

    public VolumeAttachment status(final VolumeAttachmentStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public VolumeAttachment validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (spec == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "spec", "spec",
                "Missing 'spec' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
