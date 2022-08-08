package io.yupiik.kubernetes.bindings.v1_15_12;

import java.util.List;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap(final List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                            final String name,
                                                                            final Boolean optional) {
        // no-op
    }

    public List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
