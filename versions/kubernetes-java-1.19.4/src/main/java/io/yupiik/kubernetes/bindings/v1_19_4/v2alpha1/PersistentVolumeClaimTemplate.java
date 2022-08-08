package io.yupiik.kubernetes.bindings.v1_19_4.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_19_4.Validable;
import io.yupiik.kubernetes.bindings.v1_19_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimTemplate implements Validable<PersistentVolumeClaimTemplate> {
    private ObjectMeta metadata;
    private PersistentVolumeClaimSpec spec;

    public PersistentVolumeClaimTemplate() {
        // no-op
    }

    public PersistentVolumeClaimTemplate(final ObjectMeta metadata,
                                         final PersistentVolumeClaimSpec spec) {
        // no-op
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public PersistentVolumeClaimSpec getSpec() {
        return spec;
    }

    public void setSpec(final PersistentVolumeClaimSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimTemplate)) {
            return false;
        }
        final PersistentVolumeClaimTemplate __otherCasted = (PersistentVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public PersistentVolumeClaimTemplate metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PersistentVolumeClaimTemplate spec(final PersistentVolumeClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public PersistentVolumeClaimTemplate validate() {
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
