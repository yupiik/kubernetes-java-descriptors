package io.yupiik.kubernetes.bindings.v1_32_2.v1;

import io.yupiik.kubernetes.bindings.v1_32_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class JobTemplateSpec implements Validable<JobTemplateSpec>, Exportable {
    private ObjectMeta metadata;
    private JobSpec spec;

    public JobTemplateSpec() {
        // no-op
    }

    public JobTemplateSpec(final ObjectMeta metadata,
                           final JobSpec spec) {
        this.metadata = metadata;
        this.spec = spec;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
