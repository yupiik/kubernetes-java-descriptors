package io.yupiik.kubernetes.bindings.v1_14_4.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecVolumesProjectedSourcesSecret {
    private List<PodListItemsSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public PodListItemsSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public PodListItemsSpecVolumesProjectedSourcesSecret(final List<PodListItemsSpecVolumesProjectedSourcesSecretItems> items,
                                                         final String name,
                                                         final Boolean optional) {
        // no-op
    }

    public List<PodListItemsSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<PodListItemsSpecVolumesProjectedSourcesSecretItems> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final PodListItemsSpecVolumesProjectedSourcesSecret __otherCasted = (PodListItemsSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
