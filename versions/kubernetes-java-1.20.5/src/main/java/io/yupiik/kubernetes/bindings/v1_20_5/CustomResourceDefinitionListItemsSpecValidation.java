package io.yupiik.kubernetes.bindings.v1_20_5;

import jakarta.json.JsonObject;
import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecValidation {
    private JsonObject openAPIV3Schema;

    public CustomResourceDefinitionListItemsSpecValidation() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecValidation(final JsonObject openAPIV3Schema) {
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
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecValidation)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecValidation __otherCasted = (CustomResourceDefinitionListItemsSpecValidation) __other;
        return Objects.equals(openAPIV3Schema, __otherCasted.openAPIV3Schema);
    }
}
