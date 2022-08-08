package io.yupiik.kubernetes.bindings.v1_17_1;

import java.util.Map;
import java.util.Objects;

public class PodTemplateListItemsTemplateSpecContainersResources {
    private Map<String, String> limits;
    private Map<String, String> requests;

    public PodTemplateListItemsTemplateSpecContainersResources() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecContainersResources(final Map<String, String> limits,
                                                               final Map<String, String> requests) {
        // no-op
    }

    public Map<String, String> getLimits() {
        return limits;
    }

    public void setLimits(final Map<String, String> limits) {
        this.limits = limits;
    }

    public Map<String, String> getRequests() {
        return requests;
    }

    public void setRequests(final Map<String, String> requests) {
        this.requests = requests;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                limits,
                requests);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateListItemsTemplateSpecContainersResources)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecContainersResources __otherCasted = (PodTemplateListItemsTemplateSpecContainersResources) __other;
        return Objects.equals(limits, __otherCasted.limits) &&
            Objects.equals(requests, __otherCasted.requests);
    }
}
