package io.yupiik.kubernetes.bindings.v1_22_7.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems> items;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                                    final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
