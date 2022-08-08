package io.yupiik.kubernetes.bindings.v1_20_9.v1alpha1;

import java.util.Objects;

public class PriorityLevelConfigurationSpec {
    private PriorityLevelConfigurationSpecLimited limited;
    private String type;

    public PriorityLevelConfigurationSpec() {
        // no-op
    }

    public PriorityLevelConfigurationSpec(final PriorityLevelConfigurationSpecLimited limited,
                                          final String type) {
        // no-op
    }

    public PriorityLevelConfigurationSpecLimited getLimited() {
        return limited;
    }

    public void setLimited(final PriorityLevelConfigurationSpecLimited limited) {
        this.limited = limited;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                limited,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityLevelConfigurationSpec)) {
            return false;
        }
        final PriorityLevelConfigurationSpec __otherCasted = (PriorityLevelConfigurationSpec) __other;
        return Objects.equals(limited, __otherCasted.limited) &&
            Objects.equals(type, __otherCasted.type);
    }
}
