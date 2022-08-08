package io.yupiik.kubernetes.bindings.v1_11_0.v1beta1;

import jakarta.json.JsonObject;
import java.util.Objects;

public class CustomResourceDefinitionSpecValidation {
    private JsonObject openAPIV3Schema;

    public CustomResourceDefinitionSpecValidation() {
        // no-op
    }

    public CustomResourceDefinitionSpecValidation(final JsonObject openAPIV3Schema) {
        // no-op
    }

    public JsonObject getOpenAPIV3Schema() {
        return openAPIV3Schema;
    }

    public void setOpenAPIV3Schema(final JsonObject openAPIV3Schema) {
        this.openAPIV3Schema = openAPIV3Schema;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                openAPIV3Schema);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionSpecValidation)) {
            return false;
        }
        final CustomResourceDefinitionSpecValidation __otherCasted = (CustomResourceDefinitionSpecValidation) __other;
        return Objects.equals(openAPIV3Schema, __otherCasted.openAPIV3Schema);
    }
}
