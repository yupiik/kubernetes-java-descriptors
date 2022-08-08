package io.yupiik.kubernetes.bindings.v1_9_5.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_9_5.Validable;
import io.yupiik.kubernetes.bindings.v1_9_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodTemplateSpec implements Validable<PodTemplateSpec> {
    private ObjectMeta metadata;
    private PodSpec spec;

    public PodTemplateSpec() {
        // no-op
    }

    public PodTemplateSpec(final ObjectMeta metadata,
                           final PodSpec spec) {
        // no-op
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public PodSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodSpec spec) {
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
        if (!(__other instanceof PodTemplateSpec)) {
            return false;
        }
        final PodTemplateSpec __otherCasted = (PodTemplateSpec) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public PodTemplateSpec metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PodTemplateSpec spec(final PodSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public PodTemplateSpec validate() {
        return this;
    }
}
