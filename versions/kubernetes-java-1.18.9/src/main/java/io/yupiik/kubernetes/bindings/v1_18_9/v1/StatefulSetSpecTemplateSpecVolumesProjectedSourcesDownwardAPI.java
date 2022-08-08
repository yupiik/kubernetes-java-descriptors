package io.yupiik.kubernetes.bindings.v1_18_9.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
