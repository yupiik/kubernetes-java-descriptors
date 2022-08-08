package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.Objects;

public class PriorityLevelConfigurationListItemsSpec {
    private PriorityLevelConfigurationListItemsSpecLimited limited;
    private String type;

    public PriorityLevelConfigurationListItemsSpec() {
        // no-op
    }

    public PriorityLevelConfigurationListItemsSpec(final PriorityLevelConfigurationListItemsSpecLimited limited,
                                                   final String type) {
        // no-op
    }

    public PriorityLevelConfigurationListItemsSpecLimited getLimited() {
        return limited;
    }

    public void setLimited(final PriorityLevelConfigurationListItemsSpecLimited limited) {
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
        if (!(__other instanceof PriorityLevelConfigurationListItemsSpec)) {
            return false;
        }
        final PriorityLevelConfigurationListItemsSpec __otherCasted = (PriorityLevelConfigurationListItemsSpec) __other;
        return Objects.equals(limited, __otherCasted.limited) &&
            Objects.equals(type, __otherCasted.type);
    }
}
