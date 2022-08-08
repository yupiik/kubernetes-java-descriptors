package io.yupiik.kubernetes.bindings.v1_18_8.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecVolumesProjectedSourcesSecret {
    private List<JobSpecTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public JobSpecTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesProjectedSourcesSecret(final List<JobSpecTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                            final String name,
                                                            final Boolean optional) {
        // no-op
    }

    public List<JobSpecTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<JobSpecTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (JobSpecTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
