package io.yupiik.kubernetes.bindings.v1_20_10.v1;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret {
    private List<ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret(final List<ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                                              final String name,
                                                                              final Boolean optional) {
        // no-op
    }

    public List<ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
