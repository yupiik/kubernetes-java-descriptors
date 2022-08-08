package io.yupiik.kubernetes.bindings.v1_21_6.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesConfigMap {
    private Integer defaultMode;
    private List<ReplicationControllerSpecTemplateSpecVolumesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public ReplicationControllerSpecTemplateSpecVolumesConfigMap() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesConfigMap(final Integer defaultMode,
                                                                 final List<ReplicationControllerSpecTemplateSpecVolumesConfigMapItems> items,
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

    public List<ReplicationControllerSpecTemplateSpecVolumesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicationControllerSpecTemplateSpecVolumesConfigMapItems> items) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesConfigMap)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesConfigMap __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesConfigMap) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
