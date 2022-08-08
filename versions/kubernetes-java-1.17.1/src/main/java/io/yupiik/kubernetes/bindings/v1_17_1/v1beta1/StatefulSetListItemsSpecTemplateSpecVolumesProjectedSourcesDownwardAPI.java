package io.yupiik.kubernetes.bindings.v1_17_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
