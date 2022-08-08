package io.yupiik.kubernetes.bindings.v1_22_1.v1beta1;

import io.yupiik.kubernetes.bindings.v1_22_1.Validable;
import io.yupiik.kubernetes.bindings.v1_22_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JobTemplateSpec implements Validable<JobTemplateSpec> {
    private ObjectMeta metadata;
    private JobSpec spec;

    public JobTemplateSpec() {
        // no-op
    }

    public JobTemplateSpec(final ObjectMeta metadata,
                           final JobSpec spec) {
        // no-op
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public JobSpec getSpec() {
        return spec;
    }

    public void setSpec(final JobSpec spec) {
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
        if (!(__other instanceof JobTemplateSpec)) {
            return false;
        }
        final JobTemplateSpec __otherCasted = (JobTemplateSpec) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public JobTemplateSpec metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public JobTemplateSpec spec(final JobSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public JobTemplateSpec validate() {
        return this;
    }
}
