package io.yupiik.kubernetes.bindings.v1_22_5.v1;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution {
    private JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector;
    private JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector;
    private List<String> namespaces;
    private String topologyKey;

    public JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution(final JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector,
                                                                                                         final JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector,
                                                                                                         final List<String> namespaces,
                                                                                                         final String topologyKey) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(final JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionLabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    public JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(final JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecutionNamespaceSelector namespaceSelector) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution __otherCasted = (JobListItemsSpecTemplateSpecAffinityPodAffinityRequiredDuringSchedulingIgnoredDuringExecution) __other;
        return Objects.equals(labelSelector, __otherCasted.labelSelector) &&
            Objects.equals(namespaceSelector, __otherCasted.namespaceSelector) &&
            Objects.equals(namespaces, __otherCasted.namespaces) &&
            Objects.equals(topologyKey, __otherCasted.topologyKey);
    }
}
