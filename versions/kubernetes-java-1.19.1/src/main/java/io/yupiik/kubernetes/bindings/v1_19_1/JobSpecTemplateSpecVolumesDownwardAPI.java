package io.yupiik.kubernetes.bindings.v1_19_1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<JobSpecTemplateSpecVolumesDownwardAPIItems> items;

    public JobSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                 final List<JobSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<JobSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<JobSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesDownwardAPI __otherCasted = (JobSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
