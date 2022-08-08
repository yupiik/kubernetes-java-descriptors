package io.yupiik.kubernetes.bindings.v1_16_15.v1beta1;

import jakarta.json.JsonObject;
import java.util.Objects;

public class CustomResourceDefinitionSpecVersionsSchema {
    private JsonObject openAPIV3Schema;

    public CustomResourceDefinitionSpecVersionsSchema() {
        // no-op
    }

    public CustomResourceDefinitionSpecVersionsSchema(final JsonObject openAPIV3Schema) {
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
        if (!(__other instanceof CustomResourceDefinitionSpecVersionsSchema)) {
            return false;
        }
        final CustomResourceDefinitionSpecVersionsSchema __otherCasted = (CustomResourceDefinitionSpecVersionsSchema) __other;
        return Objects.equals(openAPIV3Schema, __otherCasted.openAPIV3Schema);
    }
}
