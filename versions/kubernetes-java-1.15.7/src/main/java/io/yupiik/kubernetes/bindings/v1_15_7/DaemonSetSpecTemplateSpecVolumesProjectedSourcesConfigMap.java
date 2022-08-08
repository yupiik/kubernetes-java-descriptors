package io.yupiik.kubernetes.bindings.v1_15_7;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                     final String name,
                                                                     final Boolean optional) {
        // no-op
    }

    public List<DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
