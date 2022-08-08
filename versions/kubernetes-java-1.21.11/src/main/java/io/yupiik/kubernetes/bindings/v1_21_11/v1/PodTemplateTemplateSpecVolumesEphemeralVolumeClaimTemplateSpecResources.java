package io.yupiik.kubernetes.bindings.v1_21_11.v1;

import java.util.Map;
import java.util.Objects;

public class PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources {
    private Map<String, String> limits;
    private Map<String, String> requests;

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources(final Map<String, String> limits,
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources __otherCasted = (PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources) __other;
        return Objects.equals(limits, __otherCasted.limits) &&
            Objects.equals(requests, __otherCasted.requests);
    }
}
