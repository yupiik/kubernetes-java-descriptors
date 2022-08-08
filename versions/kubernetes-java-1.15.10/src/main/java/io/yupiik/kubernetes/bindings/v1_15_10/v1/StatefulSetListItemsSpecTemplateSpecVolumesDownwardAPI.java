package io.yupiik.kubernetes.bindings.v1_15_10.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI {
    private Integer defaultMode;
    private List<StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> items;

    public StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI(final Integer defaultMode,
                                                                  final List<StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPIItems> items) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesDownwardAPI) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }
}
