package io.yupiik.kubernetes.bindings.v1_15_3.v1beta2;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI {
    private List<DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items;

    public DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI(final List<DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        // no-op
    }

    public List<DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> getItems() {
        return items;
    }

    public void setItems(final List<DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPIItems> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI __otherCasted = (DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI) __other;
        return Objects.equals(items, __otherCasted.items);
    }
}
