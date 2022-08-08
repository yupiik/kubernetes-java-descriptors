package io.yupiik.kubernetes.bindings.v1_18_12;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret {
    private List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecretItems> items;
    private String name;
    private Boolean optional;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret(final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecretItems> items,
                                                                               final String name,
                                                                               final Boolean optional) {
        // no-op
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecretItems> items) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret) __other;
        return Objects.equals(items, __otherCasted.items) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }
}
