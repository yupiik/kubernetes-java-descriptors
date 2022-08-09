package io.yupiik.kubernetes.bindings.v1_16_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_16_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_16_9.Validable;
import io.yupiik.kubernetes.bindings.v1_16_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceValidation implements Validable<CustomResourceValidation>, Exportable {
    private JSONSchemaProps openAPIV3Schema;

    public CustomResourceValidation() {
        // no-op
    }

    public CustomResourceValidation(final JSONSchemaProps openAPIV3Schema) {
        // no-op
    }

    public JSONSchemaProps getOpenAPIV3Schema() {
        return openAPIV3Schema;
    }

    public void setOpenAPIV3Schema(final JSONSchemaProps openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                openAPIV3Schema);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceValidation)) {
            return false;
        }
        final CustomResourceValidation __otherCasted = (CustomResourceValidation) __other;
        return Objects.equals(openAPIV3Schema, __otherCasted.openAPIV3Schema);
    }

    public CustomResourceValidation openAPIV3Schema(final JSONSchemaProps openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
        return this;
    }

    @Override
    public CustomResourceValidation validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (openAPIV3Schema != null ? "\"openAPIV3Schema\":" + openAPIV3Schema.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
