package io.yupiik.kubernetes.bindings.v1_22_3.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret {
    private List<ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret(final List<ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                                            final String name,
                                                                            final Boolean optional) {
        // no-op
    }

    public List<ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
