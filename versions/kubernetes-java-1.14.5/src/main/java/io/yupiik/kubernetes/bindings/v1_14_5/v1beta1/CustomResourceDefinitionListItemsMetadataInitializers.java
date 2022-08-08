package io.yupiik.kubernetes.bindings.v1_14_5.v1beta1;

import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionListItemsMetadataInitializers {
    private List<CustomResourceDefinitionListItemsMetadataInitializersPending> pending;
    private CustomResourceDefinitionListItemsMetadataInitializersResult result;

    public CustomResourceDefinitionListItemsMetadataInitializers() {
        // no-op
    }

    public CustomResourceDefinitionListItemsMetadataInitializers(final List<CustomResourceDefinitionListItemsMetadataInitializersPending> pending,
                                                                 final CustomResourceDefinitionListItemsMetadataInitializersResult result) {
        // no-op
    }

    public List<CustomResourceDefinitionListItemsMetadataInitializersPending> getPending() {
        return pending;
    }

    public void setPending(final List<CustomResourceDefinitionListItemsMetadataInitializersPending> pending) {
        this.pending = pending;
    }

    public CustomResourceDefinitionListItemsMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CustomResourceDefinitionListItemsMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionListItemsMetadataInitializers)) {
            return false;
        }
        final CustomResourceDefinitionListItemsMetadataInitializers __otherCasted = (CustomResourceDefinitionListItemsMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
