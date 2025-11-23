package io.yupiik.kubernetes.bindings.v1_28_4.v1alpha2;

import io.yupiik.kubernetes.bindings.v1_28_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_28_4.Validable;
import io.yupiik.kubernetes.bindings.v1_28_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ResourceClaimTemplateSpec implements Validable<ResourceClaimTemplateSpec>, Exportable {
    private ObjectMeta metadata;
    private ResourceClaimSpec spec;

    public ResourceClaimTemplateSpec() {
        // no-op
    }

    public ResourceClaimTemplateSpec(final ObjectMeta metadata,
                                     final ResourceClaimSpec spec) {
        this.metadata = metadata;
        this.spec = spec;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public ResourceClaimSpec getSpec() {
        return spec;
    }

    public void setSpec(final ResourceClaimSpec spec) {
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
        if (!(__other instanceof ResourceClaimTemplateSpec)) {
            return false;
        }
        final ResourceClaimTemplateSpec __otherCasted = (ResourceClaimTemplateSpec) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }

    public ResourceClaimTemplateSpec metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ResourceClaimTemplateSpec spec(final ResourceClaimSpec spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public ResourceClaimTemplateSpec validate() {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (spec != null ? "\"spec\":" + spec.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
