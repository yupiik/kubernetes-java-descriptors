package io.yupiik.kubernetes.bindings.v1_21_5.v1;

import java.util.List;
import java.util.Objects;

public class PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector;
    private List<String> namespaces;
    private String topologyKey;

    public PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution(final PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                 final PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector,
                                                                                                 final List<String> namespaces,
                                                                                                 final String topologyKey) {
        // no-op
    }

    public PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(final List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(final String topologyKey) {
        this.topologyKey = topologyKey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelector,
                namespaceSelector,
                namespaces,
                topologyKey);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (PodListItemsSpecAffinityPodAntiAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
