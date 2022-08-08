package io.yupiik.kubernetes.bindings.v1_22_4.v1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap {
    private List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items;
    private String name;
    private Boolean optional;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap(final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items,
                                                                                  final String name,
                                                                                  final Boolean optional) {
        // no-op
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> getItems() {
        return items;
    }

    public void setItems(final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMapItems> items) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
