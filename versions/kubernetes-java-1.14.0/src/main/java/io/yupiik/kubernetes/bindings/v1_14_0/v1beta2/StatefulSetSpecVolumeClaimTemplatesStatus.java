package io.yupiik.kubernetes.bindings.v1_14_0.v1beta2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class StatefulSetSpecVolumeClaimTemplatesStatus {
    private List<String> accessModes;
    private Map<String, String> capacity;
    private List<StatefulSetSpecVolumeClaimTemplatesStatusConditions> conditions;
    private String phase;

    public StatefulSetSpecVolumeClaimTemplatesStatus() {
        // no-op
    }

    public StatefulSetSpecVolumeClaimTemplatesStatus(final List<String> accessModes,
                                                     final Map<String, String> capacity,
                                                     final List<StatefulSetSpecVolumeClaimTemplatesStatusConditions> conditions,
                                                     final String phase) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public Map<String, String> getCapacity() {
        return capacity;
    }

    public void setCapacity(final Map<String, String> capacity) {
        this.capacity = capacity;
    }

    public List<StatefulSetSpecVolumeClaimTemplatesStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<StatefulSetSpecVolumeClaimTemplatesStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accessModes,
                capacity,
                conditions,
                phase);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpecVolumeClaimTemplatesStatus)) {
            return false;
        }
        final StatefulSetSpecVolumeClaimTemplatesStatus __otherCasted = (StatefulSetSpecVolumeClaimTemplatesStatus) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(capacity, __otherCasted.capacity) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(phase, __otherCasted.phase);
    }
}
