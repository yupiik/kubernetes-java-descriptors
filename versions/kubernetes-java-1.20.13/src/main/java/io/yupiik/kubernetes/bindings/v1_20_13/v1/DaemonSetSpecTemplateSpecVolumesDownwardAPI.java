package io.yupiik.kubernetes.bindings.v1_20_13.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<DaemonSetSpecTemplateSpecVolumesDownwardAPIItems> items;

    public DaemonSetSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                       final List<DaemonSetSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<DaemonSetSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<DaemonSetSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesDownwardAPI __otherCasted = (DaemonSetSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
