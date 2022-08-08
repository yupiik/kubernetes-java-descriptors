package io.yupiik.kubernetes.bindings.v1_19_6;

import jakarta.json.JsonObject;
import java.util.Objects;

public class CustomResourceDefinitionListItemsSpecSubresources {
    private CustomResourceDefinitionListItemsSpecSubresourcesScale scale;
    private JsonObject status;

    public CustomResourceDefinitionListItemsSpecSubresources() {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecSubresources(final CustomResourceDefinitionListItemsSpecSubresourcesScale scale,
                                                             final JsonObject status) {
        // no-op
    }

    public CustomResourceDefinitionListItemsSpecSubresourcesScale getScale() {
        return scale;
    }

    public void setScale(final CustomResourceDefinitionListItemsSpecSubresourcesScale scale) {
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
        if (!(__other instanceof CustomResourceDefinitionListItemsSpecSubresources)) {
            return false;
        }
        final CustomResourceDefinitionListItemsSpecSubresources __otherCasted = (CustomResourceDefinitionListItemsSpecSubresources) __other;
        return Objects.equals(scale, __otherCasted.scale) &&
            Objects.equals(status, __otherCasted.status);
    }
}
