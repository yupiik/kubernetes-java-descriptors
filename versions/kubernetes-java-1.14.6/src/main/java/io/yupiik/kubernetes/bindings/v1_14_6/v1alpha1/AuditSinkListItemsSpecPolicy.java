package io.yupiik.kubernetes.bindings.v1_14_6.v1alpha1;

import java.util.List;
import java.util.Objects;

public class AuditSinkListItemsSpecPolicy {
    private String level;
    private List<String> stages;

    public AuditSinkListItemsSpecPolicy() {
        // no-op
    }

    public AuditSinkListItemsSpecPolicy(final String level,
                                        final List<String> stages) {
        // no-op
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(final String level) {
        this.level = level;
    }

    public List<String> getStages() {
        return stages;
    }

    public void setStages(final List<String> stages) {
        this.stages = stages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                level,
                stages);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AuditSinkListItemsSpecPolicy)) {
            return false;
        }
        final AuditSinkListItemsSpecPolicy __otherCasted = (AuditSinkListItemsSpecPolicy) __other;
        return Objects.equals(level, __otherCasted.level) &&
            Objects.equals(stages, __otherCasted.stages);
    }
}
