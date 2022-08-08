package io.yupiik.kubernetes.bindings.v1_22_9;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<JobListItemsSpecTemplateSpecVolumesDownwardAPIItems> items;

    public JobListItemsSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                          final List<JobListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<JobListItemsSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<JobListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesDownwardAPI __otherCasted = (JobListItemsSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
