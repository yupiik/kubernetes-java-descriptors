package io.yupiik.kubernetes.bindings.v1_14_0.v1beta2;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesConfigMap {
    private Integer defaultMode;
    private List<StatefulSetListItemsSpecTemplateSpecVolumesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public StatefulSetListItemsSpecTemplateSpecVolumesConfigMap() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesConfigMap(final Integer defaultMode,
                                                                final List<StatefulSetListItemsSpecTemplateSpecVolumesConfigMapItems> items,
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

    public List<StatefulSetListItemsSpecTemplateSpecVolumesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<StatefulSetListItemsSpecTemplateSpecVolumesConfigMapItems> items) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesConfigMap)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesConfigMap __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesConfigMap) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
