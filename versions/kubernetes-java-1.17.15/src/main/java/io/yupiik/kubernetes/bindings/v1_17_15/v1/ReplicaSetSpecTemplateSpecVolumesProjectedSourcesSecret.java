package io.yupiik.kubernetes.bindings.v1_17_15.v1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret {
    private List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret(final List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                                   final String name,
                                                                   final Boolean optional) {
        // no-op
    }

    public List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
