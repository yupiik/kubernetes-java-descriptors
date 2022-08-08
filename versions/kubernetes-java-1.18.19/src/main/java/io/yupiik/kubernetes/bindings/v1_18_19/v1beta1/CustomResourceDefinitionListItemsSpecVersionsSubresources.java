package io.yupiik.kubernetes.bindings.v1_18_19.v1beta1;

import jakarta.json.JsonObject;
import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecVersionsSubresources {
    private CustomResourceDefinitionListItemsSpecVersionsSubresourcesScale scale;
    private JsonObject status;

    public CustomResourceDefinitionListItemsSpecVersionsSubresources() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecVersionsSubresources(final CustomResourceDefinitionListItemsSpecVersionsSubresourcesScale scale,
                                                                     final JsonObject status) {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecVersionsSubresourcesScale getScale() {
        return scale;
    }

    public void setScale(final CustomResourceDefinitionListItemsSpecVersionsSubresourcesScale scale) {
        this.scale = scale;
    }

    public JsonObject getStatus() {
        return status;
    }

    public void setStatus(final JsonObject status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                scale,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecVersionsSubresources)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecVersionsSubresources __otherCasted = (CustomResourceDefinitionListItemsSpecVersionsSubresources) __other;
        return Objects.equals(scale, __otherCasted.scale) &&
            Objects.equals(status, __otherCasted.status);
    }
}
