package io.yupiik.kubernetes.bindings.v1_19_1.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecVolumesConfigMap {
    private Integer defaultMode;
    private List<PodListItemsSpecVolumesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public PodListItemsSpecVolumesConfigMap() {
        // no-op
    }

    public PodListItemsSpecVolumesConfigMap(final Integer defaultMode,
                                            final List<PodListItemsSpecVolumesConfigMapItems> items,
                                            final String name,
                                            final Boolean optional) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodListItemsSpecVolumesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<PodListItemsSpecVolumesConfigMapItems> items) {
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
                defaultMode,
                items,
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecVolumesConfigMap)) {
            return false;
        }
        final PodListItemsSpecVolumesConfigMap __otherCasted = (PodListItemsSpecVolumesConfigMap) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
