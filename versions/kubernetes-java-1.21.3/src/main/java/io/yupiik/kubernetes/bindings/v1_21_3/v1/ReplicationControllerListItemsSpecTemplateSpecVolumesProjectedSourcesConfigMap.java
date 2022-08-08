package io.yupiik.kubernetes.bindings.v1_21_3.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                                          final String name,
                                                                                          final Boolean optional) {
        // no-op
    }

    public List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
