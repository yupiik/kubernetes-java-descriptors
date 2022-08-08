package io.yupiik.kubernetes.bindings.v1_23_4;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<JobSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public JobSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<JobSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                               final String name,
                                                               final Boolean optional) {
        // no-op
    }

    public List<JobSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<JobSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (JobSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
