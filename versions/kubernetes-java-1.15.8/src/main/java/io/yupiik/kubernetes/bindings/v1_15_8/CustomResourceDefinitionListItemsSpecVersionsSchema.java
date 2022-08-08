package io.yupiik.kubernetes.bindings.v1_15_8;

import jakarta.json.JsonObject;
import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecVersionsSchema {
    private JsonObject openAPIV3Schema;

    public CustomResourceDefinitionListItemsSpecVersionsSchema() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecVersionsSchema(final JsonObject openAPIV3Schema) {
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
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecVersionsSchema)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecVersionsSchema __otherCasted = (CustomResourceDefinitionListItemsSpecVersionsSchema) __other;
        return Objects.equals(openAPIV3Schema, __otherCasted.openAPIV3Schema);
    }
}
