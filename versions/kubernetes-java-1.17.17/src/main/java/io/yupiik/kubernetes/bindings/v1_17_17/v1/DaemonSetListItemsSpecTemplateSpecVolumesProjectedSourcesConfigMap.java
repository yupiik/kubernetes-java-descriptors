package io.yupiik.kubernetes.bindings.v1_17_17.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                              final String name,
                                                                              final Boolean optional) {
        // no-op
    }

    public List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
