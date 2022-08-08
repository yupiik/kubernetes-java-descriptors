package io.yupiik.kubernetes.bindings.v1_17_17.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<StatefulSetSpecTemplateSpecVolumesDownwardAPIItems> items;

    public StatefulSetSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                         final List<StatefulSetSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<StatefulSetSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<StatefulSetSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesDownwardAPI __otherCasted = (StatefulSetSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
