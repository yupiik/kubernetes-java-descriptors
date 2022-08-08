package io.yupiik.kubernetes.bindings.v1_19_13;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                      final String name,
                                                                      final Boolean optional) {
        // no-op
    }

    public List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
